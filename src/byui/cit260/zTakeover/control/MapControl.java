/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.control;

import byui.cit260.zTakeover.exception.MapControlException;
import byui.cit260.zTakeover.model.Game;
import byui.cit260.zTakeover.model.GameCharacter;
import byui.cit260.zTakeover.model.Location;
import byui.cit260.zTakeover.model.Map;
import byui.cit260.zTakeover.model.Player;
import byui.cit260.zTakeover.model.Scene;
import zombietakeover.ZombieTakeover;

/**
 *
 * @author The King's Wit
 */
public class MapControl{
    public static Map createMap(){
        Map map = new Map(20,20);
        Scene[] scenes = createScenes();
        assignScenesToLocations(map,scenes);
        
        return map;
    }

    private static Scene[] createScenes(){
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
                +"deserted alley you once new. All is silent, save the blowing "
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
                +"The end. Thanks for playing.");
        return scenes;
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations=map.getLocations();


        //start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.alley.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.alley.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.alley.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.alley.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.alley.ordinal()]);
        locations[0][9].setScene(scenes[SceneType.trap.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.book_store.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.book_store.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.book_store.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.book_store.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.trap.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[1][7].setScene(scenes[SceneType.toy_store.ordinal()]);
        locations[1][8].setScene(scenes[SceneType.toy_store.ordinal()]);
        locations[1][9].setScene(scenes[SceneType.toy_store.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.book_store.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.book_store.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.pet_store.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.pet_store.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[2][6].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[2][7].setScene(scenes[SceneType.toy_store.ordinal()]);
        locations[2][8].setScene(scenes[SceneType.toy_store.ordinal()]);
        locations[2][9].setScene(scenes[SceneType.toy_store.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.book_store.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.book_store.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.pet_store.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.pet_store.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[3][6].setScene(scenes[SceneType.trap.ordinal()]);
        locations[3][7].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[3][8].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[3][9].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.alley.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.alley.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[4][6].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[4][7].setScene(scenes[SceneType.fire_house.ordinal()]);
        locations[4][8].setScene(scenes[SceneType.fire_house.ordinal()]);
        locations[4][9].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.sport_store.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.sport_store.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.trap.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.hospital.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.hospital.ordinal()]);
        locations[5][6].setScene(scenes[SceneType.hospital.ordinal()]);
        locations[5][7].setScene(scenes[SceneType.fire_house.ordinal()]);
        locations[5][8].setScene(scenes[SceneType.fire_house.ordinal()]);
        locations[5][9].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[6][0].setScene(scenes[SceneType.sport_store.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.sport_store.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[6][3].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[6][4].setScene(scenes[SceneType.hospital.ordinal()]);
        locations[6][5].setScene(scenes[SceneType.hospital.ordinal()]);
        locations[6][6].setScene(scenes[SceneType.hospital.ordinal()]);
        locations[6][7].setScene(scenes[SceneType.fire_house.ordinal()]);
        locations[6][8].setScene(scenes[SceneType.fire_house.ordinal()]);
        locations[6][9].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[7][0].setScene(scenes[SceneType.alley.ordinal()]);
        locations[7][1].setScene(scenes[SceneType.alley.ordinal()]);
        locations[7][2].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[7][3].setScene(scenes[SceneType.fur_shop.ordinal()]);
        locations[7][4].setScene(scenes[SceneType.fur_shop.ordinal()]);
        locations[7][5].setScene(scenes[SceneType.trap.ordinal()]);
        locations[7][6].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[7][7].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[7][8].setScene(scenes[SceneType.trap.ordinal()]);
        locations[7][9].setScene(scenes[SceneType.trap.ordinal()]);
        locations[8][0].setScene(scenes[SceneType.magic_store.ordinal()]);
        locations[8][1].setScene(scenes[SceneType.magic_store.ordinal()]);
        locations[8][2].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[8][3].setScene(scenes[SceneType.fur_shop.ordinal()]);
        locations[8][4].setScene(scenes[SceneType.fur_shop.ordinal()]);
        locations[8][5].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[8][6].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[8][7].setScene(scenes[SceneType.trap.ordinal()]);
        locations[8][8].setScene(scenes[SceneType.donut_shop.ordinal()]);
        locations[8][9].setScene(scenes[SceneType.donut_shop.ordinal()]);
        locations[9][0].setScene(scenes[SceneType.magic_store.ordinal()]);
        locations[9][1].setScene(scenes[SceneType.magic_store.ordinal()]);
        locations[9][2].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[9][3].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[9][4].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[9][5].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[9][6].setScene(scenes[SceneType.deserted_street.ordinal()]);
        locations[9][7].setScene(scenes[SceneType.trap.ordinal()]);
        locations[9][8].setScene(scenes[SceneType.donut_shop.ordinal()]);
        locations[9][9].setScene(scenes[SceneType.ending.ordinal()]);
    }

    static void startAtLocation(Map map,Scene[] scenes) {
        Location[][] locations=map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
      
    }

    public static void startAtLocation(Map map) throws MapControlException{
        Player player1 = ZombieTakeover.getPlayer();
        int row = map.getRowCount();
        int column = map.getColumnCount();
        CharacterControl.moveCharacterToLocation(player1, row, column);
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