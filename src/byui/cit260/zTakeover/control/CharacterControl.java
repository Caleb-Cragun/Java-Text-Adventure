/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.control;

import byui.cit260.zTakeover.exception.MapControlException;
import byui.cit260.zTakeover.model.Location;
import byui.cit260.zTakeover.model.Map;
import byui.cit260.zTakeover.model.Player;
import java.io.*;
import zombietakeover.ZombieTakeover;

public class CharacterControl {
    private final String PROMPT = "Input a direction to go or back to return to the menu:";
    protected final BufferedReader keyboard = ZombieTakeover.getInFile();
    protected final PrintWriter console = ZombieTakeover.getOutFile();
    
    public void moveCharacter() throws MapControlException{
       char selection=' ';
       do{
            //Displays the main menu
            this.console.println(PROMPT);
            
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
        try{
            while(valid!=true){            
        
                //Get name and trim off blanks
                userInput = this.keyboard.readLine();
                userInput = userInput.toLowerCase();
                userInput = userInput.trim();
                
                
                //Checks to see if the name is valid
                if (userInput.length()==0){
                    this.console.println("Invalid input - try another option");
                }else{
                    valid=true;
                }
            } 
        }catch (IOException ex) {
            this.console.println("Error reading input: " + ex.getMessage());
        }
        return userInput;
    }

    private void doAction(char selection) throws MapControlException {
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
            this.console.println("***Invalid direction-try again***");
        }
    }
    
    public static void moveCharacterToStart(Player player, int row, int column) throws MapControlException{
        Map map = ZombieTakeover.getCurrentGame().getMap();
        Location location = ZombieTakeover.getCurrentLocation();
        
        int startRow = row;
        int startColumn = column;
        
        if (startRow < 0 || startRow >= map.getRowCount() || startColumn < 0 || startColumn >= map.getColumnCount()){
            throw new MapControlException("Cannot move to " + row + "," + column +
                                          "because that location is out of the map boundaries.");
        }
        else{
            Location startLocation = new Location();
            startLocation.setX(row);
            startLocation.setY(column);
            
            ZombieTakeover.setCurrentLocation(startLocation);
            
        }
    }
    
    public static void moveCharacterToLocation(Player player, int row, int column) throws MapControlException{
        Map map = ZombieTakeover.getCurrentGame().getMap();
        Location location = ZombieTakeover.getCurrentLocation();
        
        int currentRow = ZombieTakeover.getCurrentLocation().getX();
        int currentColumn = ZombieTakeover.getCurrentLocation().getY();
        
        int newRow = row + currentRow;
        int newColumn = column + currentColumn;
        
        if (newRow < 0 || newRow >= map.getRowCount() || newColumn < 0 || newColumn >= map.getColumnCount()){
            throw new MapControlException("Cannot move to " + (currentRow + row) + "," + (currentColumn + column) +
                                          "because that location is out of the map boundaries.");
        }
        else if (row == 1){
            Location newLocation = new Location();
            location.setX(newRow);
            
            ZombieTakeover.setCurrentLocation(location);
        }
        else if (row == -1){
            Location newLocation = new Location();
            location.setX(newRow);
            
            ZombieTakeover.setCurrentLocation(location);
        }
        else if (column == 1){
            Location newLocation = new Location();
            location.setY(newColumn);
            
            ZombieTakeover.setCurrentLocation(location);
        }
        else{
            Location newLocation = new Location();
            location.setY(newColumn);
            
            ZombieTakeover.setCurrentLocation(location);
        }
    }

    private void moveNorth() throws MapControlException {
        Player player = ZombieTakeover.getPlayer();
        moveCharacterToLocation(player, -1, 0);
    }

    private void moveEast() throws MapControlException {
        Player player = ZombieTakeover.getPlayer();
        moveCharacterToLocation(player, 0, 1);
    }

    private void moveSouth() throws MapControlException {
        Player player = ZombieTakeover.getPlayer();
        moveCharacterToLocation(player, 1, 0);
    }

    private void moveWest() throws MapControlException {
        Player player = ZombieTakeover.getPlayer();
        moveCharacterToLocation(player, 0, -1);
    }
}
