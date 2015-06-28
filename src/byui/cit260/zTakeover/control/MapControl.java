/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.control;

import byui.cit260.zTakeover.model.Game;
import byui.cit260.zTakeover.model.Location;
import byui.cit260.zTakeover.model.Map;
import byui.cit260.zTakeover.model.Scene;
import java.awt.image.BufferedImage;
import zombietakeover.ZombieTakeover;

/**
 *
 * @author The King's Wit
 */
public class MapControl {
    public static Map createMap(){
        Map map = new Map(20,20);
        Scene[] scenes = createScenes();
        assignScenesToLocations(map,scenes);
        
        return map;
    }

    private static Scene[] createScenes() {
        Game game = ZombieTakeover.getCurrentGame();
        Scene[] scenes = new Scene[SceneType.values().length];
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "\nYou come to in the dark. You find it very difficult to move, "
                +"but still managable. You pick at the cover above you and then "
                +"some dirt falls onto you. Your clawing brings more dirt down "
                +"on top of you, but your persistance pays off. Suddenly your "
                +"clawing brings you to the surface and you look around. Your "
                +"tombstone stits behind you and you find yourself in the dirty, "
                +"deserted town you once new. All is silent, save the blowing "
                + "of the wind.");
        scenes[SceneType.start.ordinal()]=startingScene;
        
        Scene endingScene=new Scene();
        endingScene.setDescription(
                "You stare at the fallen hasmat team, their eyes wide with fright "
                +"but lifeless as you stand over them. You wonder what drew you "
                +"to fight them. You come to an aweful realization as you look up "
                +"at the hospital. You collapse, crying as you realize that your "
                +"hope at a second chance at life now lays dead at your feet. "
                +"You look up at the faces of those who are still remaining in "
                +"the hospital. Horror and awe are indistinct between them all. "
                +"You shamble off into the distnce, never to be seen again."
                +"The end. Thanks for playing."
                        );
        return scenes;
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void startAtLocation(Map map,Scene[] scenes) {
        Location[][] locations=map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[SceneType.deserted_street.ordinal()]);
        
    }

    static void startAtLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum SceneType{
            start,
            deserted_street,
            sport_store,
            donut_shop,
            alley,
            toy_store,
            magic_store,
            fire_house,
            pet_store,
            book_store,
            fur_shop,
            hospital,
            trap,
            ending;
        }
}
