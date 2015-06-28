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
public enum FoundObjects implements Serializable{
    STAFF("Magic"),
    FIRE_EXTINGUISHER("Ignition proof"),
    BOTTLED_GHOST("Physical damage proof"),
    CATFISH("Night vision"),
    RABBITS_FOOT("Fast"),
    LEOPARD_FUR("Always first"),
    BEAR_CLAW("Bear vitality"),
    BARBIE_DOLL("Cuteness"),
    MARBLES("Sane"),
    ENCYCLOPEDIA("Knowledge on");
    private String addAbility;

    FoundObjects(String addAbility) {
        this.addAbility=addAbility;
    }

    public String getAddAbility() {
        return addAbility;
    }

    public void setAddAbility(String addAbility) {
        this.addAbility = addAbility;
    }
}
