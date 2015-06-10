/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.view;

import java.util.Scanner;

/**
 *
 * @author The King's Wit
 */
public class HelpMenuView {
    private final String MENU = "\n"
            +"\n-------------------------"
            +"\n|      Help Menu        |"
            +"\n-------------------------"
            +"\nG-Goal of game"
            +"\nM-Moving"
            +"\nP-Pick up items"
            +"\nC-Combat Help"
            +"\nQ-Quit Help Menu"
            +"\n-------------------------";
    void displayMenu() {
        char selection = ' ';
        do{  
            //Displays the main menu
            System.out.println(MENU);
            
            //Get users input
            String input = this.getInput();
            //Get first character of string
            selection = input.charAt(0);
            
            //Do action based on selection
            this.doAction(selection);
        }while (selection!='q');
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
            case 'g':
                System.out.println("Survive in the harsh environment of the city and defeat the hazmat team to win.");
                break;
            case 'm':
                System.out.println("To move the character, use the following commands:"
                                +"\nNorth"
                                +"\nEast"
                                +"\nSouth"
                                +"\nWest"
                                +"\nThese commands will move your character the direction typed.");
                break;
            case 'p':
                System.out.println("Use the grab command with the item name to pick items up. Item names will be displayed in the area with that item.");
                break;
            case 'c':
                System.out.println("Combat is done in the encounters. A list of items and abilities will diplayed during combat that you can choose from.");
                break;
            case 'q':
                return;
            default:
                System.out.println("***Invalid entry, try again.***");
                break;
        }
    }
    
}
