package byui.cit260.zTakeover.view;

import byui.cit260.zTakeover.control.GameControl;
import byui.cit260.zTakeover.exception.MapControlException;
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
                return true;
            default:
                this.console.println("***Invalid entry, try again.***");
                break;
        }
        return false;
    }

    private void startNewGame() {
        //start a new game
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
        this.console.println("*** loadGame function called ***");    
    }

    private void saveGame() {
        this.console.println("*** saveGame function called ***");
    }

    private void displayHelpMenu() {
         //Display help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
}
