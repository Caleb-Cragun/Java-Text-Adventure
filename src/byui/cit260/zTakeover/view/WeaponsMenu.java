/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.view;

/**
 *
 * @author Onsite
 */
public class WeaponsMenu extends View {
           
    public WeaponsMenu(){
        super("\n"
            +"\n-------------------------"
            +"\n|        Weapons        |"
            +"\n-------------------------"
            +"\nChoose a weapon that you"
            +"\nwould like information on."
            +"\n"
            +"\n"
            +"\n"
            +"\n"
            +"\n"
            +"\n"
            +"\n"
            +"\n"
            +"\nE - Exit Weapons Menu"
            +"\n-------------------------");
    }
    
    

    @Override
    public boolean doAction(Object obj) {
        String value=(String)obj;
        value=value.toLowerCase();
        char selection=value.charAt(0);
        
        switch (selection){
            case 'b':
                break;
            case 'h':
                break;
            case 'g':
                break;
            case 'e':
                return true;
            default:
                System.out.println("***Invalid entry, try again.***");
                break;
        }
        return false;
    }
}