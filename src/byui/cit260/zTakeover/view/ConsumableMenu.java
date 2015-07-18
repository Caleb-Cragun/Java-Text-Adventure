/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.view;

import byui.cit260.zTakeover.model.Consumables;
import byui.cit260.zTakeover.model.Items;
import java.util.Scanner;
import zombietakeover.ZombieTakeover;

/**
 *
 * @author Onsite
 */
public class ConsumableMenu extends View {

    public ConsumableMenu() {
        super("\n"
                + "\n-------------------------"
                + "\n|    Consumable Items   |"
                + "\n-------------------------"
                + "\nChoose an item that you"
                + "\nwould like to consume."
                + "\nB - Bread "
                + "\nH - Hamburger"
                + "\nG - Granola Bar"
                + "\nE - Exit Consumables Menu"
                + "\n-------------------------");
    }

    /**
     * ******************************************************************
     * Testing Selection sort method
     *********************************************************************
     */
    public static Items[] getSortedConsumableList() {

        // get inventory list for the current game
        Items[] originalInventoryList = ZombieTakeover.getCurrentGame().getInventory();

        //make a copy, original list
        Items[] consumableList = originalInventoryList.clone();

        //using a BubbleSort to sort the list of inventoryList by name
        Items tempConsumableItem;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - i; j++) {
                if (consumableList[j].getDescription().compareToIgnoreCase(consumableList[j + 1].getDescription()) > 0) {
                    tempConsumableItem = consumableList[j];
                    consumableList[j] = consumableList[j + 1];
                    consumableList[j + 1] = tempConsumableItem;
                }
            }
        }
        return consumableList;
    }

    /**
     * **************************************************
     * END TEST
    ******************************************************
     */
    private int getQuantity(int food) {
        Items[] inv = ZombieTakeover.getCurrentGame().getInventory();
        int userQuantity = 0;
        boolean validation = false;

        while (validation == false) {
            this.console.println("Enter Quantity: ");
            try{
                Scanner input = new Scanner(System.in);
                userQuantity = input.nextInt();
            }catch (Exception e){
                ErrorView.display("ConsumableMenu", e.getMessage());
            }
            if (userQuantity > inv[food].getAmount()){
                System.out.println("Not enough in inventory. Please try again.");
            }else{
                validation = true;
                double amount = inv[food].getAmount();
                amount -= userQuantity;
                inv[food].setAmount(amount);
            } 
        }
        return userQuantity;
    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toLowerCase();
        char selection = value.charAt(0);

        switch (selection) {
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
                this.console.println("***Invalid entry, try again.***");
                break;
        }
        return false;
    }

    //*******************consumeItems stub functions below here*********************************
    private void consumeBread() {
        int bread = 0;
        int amount = getQuantity(bread);
        double health = ZombieTakeover.getCurrentGame().getPlayer().getHealth();
        amount *= Consumables.bread.getHealth();
        health += amount;
        ZombieTakeover.getCurrentGame().getPlayer().setHealth(health);
        System.out.println("You gained " + Consumables.bread.getHealth() + " HP.");
    }

    private void consumeHamburger() {
        int hamburger = 2;
        int amount = getQuantity(hamburger);
        double health = ZombieTakeover.getCurrentGame().getPlayer().getHealth();
        amount *= Consumables.hamburger.getHealth();
        health += amount;
        ZombieTakeover.getCurrentGame().getPlayer().setHealth(health);
        System.out.println("You gained " + Consumables.hamburger.getHealth() + " HP.");
    }

    private void consumeGranolaBar() {
        int granolaBar = 1;
        double amount = getQuantity(granolaBar);
        double health = ZombieTakeover.getCurrentGame().getPlayer().getHealth();
        amount *= Consumables.granola_bar.getHealth();
        health += amount;
        ZombieTakeover.getCurrentGame().getPlayer().setHealth(health);
        System.out.println("You gained " + Consumables.granola_bar.getHealth() + " HP.");
    }
}