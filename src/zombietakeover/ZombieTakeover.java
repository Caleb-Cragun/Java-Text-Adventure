package zombietakeover;

import byui.cit260.zTakeover.model.Game;
import byui.cit260.zTakeover.model.Scene;
import byui.cit260.zTakeover.model.Map;
import byui.cit260.zTakeover.model.Ability;
import byui.cit260.zTakeover.model.Food;
import byui.cit260.zTakeover.model.FoundObjects;
import byui.cit260.zTakeover.model.GameCharacter;
import byui.cit260.zTakeover.model.Items;
import byui.cit260.zTakeover.model.Location;
import byui.cit260.zTakeover.model.Player;
import byui.cit260.zTakeover.model.Weapons;
import java.util.HashSet;
import java.util.Set;
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
        
        //Food class test
        Food bread = new Food();
        bread.setAddHealth(25);
        
        String breadInfo = bread.toString();
        System.out.println(breadInfo);
        
        //FoundObjects class test
        FoundObjects zippoLighter = new FoundObjects();
        zippoLighter.setAddAbility(fiBreath);

        String zippoLighterInfo = zippoLighter.toString();
        System.out.println(zippoLighterInfo);
        
        //GameCharacter class test
        GameCharacter brute = new GameCharacter();
        brute.setHealth(150);
        brute.setRace("Brute");
        brute.setSpeed(8);

        String bruteInfo = brute.toString();
        System.out.println(bruteInfo);
        
        //Items class test
        Items zipLighter = new Items();
        zipLighter.setName("Zippo Lighter");
        zipLighter.setDescription("When consumed, gives the ability Fire Breath.");
        zipLighter.setAmount(1);
        
        String zipLighterInfo = zipLighter.toString();
        System.out.println(zipLighterInfo);
        
        //Player class test
        Player playerOne = new Player();
        playerOne.setName("Alfred");
        
        String playerOneInfo = playerOne.toString();
        System.out.println(playerOneInfo);
        
        //Weapons class test
        Weapons baseballBat = new Weapons();
        baseballBat.setPower(4);
        
        String baseballBatInfo = baseballBat.toString();
        System.out.println(baseballBatInfo);
        
        
    }
    
}
