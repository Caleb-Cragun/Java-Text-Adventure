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
public class ConsumableMenu {
           
        
            final String CONSUMABLES = "\n"
            +"\n-------------------------"
            +"\n|    Consumable Items   |"
            +"\n-------------------------"
            +"\nChoose an item that you"
            +"\nwould like to consume."
            +"\nB - Bread (3)"
            +"\nH - Hamburger (1)"
            +"\nG - Granola Bar (2)"
            +"\nE - Exit Consumables Menu"
            +"\n-------------------------";
    
    
    void displayConsumables() {
        char selection = ' ';
        do{
            //Displays the main menu
            System.out.println(CONSUMABLES);
            
            //Get users input
            String input = this.getThisInput();
            //Get first character of string
            selection = input.charAt(0);
            
            //Do action based on selection
            this.doThisAction(selection);
        } while (selection!='e');
        
    }

    private String getThisInput() {
            
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
            }
            else{
                valid=true;
            }
        }
        return userInput;
    }
    
    private void getQuantity(double food) {
        
        double userQuantity;
        boolean validation = false;
        
        while(validation == false){
            Scanner input = new Scanner(System.in);
        
            System.out.println("Enter Quantity: ");
        
            userQuantity = input.nextDouble();
            
            if(Double.isNaN(userQuantity)){
                System.out.println("Invalid Input, please try again.");
            }
            else if(userQuantity > food){
                System.out.println("Invalid Input, please try again.");
            }
            else if(userQuantity < 1){
                System.out.println("Invalid Input, please try again.");
            }
            else{
                addHealth(userQuantity);
                break;
            }
        }
    }

    private void doThisAction(char selection) {
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
                return;
            default:
                System.out.println("***Invalid entry, try again.***");
                break;
        }
        
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
