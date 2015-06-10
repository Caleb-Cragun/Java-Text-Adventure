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
public class InventoryView {
    
    private final String INVENTORY = "\n"
            +"\n-------------------------"
            +"\n|       Inventory        |"
            +"\n-------------------------"
            +"\nC - Consumables"
            +"\nO - Other Items"
            +"\nW - Weapons"
            +"\nQ - Quit"
            +"\n-------------------------";
    
    void displayInventory() {
        char selection = ' ';
        do{
            //Displays the main menu
            System.out.println(INVENTORY);
            
            //Get users input
            String input = this.getInput();
            //Get first character of string
            selection = input.charAt(0);
            
            //Do action based on selection
            this.doAction(selection);
        } while (selection!='Q');
    }

    private String getInput() {
            
        boolean valid = false;
        String userInput = "";
        //Input stream
        Scanner input = new Scanner(System.in);
        
        while(valid!=true){
            //Prompt user for name
            System.out.println("Enter Selection: ");
            
            //Get name and trim off blanks
            userInput = input.nextLine();
            userInput = userInput.toUpperCase();
            userInput = userInput.trim();
            
            
            //Checks to see if the name is valid
            if (userInput.length()==0){
                System.out.println("Invalid input - try another option");
            }
            else{
                valid=true;
            }
        }
        return userInput;
    }

    private void doAction(char selection) {
        switch (selection){
            case 'C':
                this.consumablesMenu();
                break;
            case 'O':
                this.otherItemsMenu();
                break;
            case 'W':
                this.weaponsMenu();
                break;
            case 'Q':
                return;
            default:
                System.out.println("***Invalid entry, try again.***");
                break;
        }
    
    
    
}

    private void consumablesMenu() {
        System.out.println("***consumablesMenu function called***");
    }

    private void otherItemsMenu() {
        System.out.println("***otherItemsMenu function called***");
    }

    private void weaponsMenu() {
        System.out.println("***weaponsMenu function called***");
    }
}