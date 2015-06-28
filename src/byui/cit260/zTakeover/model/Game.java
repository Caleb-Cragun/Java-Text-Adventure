/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.model;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author Caleb Cragun and Nathan Grow
 */
public class Game implements Serializable{
    private int stepCounter;
    private Player player;
    private Map map;
    private Items[] inventoryList;

    public Game() {
        
    }

    public int getStepCounter() {
        return stepCounter;
    }

    public void setStepCounter(int stepCounter) {
        this.stepCounter = stepCounter;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    @Override
    public String toString() {
        return "Game{" + "stepCounter=" + stepCounter + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.stepCounter;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.stepCounter != other.stepCounter) {
            return false;
        }
        return true;
    }

    public void setInventory(Items[] inventoryList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
