/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.model;
import java.io.Serializable;
/**
 *
 * @author Caleb Cragun
 */
public enum Scene implements Serializable{
        start("You come to in the dark. You find it very difficult to move, "
                + "\nbut still managable. You pick at the cover above you and then "
                + "\nsome dirt falls onto you. Your clawing brings more dirt down "
                + "\non top of you, but your persistance pays off. Suddenly your "
                + "\nclawing brings you to the surface and you look around. Your "
                + "\ntombstone stits behind you and you find yourself in the dirty, "
                + "\ndeserted alley you once new. All is silent, save the blowing "
                + "\nof the wind.","ST"),
        deserted_street("An empty street...all is still...","DS"),
        sport_store("A run down sporting good store, the windows are broken in.","SS"),
        donut_shop("A donut shop. The smell of stale bread and spoiled surgar fills your nose.","DS"),
        alley("A dark alleyway. It's full of trash and the remains of the dead.","AL"),
        toy_store("A toystore, once a place of fun and games, now empty and lifeless.","TS"),
        magic_store("A magic shop. It's full of crazy goods","MS"),
        fire_house("A fire house. The fire engine sits outside.","FH"),
        pet_store("A pet store. Sounds of the zombified fill your ears.","PS"),
        book_store("A bookstore. Books in various stages of age litter the shelves.","BS"),
        fur_shop("A fur shop. This place gives you the fuzzies","FS"),
        hospital("A hospital. Lights flicker in the hallways.","HO"),
        trap("A trap. You are injured.","DS"),
        ending("You stare at the fallen hasmat team, their eyes wide with fright "
                + "\nbut lifeless as you stand over them. You wonder what drew you "
                + "\nto fight them. You come to an aweful realization as you look up "
                + "\nat the hospital. You collapse, crying as you realize that your "
                + "\nhope at a second chance at life now lays dead at your feet. "
                + "\nYou look up at the faces of those who are still remaining in "
                + "\nthe hospital. Horror and awe are indistinct between them all. "
                + "\nYou shamble off into the distnce, never to be seen again."
                + "\nThe end. Thanks for playing.","EN");
        private String symbol;
        private String description;
    
        Scene(String description, String symbol) {
        this.symbol=symbol;
        this.description = description;
        }
    
        public String getSymbol(){
        return symbol;
        }
        
        public String getDescription(){
            return description;
        }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", symbol=" + symbol + '}';
    }
}
