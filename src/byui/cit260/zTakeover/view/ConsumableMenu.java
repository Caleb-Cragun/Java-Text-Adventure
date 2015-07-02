/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.view;

import java.util.Scanner;

/**
 *
 * @author Onsite
 */
public class ConsumableMenu extends View {
           
    public ConsumableMenu(){
        super("\n"
            +"\n-------------------------"
            +"\n|    Consumable Items   |"
            +"\n-------------------------"
            +"\nChoose an item that you"
            +"\nwould like to consume."
            +"\nB - Bread (3)"
            +"\nH - Hamburger (1)"
            +"\nG - Granola Bar (2)"
            +"\nE - Exit Consumables Menu"
            +"\n-------------------------");
    }
    
    
    private void getQuantity(double food) {
        
        double userQuantity;
        boolean validation = false;
        
        while(validation == false){
            Scanner input = new Scanner(System.in);
        
            System.out.println("Enter Quantity: ");
            String value = this.getInput();
            value = value.trim().toUpperCase();
            try{
                userQuantity = Double.parseDouble(value);
            }catch (NumberFormatException nf){
                System.out.println("\nYou must enter a valid number. Try again or enter E to exit.");
            }
        }
    }

    @Override
    public boolean doAction(Object obj) {
        String value=(String)obj;
        value=value.toLowerCase();
        char selection=value.charAt(0);
        
        switch (selection){
            case 'b':
                this.consumeBread();
                break;
            case 'h':
                this.consumeHamburger();
                break;
            case 'g':
                this.consumeGranolaBar();
                break;
            case 'e':
                return true;
            default:
                System.out.println("***Invalid entry, try again.***");
                break;
        }
        return false;
    }


    //*******************consumeItems stub functions below here*********************************
    
    private void consumeBread() {
        double bread = 3;
        getQuantity(bread);
    }

    private void consumeHamburger() {
        double hamburger = 1;
        getQuantity(hamburger);
    }

    private void consumeGranolaBar() {
        double granolaBar = 2;
        getQuantity(granolaBar);
    }

    private void addHealth(double quantity) {
        System.out.println("***addHealth function called " + quantity + " times***");
    }
}
