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
public class Food implements Serializable{
    
    private double addHealth;

    
    public Food() {
    }

    
    
    public double getAddHealth() {
        return addHealth;
    }

    public void setAddHealth(double addHealth) {
        this.addHealth = addHealth;
    }

    @Override
    public String toString() {
        return "Food{" + "addHealth=" + addHealth + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.addHealth) ^ (Double.doubleToLongBits(this.addHealth) >>> 32));
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
        final Food other = (Food) obj;
        if (Double.doubleToLongBits(this.addHealth) != Double.doubleToLongBits(other.addHealth)) {
            return false;
        }
        return true;
    }
    
    
    
}
