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
public enum Consumables implements Serializable{
    granola_bar(10),
    bread(5),
    hamburger(20);
    
    private int health;
    
    Consumables(int health){
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
    
}
