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
import byui.cit260.zTakeover.view.StartProgramView;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Caleb Cragun and Nathan Grow
 */
public class ZombieTakeover {
    private static Game currentGame=null;
    private static Player player=null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ZombieTakeover.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ZombieTakeover.player = player;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
    }
    
}
