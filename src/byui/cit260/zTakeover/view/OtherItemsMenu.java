/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.view;

import byui.cit260.zTakeover.exception.ActionException;
import byui.cit260.zTakeover.model.FoundObjects;

/**
 *
 * @author Onsite
 */
public class OtherItemsMenu extends View {
           
    public OtherItemsMenu(){
        super("\n"
            +"\n---------------------------"
            +"\n|        Other Items       |"
            +"\n---------------------------"
            +"\nChoose an item that you"
            +"\nwould like to know about."
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
                this.displayDescription('s');
                break;
            case 'f':
                this.displayDescription('f');
                break;
            case 'g':
                this.displayDescription('g');
                break;
            case 'c':
                this.displayDescription('c');
                break;
            case 'r':
                this.displayDescription('r');
                break;
            case 'l':
                this.displayDescription('l');
                break;
            case 'b':
                this.displayDescription('b');
                break;
            case 'd':
                this.displayDescription('d');
                break;
            case 'm':
                this.displayDescription('m');
                break;
            case 'e':
                this.displayDescription('e');
                break;
            case 'q':
                return true;
            default:
                this.console.println("***Invalid entry, try again.***");
                break;
        }
        return false;
    }
    
    public void displayDescription(char des){
        switch(des){
            case 's':
                this.console.println(FoundObjects.STAFF.getDescription());
                break;
            case 'f':
                this.console.println(FoundObjects.FIRE_EXTINGUISHER.getDescription());
                break;
            case 'g':
                this.console.println(FoundObjects.BOTTLED_GHOST.getDescription());
                break;
            case 'c':
                this.console.println(FoundObjects.CATFISH.getDescription());
                break;
            case 'r':
                this.console.println(FoundObjects.RABBITS_FOOT.getDescription());
                break;
            case 'l':
                this.console.println(FoundObjects.LEOPARD_FUR.getDescription());
                break;
            case 'b':
                this.console.println(FoundObjects.BEAR_CLAW.getDescription());
                break;
            case 'd':
                this.console.println(FoundObjects.BARBIE_DOLL.getDescription());
                break;
            case 'm':
                this.console.println(FoundObjects.MARBLES.getDescription());
                break;
            case 'e':
                this.console.println(FoundObjects.ENCYCLOPEDIA.getDescription());
                break;
            default:
                this.console.println("***Invalid entry, try again.***");
                break;
        }
    }
    
}

