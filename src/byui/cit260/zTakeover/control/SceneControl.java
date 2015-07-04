/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.control;

import byui.cit260.zTakeover.exception.ActionException;

public class SceneControl {
    public double combatSpellDamage(double stepCounter,double numItems,double randomNum) throws ActionException{        
        if(stepCounter<=0){
            throw new ActionException("Invalid Stepcounter");
        }else if(numItems<0){
            throw new ActionException("Invalid number of items");
        }else if (randomNum<0||randomNum>2){
            throw new ActionException("Invalid random number");
        }else{
            double output=stepCounter+Math.pow(numItems,randomNum);
            return output;
        }
    }
    
    public double brokenShovelDamage(double stepCounter, double numItems, double randomNum)throws ActionException{
        if(stepCounter<=0){
            throw new ActionException("Invalid Stepcounter");
        }else if(numItems<0){
            throw new ActionException("Invalid number of items");
        }else if (randomNum<0||randomNum>5){
            throw new ActionException("Invalid random number");
        }else{
            double output=stepCounter+Math.pow(numItems,randomNum);
            return output;
        }
    }
        
    public boolean checkSpecialEncounter(double stepCounter, double numItems)throws ActionException{
        if(stepCounter <= 0){
            throw new ActionException("Invalid Stepcounter");
        }
        else if(numItems < 0){
            throw new ActionException("Invalid number of items");
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
