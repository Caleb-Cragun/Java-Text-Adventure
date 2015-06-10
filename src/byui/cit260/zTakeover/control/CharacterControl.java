/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.control;

import java.util.Scanner;

public class CharacterControl {
    private final String PROMPT = "Input a direction to go or back to return to the menu:";
    public void moveCharacter(){
       char selection=' ';
       do{
            //Displays the main menu
            System.out.println(PROMPT);
            
            //Get users input
            String input = this.getInput();
            //Get first character of string
            selection = input.charAt(0);
            
            //Do action based on selection
            this.doAction(selection);
        } while (selection!='b');         
    }
    private String getInput() {
        boolean valid = false;
        String userInput = "";
        //Input stream
        Scanner input = new Scanner(System.in);
        
        while(valid!=true){            
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
        if(selection=='n'){
            System.out.println("***moveNorth function called***");
        }else if(selection=='e'){
            System.out.println("***moveEast function called***");
        }else if(selection=='s'){
            System.out.println("***moveSouth function called***");
        }else if(selection=='w'){
            System.out.println("***moveWest function called***");
        }else if(selection=='b'){
        }else{
            System.out.println("***Invalid direction-try again***");
        }
    }
}