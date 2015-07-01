/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.view;

import byui.cit260.zTakeover.model.Items;

/**
 *
 * @author Onsite
 */
public class InventoryView extends View{
    
    public InventoryView(){
    super("\n"
            +"\n-------------------------"
            +"\n|       Inventory        |"
            +"\n-------------------------"
            +"\nC - Consumables"
            +"\nO - Other Items"
            +"\nW - Weapons"
            +"\nQ - Quit"
            +"\n-------------------------");
    }
    


    @Override
    public boolean doAction(Object obj) {
        String value=(String)obj;
        value=value.toUpperCase();
        char selection=value.charAt(0);
        
        switch (selection){
            case 'C':
                this.consumableMenu();
                break;
            case 'O':
                this.otherItemsMenu();
                break;
            case 'W':
                this.weaponsMenu();
                break;
            case 'Q':
                return true;
            default:
                System.out.println("***Invalid entry, try again.***");
                break;
        }
        return false;
    }

    private void otherItemsMenu() {
        OtherItemsMenu otherItems = new OtherItemsMenu();
        otherItems.display();
    }

    private void weaponsMenu() {
        System.out.println("***weaponsMenu function called***");
    }

    private void consumableMenu() {
        Items[] consumableSort = ConsumableMenu.getSortedConsumableList();    
            
        System.out.println("\nList of Consumable Items");
        System.out.println("Description" + "\t"
                         + "In Stock");
        
        // for each inventory item
        for (Items consumableItem : consumableSort) {
            // DISPLAY the description, the required amount and amount in stock
            System.out.println(consumableItem.getDescription() + "\t   "
                             + consumableItem.getAmount());
        }
        
        
        // display original menu
        ConsumableMenu consumables = new ConsumableMenu();
        consumables.display();
    }
    
    
}
    
 