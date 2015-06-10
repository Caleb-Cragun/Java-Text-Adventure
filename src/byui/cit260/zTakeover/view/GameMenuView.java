/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.view;

import byui.cit260.zTakeover.control.CharacterControl;
import java.util.Scanner;

public class GameMenuView {
    private final String GAME_MENU = "\n"
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
            +"\nE-Exit Game";
    void displayMenu() {
       char selection=' ';
       do{
            //Displays the main menu
            System.out.println(GAME_MENU);
            
            //Get users input
            String input = this.getInput();
            //Get first character of string
            selection = input.charAt(0);
            
            //Do action based on selection
            this.doAction(selection);
        } while (selection!='e');
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
            userInput = userInput.toLowerCase();
            userInput = userInput.trim();
            
            
            //Checks to see if the name is valid
            if (userInput.length()==0){
                System.out.println("Invalid input - try another option");
            }else{
                valid=true;
            }
        }
        return userInput;
    }

    private void doAction(char selection) {
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
                break;
            default:
                System.out.println("***Invalid entry, try again.***");
                break;
        }
    }

    private void displayInventory() {
        InventoryView inventory = new InventoryView();
        inventory.displayInventory();
    }

    private void displayFootstepCounter() {
        System.out.println("***displayFootstepCounter function called***");
    }

    private void displayAbilities() {
        System.out.println("***displayAbilities function called***");
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
        helpMenu.displayMenu();
    }

    private void saveGame() {
        System.out.println("***saveGame function called***");
    }
}