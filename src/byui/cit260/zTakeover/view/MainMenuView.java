package byui.cit260.zTakeover.view;

import byui.cit260.zTakeover.control.*;
import byui.cit260.zTakeover.exception.ActionException;
import byui.cit260.zTakeover.exception.MapControlException;
import byui.cit260.zTakeover.model.Player;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import zombietakeover.ZombieTakeover;

public class MainMenuView extends View{
    public MainMenuView(){
        super("\n"
            +"\n-------------------------"
            +"\n|      Main Menu        |"
            +"\n-------------------------"
            +"\nN-New Game"
            +"\nL-Load Game"
            +"\nS-Save Game"
            +"\nH-Help Menu"
            +"\nQ-Quit Game"
            +"\n-------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        String value=(String)obj;
        value=value.toUpperCase();
        char selection=value.charAt(0);
        switch (selection){
            case 'N':
        {
            try {
                this.startNewGame();
            } catch (ActionException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case 'L':
                this.loadGame();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'H':
                this.displayHelpMenu();
                this.display();
                break;
            case 'Q':
                return true;
            default:
                this.console.println("***Invalid entry, try again.***");
                break;
        }
        return false;
    }

    private void startNewGame() throws ActionException {
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
        try{
            GameControl.createNewGame(ZombieTakeover.getPlayer());
        }catch (MapControlException me){
            this.console.println(me.getMessage());
        }
        
        //Display game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void loadGame() {
        this.console.println("\n\nEnter the file name of the save file:");
        String filePath = this.getInput() + ".txt";
        try{
            GameControl.loadGame(filePath);
        }catch(Exception e){
            ErrorView.display("MainMenuView", e.getMessage());
        }
        this.console.println("Game loaded.\n");
        //Display game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void saveGame() {
        this.console.println("\n\nEnter the filename for where to save the game:");
        String fileName = this.getInput() + ".txt";
        
        try{
            GameControl.saveGame(ZombieTakeover.getCurrentGame(),fileName);
        }catch(Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void displayHelpMenu() {
         //Display help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
    private void displayWelcomeMessage(Player player) {
        this.console.println("\n\n==========================================");
        this.console.println("\tWelcome to the game "+ player.getName());
        this.console.println("\tWe hope you have fun.");
        this.console.println("==========================================");
    }
    
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

    
}
