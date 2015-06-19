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
                return false;
            default:
                System.out.println("***Invalid entry, try again.***");
                break;
        }
        return true;
    }

    private void otherItemsMenu() {
        System.out.println("***otherItemsMenu function called***");
    }

    private void weaponsMenu() {
        System.out.println("***weaponsMenu function called***");
    }

    private void consumableMenu() {
        ConsumableMenu consumables = new ConsumableMenu();
        consumables.display();
    }
    
    
}
    
 