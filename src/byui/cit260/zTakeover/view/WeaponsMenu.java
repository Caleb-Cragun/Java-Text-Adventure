/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.view;

import byui.cit260.zTakeover.exception.ActionException;
import byui.cit260.zTakeover.model.Weapons;

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
            +"\nS - Shovel"
            +"\nF - Fist"
            +"\nB - Baseball Bat"
            +"\nK - Brass Knuckles"
            +"\nG - Golf Club"
            +"\nL - Bludgeon"
            +"\nC - Comando Knife"
            +"\nE - Exit Weapons Menu"
            +"\n-------------------------");
    }
    
    

    @Override
    public boolean doAction(Object obj) {
        String value=(String)obj;
        value=value.toLowerCase();
        char selection=value.charAt(0);
        try{
        switch (selection){
            case 's':
                descShovel();
                break;
            case 'f':
                descFist();
                break;
            case 'b':
                descBat();
                break;
            case 'k':
                descKnu();
                break;
            case 'g':
                descGolf();
                break;
            case 'l':descBlu();
                     break;
            case 'c':
                descKni();
                break;
            case 'e':
                return true;
            default:
                this.console.println("***Invalid entry, try again.***");
                break;
        }
        } catch (ActionException ex) {
                this.console.println(ex.getMessage());
        }
        return false;
    }

    private void descShovel() throws ActionException{
        if (Weapons.SHOVEL == null){
            throw new ActionException("Unknown Power");
        }else{
            this.console.println("Power: " + Weapons.SHOVEL);
        }
    }

    private void descFist() throws ActionException {
        if (Weapons.FIST == null){
            throw new ActionException("Unknown Power");
        }else{
            this.console.println("Power: " + Weapons.FIST);
        }
    }

    private void descBat() throws ActionException {
        if (Weapons.BAT == null){
            throw new ActionException("Unknown Power");
        }else{
            this.console.println("Power: " + Weapons.BAT);
        }
    }

    private void descKnu() throws ActionException {
        if (Weapons.BRASS_KNUCKLES == null){
            throw new ActionException("Unknown Power");
        }else{
           this.console.println("Power: " + Weapons.BRASS_KNUCKLES);
        }
    }

    private void descGolf() throws ActionException {
        if (Weapons.GOLF_CLUB == null){
            throw new ActionException("Unknown Power");
        }else{
            this.console.println("Power: " + Weapons.GOLF_CLUB);
        }
    }

    private void descBlu() throws ActionException {
        if (Weapons.BLUDGEON == null){
            throw new ActionException("Unknown Power");
        }else{
            this.console.println("Power: " + Weapons.BLUDGEON);
        }
    }

    private void descKni() throws ActionException {
        if (Weapons.BOWIE_KNIFE == null){
            throw new ActionException("Unknown Power");
        }else{
           this.console.println("Power: " + Weapons.BOWIE_KNIFE);
        }
    }
}