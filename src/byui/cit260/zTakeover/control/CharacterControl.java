/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.control;

import byui.cit260.zTakeover.exception.MapControlException;
import byui.cit260.zTakeover.model.Map;
import byui.cit260.zTakeover.model.Player;
import java.util.Scanner;
import zombietakeover.ZombieTakeover;

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
            this.moveNorth();
        }else if(selection=='e'){
            this.moveEast();
        }else if(selection=='s'){
            this.moveSouth();
        }else if(selection=='w'){
            this.moveWest();
        }else if(selection=='b'){
        }else{
            System.out.println("***Invalid direction-try again***");
        }
    }
    
    public static void moveCharacterToLocation(Player player, int row, int column)
        throws MapControlException{
        Map map = ZombieTakeover.getCurrentGame().getMap();
        int newRow = row - 1;
        int newColumn = column - 1;
        
        if (newRow < 0 || newRow >= map.getRowCount() || newColumn < 0 || newColumn >= map.getColumnCount()){
            throw new MapControlException("Cannot move to " + row + "," + column +
                                          "because that location is out of the map boundaries.");
        }
    }

    private void moveNorth() {
        System.out.println("***moveNorth function called***");
    }

    private void moveEast() {
        System.out.println("***moveEast function called***");
    }

    private void moveSouth() {
        System.out.println("***moveSouth function called***");
    }

    private void moveWest() {
        System.out.println("***moveWest function called***");
    }
}
