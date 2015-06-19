/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.view;

/**
 *
 * @author The King's Wit
 */
public class HelpMenuView extends View{
    public HelpMenuView(){
        super("\n"
            +"\n-------------------------"
            +"\n|      Help Menu        |"
            +"\n-------------------------"
            +"\nG-Goal of game"
            +"\nM-Moving"
            +"\nP-Pick up items"
            +"\nC-Combat Help"
            +"\nB-Back"
            +"\n-------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        String value=(String)obj;
        value=value.toUpperCase();
        char selection=value.charAt(0);
        switch (selection){
            case 'G':
                System.out.println("Survive in the harsh environment of the city and defeat the hazmat team to win.");
                break;
            case 'M':
                System.out.println("To move the character, use the following commands:"
                                +"\nNorth"
                                +"\nEast"
                                +"\nSouth"
                                +"\nWest"
                                +"\nThese commands will move your character the direction typed.");
                break;
            case 'P':
                System.out.println("Use the grab command with the item name to pick items up. Item names will be displayed in the area with that item.");
                break;
            case 'C':
                System.out.println("Combat is done in the encounters. A list of items and abilities will diplayed during combat that you can choose from.");
                break;
            case 'B':
                return false;
            default:
                System.out.println("***Invalid entry, try again.***");
                break;
        }
        return true;
    }
    
}
