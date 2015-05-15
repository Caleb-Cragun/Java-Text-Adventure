package zombietakeover;

import byui.cit260.zTakeover.model.Game;
import byui.cit260.zTakeover.model.Scene;
import byui.cit260.zTakeover.model.Map;
import byui.cit260.zTakeover.model.Ability;
import byui.cit260.zTakeover.model.Location;
/**
 *
 * @author Caleb Cragun and Nathan Grow
 */
public class ZombieTakeover {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Game class test
        Game gameOne = new Game();
        
        gameOne.setStepCounter(1);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        //Scene class tests
        Scene sceneOne = new Scene();
        sceneOne.setDescription("This is the test scene.");
        sceneOne.setHiddenitem("There's nothing hidden here.");
        sceneOne.setNpc("You are alone.");
        sceneOne.setEncounter("Nothing is here.");
        
        String sceneDes = sceneOne.toString();
        System.out.println(sceneDes);
        
        //Map class test
        Map mapOne = new Map();
        mapOne.setRowCount(1);
        mapOne.setColumnCount(1);
        
        String gameMap = mapOne.toString();
        System.out.println(gameMap);
        
        //Ability class test
        Ability fireBreath = new Ability();
        fireBreath.setName("Fire Breath");
        fireBreath.setDescription("Breath fire like a dragon.");
        fireBreath.setPower(10);
        
        String fiBreath = fireBreath.toString();
        System.out.println(fiBreath);
        
        //Location class test
        Location start = new Location();
        start.setX(1);
        start.setY(1);
        
        String startLocation = start.toString();
        System.out.println(startLocation);
    }
    
}
