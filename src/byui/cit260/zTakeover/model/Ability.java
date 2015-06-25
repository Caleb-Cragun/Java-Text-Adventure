/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author The King's Wit
 */
public enum Ability implements Serializable{
    MAGIC("Allows you to cast a variety of spells in combat."),
    IGNITION("You're fireproof. Negates additional fire damage."),
    PHYSICAL("You're unhurtable from physical attacks. Negates physical damage."),
    NIGHT("You can see in the dark like it's noon in the desert."),
    FAST("You're a blur. Gives you +35 speed."),
    FIRST("You always get to attack first in combat."),
    BEAR("Vitality of a bear. Gives you +50 hp."),
    CUTE("You're so cute it's almost sickening."),
    SANE("You're all there."),
    KNOW("You have knowledge on a particular specified subject.");
    private final String description;

    Ability(String description) {
        this.description=description;
    }

    public String getDescription() {
        return description;
    }
    
}