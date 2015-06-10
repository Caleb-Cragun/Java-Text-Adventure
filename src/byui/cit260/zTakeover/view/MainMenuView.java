package byui.cit260.zTakeover.view;

import byui.cit260.zTakeover.control.GameControl;
import java.util.Scanner;
import zombietakeover.ZombieTakeover;

public class MainMenuView {
    private final String MENU = "\n"
            +"\n-------------------------"
            +"\n|      Main Menu        |"
            +"\n-------------------------"
            +"\nN-New Game"
            +"\nL-Load Game"
            +"\nS-Save Game"
            +"\nH-Help Menu"
            +"\nQ-Quit Game"
            +"\n-------------------------";
    
    void displayMenu() {
        char selection = ' ';
        do{
            //Displays the main menu
            System.out.println(MENU);
            
            //Get users input
            String input = this.getInput();
            //Get first character of string
            selection = input.charAt(0);
            
            //Do action based on selection
            this.doAction(selection);
        } while (selection!='Q');
    }

    private String getInput() {
            
        boolean valid = false;
        String userInput = "";
        //Input stream
        Scanner input = new Scanner(System.in);
        
        while(valid!=true){
            //Prompt user for name
            System.out.println("Enter Selection: ");
            
            //Get name and trim off blanks
            userInput = input.nextLine();
            userInput = userInput.toUpperCase();
            userInput = userInput.trim();
            
            
            //Checks to see if the name is valid
            if (userInput.length()==0){
                System.out.println("Invalid input - try another option");
            }else{
                valid=true;
            }
        }
        return userInput;
    }

    private void doAction(char selection) {
        switch (selection){
            case 'N':
                this.startNewGame();
                break;
            case 'L':
                this.loadGame();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'H':
                this.displayHelpMenu();
                this.displayMenu();
                break;
            case 'Q':
                return;
            default:
                System.out.println("***Invalid entry, try again.***");
                break;
        }
    }

    private void startNewGame() {
        //start a new game
        GameControl.createNewGame(ZombieTakeover.getPlayer());
        
        //Display game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void loadGame() {
        System.out.println("*** loadGame function called ***");    
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void displayHelpMenu() {
         //Display help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }
    
}
