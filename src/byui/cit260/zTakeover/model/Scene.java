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
public class Scene implements Serializable{
    private String description;
    private String hiddenitem;
    private String npc;
    private String encounter;

    public Scene() {
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHiddenitem() {
        return hiddenitem;
    }

    public void setHiddenitem(String hiddenitem) {
        this.hiddenitem = hiddenitem;
    }

    public String getNpc() {
        return npc;
    }

    public void setNpc(String npc) {
        this.npc = npc;
    }

    public String getEncounter() {
        return encounter;
    }

    public void setEncounter(String encounter) {
        this.encounter = encounter;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", hiddenitem=" + hiddenitem + ", npc=" + npc + ", encounter=" + encounter + '}';
    }
}
