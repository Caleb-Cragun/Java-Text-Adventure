/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.view;

import byui.cit260.zTakeover.control.CharacterControl;
import byui.cit260.zTakeover.control.GameControl;
import byui.cit260.zTakeover.model.Items;

public class GameMenuView extends View {
        public GameMenuView(){
            super("\n"
            +"\n------------------------"
            +"\n|      Game Menu       |"
            +"\n------------------------"
            +"\nD-Display Inventory"
            +"\nF-Footstep Counter"
            +"\nA-Ability list"
            +"\nM-Move Character"
            +"\nV-View Map"
            +"\nH-Help Menu"
            +"\nS-Save Game"
            +"\nE-Exit Game"
            +"\n------------------------");
        }
    @Override
    public boolean doAction(Object obj) {
        String value=(String)obj;
        value=value.toLowerCase();
        char selection=value.charAt(0);
        switch (selection){
            case 'd':
                this.displayInventory();
                break;
            case 'f':
                this.displayFootstepCounter();
                break;
            case 'a':
                this.displayAbilities();
                break;
            case 'm':
                this.moveCharacter();
                break;
            case 'v':
                this.viewMap();
                break;
            case 'h':
                this.displayHelpMenu();
                break;
            case 's':
                this.saveGame();
                break;
            case 'e':
                return true;
            default:
                System.out.println("***Invalid entry, try again.***");
                break;
        }
        return false;
    }

    private void displayInventory() {
        Items[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t"
                         + "Required" + "\t"
                         + "In Stock");
        
        // for each inventory item
        for (Items inventoryItem : inventory) {
            // DISPLAY the description, the required amount and amount in stock
            System.out.println(inventoryItem.getDescription() + "\t   "
                             + inventoryItem.getAmount());
        }
    }

    private void displayFootstepCounter() {
        System.out.println("***displayFootstepCounter function called***");
    }

    private void displayAbilities() {
        AbilitiesView abilityList = new AbilitiesView();
        abilityList.display();
    }

    private void moveCharacter() {
        CharacterControl character = new CharacterControl();
        character.moveCharacter();
    }

    private void viewMap() {
        System.out.println("***viewMap function called***");
    }

    private void displayHelpMenu() {
         //Display help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        System.out.println("***saveGame function called***");
    }
}