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
public class FootstepCounter implements Serializable{

    public FootstepCounter() {
    }
    
    private int counter;

    
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    public void moveCharacter(){
        counter += 1;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.counter;
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
        final FootstepCounter other = (FootstepCounter) obj;
        if (this.counter != other.counter) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FootstepCounter{" + "counter=" + counter + '}';
    }
    
    
    
}
