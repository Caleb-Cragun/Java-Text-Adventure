/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.view;

import byui.cit260.zTakeover.model.Items;
import java.util.Scanner;
import zombietakeover.ZombieTakeover;

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
    
    
    /********************************************************************
     * Testing Selection sort method
     **********************************************************************/
    
 
    public static Items[] getSortedConsumableList() {
        
        // get inventory list for the current game
        Items[] originalInventoryList = ZombieTakeover.getCurrentGame().getInventory();
        
        //make a copy, original list
        Items[] consumableList = originalInventoryList.clone();
        
        //using a BubbleSort to sort the list of inventoryList by name
        Items tempConsumableItem;
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2-i; j++){
                if (consumableList[j].getDescription().compareToIgnoreCase(consumableList[j + 1].getDescription()) > 0) {
                    tempConsumableItem = consumableList[j];
                    consumableList[j] = consumableList[j+1];
                    consumableList[j+1] = tempConsumableItem;
                }
            }
        }
        return consumableList;
    }
    


    /****************************************************
        *END TEST
    *******************************************************/
    
    
    
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
