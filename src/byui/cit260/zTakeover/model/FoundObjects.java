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
    STAFF("A gnarled, wooden staff with strange symbols on it."),
    FIRE_EXTINGUISHER("Rusted, but still contians compressed C02."),
    BOTTLED_GHOST("You look at it...it looks at you...then proceeds to make faces."),
    CATFISH("It meows audibly at you while its wiskers tickle you."),
    RABBITS_FOOT("It's blue, probably due to no circulation."),
    LEOPARD_FUR("Short haired mat that could double as a blanket in a pinch"),
    BEAR_CLAW("Gooey, apple-filled doughnut that looks like a bear's claw."),
    BARBIE_DOLL("A blast from the past and every little girl's favorite toy."),
    MARBLES("A whole bag of shinies!"),
    ENCYCLOPEDIA("How'd they get everything into one book? Simple. Ultra-fine print.");
    private String description;

    FoundObjects(String description) {
        this.description=description;
    }

    public String getDescription() {
        return description;
    }
}
