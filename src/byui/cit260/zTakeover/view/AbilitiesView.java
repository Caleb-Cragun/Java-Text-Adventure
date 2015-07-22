/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.view;

import byui.cit260.zTakeover.model.Ability;
import byui.cit260.zTakeover.model.Items;
import zombietakeover.ZombieTakeover;

public class AbilitiesView extends View{
    public AbilitiesView(){
        super("\n---------------------------"
             +"\n      Abilites List       "
             +"\n---------------------------"
             +"\nSelect an Ability for Desc:"
             +"\nM - Magic"
             +"\nI - Ingition Proof"
             +"\nP - Physical Damage Proof"
             +"\nN - Night Vision"
             +"\nF - Fast"
             +"\nA - Always First"
             +"\nB - Bear Vitality"
             +"\nC - Cuteness"
             +"\nS - Sane"
             +"\nK - Knowledge on"
             +"\nW - What abilities I posess"
             +"\nQ - Quit List"
             +"\n---------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        String value=(String)obj;
        value=value.toUpperCase();
        char selection=value.charAt(0);
        switch (selection){
            case 'M':
                this.magicDes();
                break;
            case 'I':
                this.ignitionDes();
                break;
            case 'P':
                this.physicalDes();
                break;
            case 'N':
                this.nightDes();
                break;
            case 'F':
                this.fastDes();
                break;
            case 'A':
                this.alwaysDes();
                break;
            case 'B':
                this.bearDes();
                break;  
            case 'C':
                this.cutenessDes();
                break;
            case 'S':
                this.saneDes();
                break;
            case 'K':
                this.knowledgeDes();
                break;
            case 'W':
                this.displayAbilitiesList();
                break;
            case 'Q':
                return true;
            default:
                this.console.println("***Invalid entry, try again.***");
                break;
        }
        return false;
    }

    private void magicDes() {
        this.console.println(Ability.magic.getDescription());
    }

    private void ignitionDes() {
        this.console.println(Ability.ignition.getDescription());
    }

    private void physicalDes() {
        this.console.println(Ability.physical.getDescription());
   }

    private void nightDes() {
        this.console.println(Ability.night.getDescription());
    }

    private void fastDes() {
        this.console.println(Ability.fast.getDescription());
    }

    private void alwaysDes() {
        this.console.println(Ability.first.getDescription());
    }

    private void bearDes() {
        this.console.println(Ability.bear.getDescription());
    }

    private void cutenessDes() {
        this.console.println(Ability.cute.getDescription());
    }

    private void saneDes() {
        this.console.println(Ability.know.getDescription());
    }

    private void knowledgeDes() {
        this.console.println(Ability.know.getDescription());
    }

    private void displayAbilitiesList() {
       Items[] inv = ZombieTakeover.getCurrentGame().getInventory();
       this.console.println("\nAbilities you have: ");
       for (int i = 3; i <= 12; i++){
           if (inv[i].getAmount() > 0){
               String des = inv[i].getName();
               des = des.toLowerCase();
               switch (des){
                   case "staff":
                       this.console.println(Ability.magic.name());
                       break;
                   case "fire extinguisher":
                       this.console.println(Ability.ignition.name());
                       break;
                    case "bottled ghost":
                       this.console.println(Ability.physical.name());
                       break;
                    case "catfish":
                       this.console.println(Ability.night.name());
                       break;
                    case "rabbits foot":
                       this.console.println(Ability.fast.name());
                       break;
                    case "leopard fur":
                       this.console.println(Ability.first.name());
                       break;
                    case "bear claw":
                       this.console.println(Ability.bear.name());
                       break;
                    case "barbie doll":
                       this.console.println(Ability.cute.name());
                       break;
                    case "marbles":
                       this.console.println(Ability.sane.name());
                       break;
                    case "encyclopedia":
                       this.console.println(Ability.know.name());
                       break;
               }
           } else{
               this.console.println("You don't have this ability yet.");
           }
       }
    }
    
}
