/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.control;

import byui.cit260.zTakeover.model.Player;
import zombietakeover.ZombieTakeover;

/**
 *
 * @author The King's Wit
 */
public class ProgramControl {

    public static Player createPlayer(String playerName) {
        if (playerName==null){
            return null;
        }
        Player player=new Player();
        player.setName(playerName);
        
        ZombieTakeover.setPlayer(player);
        
        return player;
    }

    
    
}
