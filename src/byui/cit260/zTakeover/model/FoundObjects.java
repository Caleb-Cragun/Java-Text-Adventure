/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Onsite
 */
public class FoundObjects implements Serializable{
    
    private String addAbility;

    public FoundObjects() {
    }

    public String getAddAbility() {
        return addAbility;
    }

    public void setAddAbility(String addAbility) {
        this.addAbility = addAbility;
    }

    @Override
    public String toString() {
        return "FoundObjects{" + "addAbility=" + addAbility + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.addAbility);
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
        final FoundObjects other = (FoundObjects) obj;
        if (!Objects.equals(this.addAbility, other.addAbility)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
