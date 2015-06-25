/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.model;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Onsite
 */
public class GameCharacter {
    private ArrayList<Items> item=new ArrayList<>();
    private ArrayList<Ability> abil=new ArrayList<>();
    private Player player1;
    private String race;
    private double health;
    private double speed;

    public GameCharacter() {
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public ArrayList<Items> getItem() {
        return item;
    }

    public void setItem(ArrayList<Items> item) {
        this.item = item;
    }

    public ArrayList<Ability> getAbil() {
        return abil;
    }

    public void setAbil(ArrayList<Ability> abil) {
        this.abil = abil;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }
    
    

    @Override
    public String toString() {
        return "GameCharacter{" + "race=" + race + ", health=" + health + ", speed=" + speed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.race);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.health) ^ (Double.doubleToLongBits(this.health) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.speed) ^ (Double.doubleToLongBits(this.speed) >>> 32));
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
        final GameCharacter other = (GameCharacter) obj;
        if (!Objects.equals(this.race, other.race)) {
            return false;
        }
        if (Double.doubleToLongBits(this.health) != Double.doubleToLongBits(other.health)) {
            return false;
        }
        if (Double.doubleToLongBits(this.speed) != Double.doubleToLongBits(other.speed)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
