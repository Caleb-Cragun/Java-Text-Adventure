/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.control;

import byui.cit260.zTakeover.exception.*;
import byui.cit260.zTakeover.model.*;
import java.io.*;
import zombietakeover.ZombieTakeover;

/**
 *
 * @author The King's Wit
 */
public class MapControl {

    public static Map createMap() throws ActionException {
        Map map = new Map(10, 10);
        assignScenesToLocations(map);

        return map;
    }

    private static void assignScenesToLocations(Map map) {
        Location[][] locations = map.getLocations();

        //start point
        locations[0][0].setScene(Scene.start);
        locations[0][1].setScene(Scene.alley);
        locations[0][2].setScene(Scene.alley);
        locations[0][3].setScene(Scene.alley);
        locations[0][4].setScene(Scene.deserted_street);
        locations[0][5].setScene(Scene.deserted_street);
        locations[0][6].setScene(Scene.deserted_street);
        locations[0][7].setScene(Scene.alley);
        locations[0][8].setScene(Scene.alley);
        locations[0][9].setScene(Scene.trap);
        locations[1][0].setScene(Scene.book_store);
        locations[1][1].setScene(Scene.book_store);
        locations[1][2].setScene(Scene.book_store);
        locations[1][3].setScene(Scene.book_store);
        locations[1][4].setScene(Scene.deserted_street);
        locations[1][5].setScene(Scene.trap);
        locations[1][6].setScene(Scene.deserted_street);
        locations[1][7].setScene(Scene.toy_store);
        locations[1][8].setScene(Scene.toy_store);
        locations[1][9].setScene(Scene.toy_store);
        locations[2][0].setScene(Scene.book_store);
        locations[2][1].setScene(Scene.book_store);
        locations[2][2].setScene(Scene.pet_store);
        locations[2][3].setScene(Scene.pet_store);
        locations[2][4].setScene(Scene.deserted_street);
        locations[2][5].setScene(Scene.deserted_street);
        locations[2][6].setScene(Scene.deserted_street);
        locations[2][7].setScene(Scene.toy_store);
        locations[2][8].setScene(Scene.toy_store);
        locations[2][9].setScene(Scene.toy_store);
        locations[3][0].setScene(Scene.book_store);
        locations[3][1].setScene(Scene.book_store);
        locations[3][2].setScene(Scene.pet_store);
        locations[3][3].setScene(Scene.pet_store);
        locations[3][4].setScene(Scene.deserted_street);
        locations[3][5].setScene(Scene.deserted_street);
        locations[3][6].setScene(Scene.trap);
        locations[3][7].setScene(Scene.deserted_street);
        locations[3][8].setScene(Scene.deserted_street);
        locations[3][9].setScene(Scene.deserted_street);
        locations[4][0].setScene(Scene.alley);
        locations[4][1].setScene(Scene.alley);
        locations[4][2].setScene(Scene.deserted_street);
        locations[4][3].setScene(Scene.deserted_street);
        locations[4][4].setScene(Scene.deserted_street);
        locations[4][5].setScene(Scene.deserted_street);
        locations[4][6].setScene(Scene.deserted_street);
        locations[4][7].setScene(Scene.fire_house);
        locations[4][8].setScene(Scene.fire_house);
        locations[4][9].setScene(Scene.deserted_street);
        locations[5][0].setScene(Scene.sport_store);
        locations[5][1].setScene(Scene.sport_store);
        locations[5][2].setScene(Scene.deserted_street);
        locations[5][3].setScene(Scene.trap);
        locations[5][4].setScene(Scene.hospital);
        locations[5][5].setScene(Scene.hospital);
        locations[5][6].setScene(Scene.hospital);
        locations[5][7].setScene(Scene.fire_house);
        locations[5][8].setScene(Scene.fire_house);
        locations[5][9].setScene(Scene.deserted_street);
        locations[6][0].setScene(Scene.sport_store);
        locations[6][1].setScene(Scene.sport_store);
        locations[6][2].setScene(Scene.deserted_street);
        locations[6][3].setScene(Scene.deserted_street);
        locations[6][4].setScene(Scene.hospital);
        locations[6][5].setScene(Scene.hospital);
        locations[6][6].setScene(Scene.hospital);
        locations[6][7].setScene(Scene.fire_house);
        locations[6][8].setScene(Scene.fire_house);
        locations[6][9].setScene(Scene.deserted_street);
        locations[7][0].setScene(Scene.alley);
        locations[7][1].setScene(Scene.alley);
        locations[7][2].setScene(Scene.deserted_street);
        locations[7][3].setScene(Scene.fur_shop);
        locations[7][4].setScene(Scene.fur_shop);
        locations[7][5].setScene(Scene.trap);
        locations[7][6].setScene(Scene.deserted_street);
        locations[7][7].setScene(Scene.deserted_street);
        locations[7][8].setScene(Scene.trap);
        locations[7][9].setScene(Scene.trap);
        locations[8][0].setScene(Scene.magic_store);
        locations[8][1].setScene(Scene.magic_store);
        locations[8][2].setScene(Scene.deserted_street);
        locations[8][3].setScene(Scene.fur_shop);
        locations[8][4].setScene(Scene.fur_shop);
        locations[8][5].setScene(Scene.deserted_street);
        locations[8][6].setScene(Scene.deserted_street);
        locations[8][7].setScene(Scene.trap);
        locations[8][8].setScene(Scene.donut_shop);
        locations[8][9].setScene(Scene.donut_shop);
        locations[9][0].setScene(Scene.magic_store);
        locations[9][1].setScene(Scene.magic_store);
        locations[9][2].setScene(Scene.deserted_street);
        locations[9][3].setScene(Scene.deserted_street);
        locations[9][4].setScene(Scene.deserted_street);
        locations[9][5].setScene(Scene.deserted_street);
        locations[9][6].setScene(Scene.deserted_street);
        locations[9][7].setScene(Scene.trap);
        locations[9][8].setScene(Scene.donut_shop);
        locations[9][9].setScene(Scene.hasmat);
    }

    public static void startAtLocation(Map map) throws MapControlException {
        Player player = ZombieTakeover.getPlayer();
        int row = 0;
        int column = 0;
        CharacterControl.moveCharacterToStart(player, row, column);
    }

    public static void printMap()
            throws ActionException {
        try (PrintWriter out = new PrintWriter("Game_map.txt")) {
            out.println(ZombieTakeover.getPlayer().getName() + "'s Map");
            Location[][] locations = ZombieTakeover.getCurrentGame().getMap().getLocations();

            out.println("\n                 ***** Urban Crawl ******            ");
            out.println("   | 0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | ");

            for (int i = 0; i < locations[0].length; i++) {
                out.format("%2d", i);
                for (int j = 0; j < locations[0].length; j++) {
                    out.print(" | ");
                    out.print(locations[i][j].getScene().getSymbol());

                }
                out.print(" | ");
            }
            System.out.println("Map printed");
        } catch (IOException e) {
            throw new ActionException(e.getMessage());
        }
    }
    
    public static void printScene(){
        Map map1 = ZombieTakeover.getCurrentGame().getMap();
        Location[][] locations = map1.getLocations();
        System.out.println("\n" + locations[ZombieTakeover.getCurrentLocation().getX()][ZombieTakeover.getCurrentLocation().getY()].getScene().getDescription());
    }
}
