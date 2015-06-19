package byui.cit260.zTakeover.view;

import byui.cit260.zTakeover.control.GameControl;
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
                this.display();
                break;
            case 'Q':
                return false;
            default:
                System.out.println("***Invalid entry, try again.***");
                break;
        }
        return true;
    }

    private void startNewGame() {
        //start a new game
        GameControl.createNewGame(ZombieTakeover.getPlayer());
        
        //Display game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
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
        helpMenu.display();
    }
    
}
