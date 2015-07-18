/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.control;

import byui.cit260.zTakeover.model.GameCharacter;
import byui.cit260.zTakeover.model.Player;
import byui.cit260.zTakeover.model.Race;
import zombietakeover.ZombieTakeover;

/**
 *
 * @author The King's Wit
 */
public class ProgramControl {

    public static Player createPlayer(String playerName, char race) {
        if (playerName==null){
            return null;
        }
        Player player=new Player();
        switch(race){
            case 'a':
                player.setSpeed(Race.runner.getSpeed());
                player.setHealth(Race.runner.getHealth());
                break;
            case 'b':
                player.setSpeed(Race.survivor.getSpeed());
                player.setHealth(Race.survivor.getHealth());
                break;
            default:
                player.setSpeed(Race.shambler.getSpeed());
                player.setHealth(Race.shambler.getHealth());
        }
        player.setName(playerName);
        ZombieTakeover.setPlayer(player);
        
        
        return player;
    }
}
