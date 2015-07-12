/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.view;

import byui.cit260.zTakeover.exception.ActionException;

/**
 *
 * @author Onsite
 */
public class OtherItemsMenu extends View {
           
    public OtherItemsMenu(){
        super("\n"
            +"\n-------------------------"
            +"\n|       Other Items      |"
            +"\n-------------------------"
            +"\nChoose an item that you"
            +"\nwould like to consume."
            +"\nS - Staff"
            +"\nF - Fire Extinguisher"
            +"\nG - Bottled Ghost"
            +"\nC - Catfish"
            +"\nR - Rabbit's Foot"
            +"\nL - Leopard Fur"
            +"\nB - Bear Claw Doughnut"
            +"\nD - Barbie Doll"
            +"\nM - Marbles"
            +"\nE - Encyclopedia"
            +"\nQ - Quit Other Items Menu"
            +"\n-------------------------");
    }
    
    

    @Override
    public boolean doAction(Object obj) {
        String value=(String)obj;
        value=value.toLowerCase();
        char selection=value.charAt(0);
        
        switch (selection){
            case 's':
                this.learnAbility();
                break;
            case 'f':
                this.learnAbility();
                break;
            case 'g':
                this.learnAbility();
                break;
            case 'c':
                this.learnAbility();
                break;
            case 'r':
                this.learnAbility();
                break;
            case 'l':
                this.learnAbility();
                break;
            case 'b':
                this.learnAbility();
                break;
            case 'd':
                this.learnAbility();
                break;
            case 'm':
                this.learnAbility();
                break;
            case 'e':
                this.learnAbility();
                break;
            case 'q':
                return true;
            default:
                this.console.println("***Invalid entry, try again.***");
                break;
        }
        return false;
    }

/***********************************************************************************    
    Stub Function for learnAblity()
***********************************************************************************/
    
    private void learnAbility() {
        try{
            learnNewAbility();
        }catch (Throwable n){
            this.console.println(n.getMessage());
        }
    }

    private void learnNewAbility(){
        this.console.println("*** learnAbility function called ***");
    }
}

