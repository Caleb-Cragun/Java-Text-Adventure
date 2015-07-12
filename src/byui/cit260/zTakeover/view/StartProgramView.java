/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.view;
import byui.cit260.zTakeover.control.ProgramControl;
import byui.cit260.zTakeover.model.Player;
import java.io.*;
import zombietakeover.ZombieTakeover;

public class StartProgramView {
    public void startProgram(){
        //Displays the banner screen
        this.displayBanner();
        //Get the player's name
        String playerName = this.getPlayerName();
        try{
           Player player = ProgramControl.createPlayer(playerName); 
        }catch (Throwable me){
            this.console.println(me.getMessage());
        }
        //Create gameCharacter
        Player player = ProgramControl.createPlayer(playerName);
        //Display welcome message
        this.displayWelcomeMessage(player);
        //Display the MainMenu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    private void displayBanner() {
        this.console.println("***************************************");
        this.console.println("* Welcome to Zombie Takeover a game   *"
                        +"\n* where you attempt to survive as a   *"
                        +"\n* zombie in a city without dying at   *"
                        +"\n* the hands of the remaining citizens *"
                        +"\n* or the other monsters that now roam *"
                        +"\n* the deserted streets of the town.   *");
        this.console.println("*                                     *"
                        +"\n* You will explore the town for items *"
                        +"\n* which will help you to defeat the   *"
                        +"\n* people and creatures you will find. *"
                        +"\n* Some items will give you abilities  *"
                        +"\n* when you consume them, and will     *"
                        +"\n* allow you to better combat the      *"
                        +"\n* harsh environment you are now in.   *");
        this.console.println("*                                     *"
                        +"\n* Good luck and try not to die again  *"
                        +"\n***************************************");
    }

    protected final BufferedReader keyboard = ZombieTakeover.getInFile();
    protected final PrintWriter console = ZombieTakeover.getOutFile();
    
    public String getPlayerName() {
        //Indicates if a name has been retrieved
        boolean valid = false;
        String playerName = "";
        
        try {
        while(valid==false){
            
                //Prompt user for name
                this.console.println("Enter player name below:");
                
                //Get name and trim off blanks
                playerName = this.keyboard.readLine();
                
                
                //Checks to see if the name is valid
                if (playerName.length()<2){
                    this.console.println("Invalid name - name must not be blank");
                }else{
                    valid=true;
                }
            } 
        }catch (IOException ex) {
                this.console.println("Error reading input: " + ex.getMessage());
        }
        return playerName;
    }

    private void displayWelcomeMessage(Player player) {
        this.console.println("\n\n==========================================");
        this.console.println("\tWelcome to the game "+ player.getName());
        this.console.println("\tWe hope you have fun.");
        this.console.println("==========================================");
    }
}
