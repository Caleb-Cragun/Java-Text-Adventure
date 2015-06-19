/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.control;

public class SceneControl {
    public double combatSpellDamage(double stepCounter,double numItems,double randomNum){        
        if(stepCounter<=0){
            return -1;
        }else if(numItems<0){
            return -1;
        }else if (randomNum<0||randomNum>2){
            return -1;
        }else{
            double output=stepCounter+Math.pow(numItems,randomNum);
            return output;
        }
    }
    
    public double brokenShovelDamage(double stepCounter, double numItems, double randomNum){
        if(stepCounter<=0){
            return -1;
        }else if(numItems<0){
            return -1;
        }else if (randomNum<0||randomNum>5){
            return -1;
        }else{
            double output=stepCounter+Math.pow(numItems,randomNum);
            return output;
        }
    }
        
    public boolean checkSpecialEncounter(double stepCounter, double numItems){
        if(stepCounter <= 0){
            return false;
        }
        else if(numItems <= 0){
            return false;
        }
        else{
            double chance = Math.sqrt(stepCounter * numItems) % 2;
        
            if(chance == 0){
                return true;
            }
            else{
                return false;
            }
        }
    }
    
}
