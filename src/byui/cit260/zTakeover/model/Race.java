/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.model;

import java.io.Serializable;

/**
 *
 * @author The King's Wit
 */
public enum Race implements Serializable{
    runner(20,50,"Fast but fragile"),
    survivor(50,20,"Strong but slow"),
    shambler(35,35,"Balanced and best");
    private int health;
    private int speed;
    private String description;
    
    Race(int health, int speed, String description){
        this.health = health;
        this.speed = speed;
        this.description = description;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public String getDescription() {
        return description;
    }
    
    @Override
    public String toString() {
        return "Race{" + "health=" + health + ", speed=" + speed + ", description" + description +'}';
    }
}
