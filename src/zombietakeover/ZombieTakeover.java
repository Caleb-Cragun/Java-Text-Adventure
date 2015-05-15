package zombietakeover;

import byui.cit260.zTakeover.model.Game;

/**
 *
 * @author Caleb Cragun and Nathan Grow
 */
public class ZombieTakeover {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game gameOne = new Game();
        
        gameOne.setStepCounter(1);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
    }
    
}
