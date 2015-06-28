/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.model;

import java.io.Serializable;

/**
 *
 * @author Onsite
 */
public enum Food implements Serializable{
    BREAD(5.0),
    HAMBURGER(15.0),
    GRANOLA_BAR(10.0);
    private double addHealth;

    
    Food(double addHealth) {
        this.addHealth=addHealth;
    }

    public double getAddHealth() {
        return addHealth;
    }
}
