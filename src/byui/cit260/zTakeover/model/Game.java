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
    private ArrayList<Player> player1=new ArrayList<>();
    private Map map1;

    public Game() {
        
    }

    public int getStepCounter() {
        return stepCounter;
    }

    public void setStepCounter(int stepCounter) {
        this.stepCounter = stepCounter;
    }

    public ArrayList<Player> getPlayer1() {
        return player1;
    }

    public void setPlayer1(ArrayList<Player> player1) {
        this.player1 = player1;
    }

    public Map getMap1() {
        return map1;
    }

    public void setMap1(Map map1) {
        this.map1 = map1;
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
    
}
