package byui.cit260.zTakeover.view;

import java.util.Scanner;

public class MainMenuView {
    private final String MENU = "\n"
            +"\n-------------------------"
            +"\n|Main Menu              |"
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
        }while (selection!='Q');
    }

    private String getInput() {
            
        boolean valid = false;
        String userInput = "";
        //Input stream
        Scanner input = new Scanner(System.in);
        
        while(valid==false){
            //Prompt user for name
            System.out.println("Enter Selection: ");
            
            //Get name and trim off blanks
            userInput = input.nextLine();
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
                this.SaveGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'Q':
                return;
            default:
                System.out.println("Invalid entry, try again.");
        }
    }

    private void startNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void loadGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void SaveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
