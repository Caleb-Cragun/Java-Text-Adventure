/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.view;
import byui.cit260.zTakeover.control.ProgramControl;
import byui.cit260.zTakeover.model.Player;
import java.util.*;

public class StartProgramView {
    public void startProgram(){
        //Displays the banner screen
        this.displayBanner();
        //Get the player's name
        String playerName = this.getPlayerName();
        //Get character class
        String className = this.getClassName();
        //Create gameCharacter
        Player player = ProgramControl.createPlayer(playerName);
        //Display welcome message
        this.displayWelcomeMessage(player);
        //Display the MainMenu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }

    private void displayBanner() {
        System.out.println("***************************************");
        System.out.println("* Welcome to Zombie Takeover a game   *"
                        +"\n* where you attempt to survive as a   *"
                        +"\n* zombie in a city without dying at   *"
                        +"\n* the hands of the remaining citizens *"
                        +"\n* or the other monsters that now roam *"
                        +"\n* the deserted streets of the town.   *");
        System.out.println("*                                     *"
                        +"\n* You will explore the town for items *"
                        +"\n* which will help you to defeat the   *"
                        +"\n* people and creatures you will find. *"
                        +"\n* Some items will give you abilities  *"
                        +"\n* when you consume them, and will     *"
                        +"\n* allow you to better combat the      *"
                        +"\n* harsh environment you are now in.   *");
        System.out.println("*                                     *"
                        +"\n* Good luck and try not to die again  *"
                        +"\n***************************************");
    }

    public String getPlayerName() {
        //Indicates if a name has been retrieved
        boolean valid = false;
        String playerName = "";
        //Input stream
        Scanner input = new Scanner(System.in);
        
        while(valid==false){
            //Prompt user for name
            System.out.println("Enter player name below:");
            
            //Get name and trim off blanks
            playerName = input.nextLine();
            
            
            //Checks to see if the name is valid
            if (playerName.length()<2){
                System.out.println("Invalid name - name must not be blank");
            }else{
                valid=true;
            }
        }
        return playerName;
    }

    public String getClassName() {
        String className = "";
        String selection = "";
        boolean valid=false;
        //Input stream
        Scanner input = new Scanner(System.in);
        System.out.println("Select class: "
                        +"\nA-Monk "
                        +"\nB-Swashbuckler "
                        +"\nC-Samurai");
        selection = input.nextLine();
        do{
        switch(selection){
            case "a":
            case "A":
                className="Monk";
                valid=true;
                break;
            case "b":
            case "B":
                className="Swashbuckler";
                valid=true;
                break;
            case "c":
            case "C":
                className="Samurai";
                valid=true;
                break;
            default:
                System.out.println("Invalid class. Please select a valid class.");
        }
        }while(valid!=true);
        System.out.println(className);
        return className;
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n==========================================");
        System.out.println("\tWelcome to the game "+ player.getName());
        System.out.println("\tWe hope you have fun.");
        System.out.println("==========================================");
    }
}
