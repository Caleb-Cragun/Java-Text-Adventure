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
public enum Weapons implements Serializable{
    SHOVEL(15.0),
    FIST(5.0),
    BAT(7.0),
    BRASS_KNUCKLES(6.0),
    GOLF_CLUB(8.0),
    BLUDGEON(9.0),
    BOWIE_KNIFE(13.0);
    private double power;
    
    Weapons(double power) {
        this.power=power;
    }
    
    public double getPower() {
        return power;
    }
}
