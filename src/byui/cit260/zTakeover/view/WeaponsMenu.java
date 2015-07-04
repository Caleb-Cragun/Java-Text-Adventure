/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.view;

import byui.cit260.zTakeover.exception.ActionException;
import byui.cit260.zTakeover.model.Weapons;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        switch (selection){
            case 's':
        {
            try {
                descShovel();
            } catch (ActionException ex) {
               System.out.println(ex.getMessage());
            }
        }
                break;
            case 'f':
        {
            try {
                descFist();
            } catch (ActionException ex) {
               System.out.println(ex.getMessage());
            }
        }
                break;
            case 'b':
        {
            try {
                descBat();
            } catch (ActionException ex) {
               System.out.println(ex.getMessage());
            }
        }
                break;
            case 'k':
        {
            try {
                descKnu();
            } catch (ActionException ex) {
                System.out.println(ex.getMessage());
            }
        }
                break;
            case 'g':
        {
            try {
                descGolf();
            } catch (ActionException ex) {
                System.out.println(ex.getMessage());
            }
        }
                break;
            case 'l':
        {
            try {
                descBlu();
            } catch (ActionException ex) {
                System.out.println(ex.getMessage());
            }
        }
                break;
            case 'c':
        {
            try {
                descKni();
            } catch (ActionException ex) {
                System.out.println(ex.getMessage());
            }
        }
                break;
            case 'e':
                return true;
            default:
                System.out.println("***Invalid entry, try again.***");
                break;
        }
        return false;
    }

    private void descShovel() throws ActionException{
        if (Weapons.SHOVEL == null){
            throw new ActionException("Unknown Power");
        }else{
            System.out.println("Power: " + Weapons.SHOVEL);
        }
    }

    private void descFist() throws ActionException {
        if (Weapons.FIST == null){
            throw new ActionException("Unknown Power");
        }else{
            System.out.println("Power: " + Weapons.FIST);
        }
    }

    private void descBat() throws ActionException {
        if (Weapons.BAT == null){
            throw new ActionException("Unknown Power");
        }else{
            System.out.println("Power: " + Weapons.BAT);
        }
    }

    private void descKnu() throws ActionException {
        if (Weapons.BRASS_KNUCKLES == null){
            throw new ActionException("Unknown Power");
        }else{
            System.out.println("Power: " + Weapons.BRASS_KNUCKLES);
        }
    }

    private void descGolf() throws ActionException {
        if (Weapons.GOLF_CLUB == null){
            throw new ActionException("Unknown Power");
        }else{
            System.out.println("Power: " + Weapons.GOLF_CLUB);
        }
    }

    private void descBlu() throws ActionException {
        if (Weapons.BLUDGEON == null){
            throw new ActionException("Unknown Power");
        }else{
            System.out.println("Power: " + Weapons.BLUDGEON);
        }
    }

    private void descKni() throws ActionException {
        if (Weapons.BOWIE_KNIFE == null){
            throw new ActionException("Unknown Power");
        }else{
            System.out.println("Power: " + Weapons.BOWIE_KNIFE);
        }
    }
}