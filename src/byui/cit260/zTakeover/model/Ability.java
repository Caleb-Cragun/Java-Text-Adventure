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
public enum Ability implements Serializable{
    magic("Allows you to cast a variety of spells in combat."),
    ignition("You're fireproof. Negates additional fire damage."),
    physical("You're unhurtable from physical attacks. Negates physical damage."),
    night("You can see in the dark like it's noon in the desert."),
    fast("You're a blur. Gives you +35 speed."),
    first("You always get to attack first in combat."),
    bear("Vitality of a bear. Gives you +50 hp."),
    cute("You're so cute it's almost sickening."),
    sane("You're all there."),
    know("You have encyclopedic knowledge.");
    private final String description;

    Ability(String description) {
        this.description=description;
    }

    public String getDescription() {
        return description;
    }
    
}