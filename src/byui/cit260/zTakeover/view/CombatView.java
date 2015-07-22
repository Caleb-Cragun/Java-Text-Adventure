/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.view;

import byui.cit260.zTakeover.model.Enemies;
import byui.cit260.zTakeover.model.Player;
import byui.cit260.zTakeover.model.Weapons;

/**
 *
 * @author Onsite
 */
public class CombatView extends View{

    public CombatView() {
        super("\n---------------------------"
             +"\n      Combat List       "
             +"\n---------------------------"
             +"\nF - Fist"
             +"\nS - Shovel"
             +"\nB - Bat"
             +"\nN - Brass Knuckles"
             +"\nG - Golf Club"
             +"\nD - Bludgeon"
             +"\nK - Bowie Knife"
             +"\nR - Run Away"
             +"\n---------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        String value=(String)obj;
        value=value.toUpperCase();
        char selection=value.charAt(0);
        switch (selection){
            case 'F':
                this.useFist();
                break;
            case 'S':
                this.useShovel();
                break;
            case 'B':
                this.useBat();
                break;
            case 'N':
                this.useBrassKnuckles();
                break;
            case 'G':
                this.useGolfClub();
                break;
            case 'D':
                this.useBludgeon();
                break;
            case 'K':
                this.useBowieKnife();
                break;  
            case 'R':
                return true;
            default:
                this.console.println("***Invalid entry, try again.***");
                break;
        }
        return false;
    }

    private void useFist() {
        Enemies enemy = new Enemies();
        double enemyHealth = enemy.getHealth();
        double enemySpeed = enemy.getSpeed();
        double enemyPower = enemy.getPower();
        
        Player player = new Player();
        double playerHealth = player.getHealth();
        double playerSpeed = player.getSpeed();
        double playerPower = Weapons.FIST.getPower();
        
        while(enemyHealth > 0 && playerHealth > 0){
            if(playerSpeed > enemySpeed){
                enemyHealth -= playerPower;
                if(enemyHealth > 0){
                    playerHealth -= enemyPower;
                }
                System.out.println("\nYou health is now at " + playerHealth);
                System.out.println("\nThe enemy's health is now at " + enemyHealth);
            }
            else{
                playerHealth -= enemyPower;
                if(playerHealth > 0){
                    enemyHealth -= playerPower;
                }
                System.out.println("\nYou health is now at " + playerHealth);
                System.out.println("\nThe enemy's health is now at " + enemyHealth);
            }
            
        }
        if(enemyHealth < 1){
            System.out.println("\nCongratulations! You defeated the enemy!");
        }
        else{
            System.out.println("\nYou have been defeated. Game Over.");
            System.exit(0);
        }
    }

    private void useShovel() {
        Enemies enemy = new Enemies();
        double enemyHealth = enemy.getHealth();
        double enemySpeed = enemy.getSpeed();
        double enemyPower = enemy.getPower();
        
        Player player = new Player();
        double playerHealth = player.getHealth();
        double playerSpeed = player.getSpeed();
        double playerPower = Weapons.SHOVEL.getPower();
        
        while(enemyHealth > 0 && playerHealth > 0){
            if(playerSpeed > enemySpeed){
                enemyHealth -= playerPower;
                if(enemyHealth > 0){
                    playerHealth -= enemyPower;
                }
                System.out.println("\nYou health is now at " + playerHealth);
                System.out.println("\nThe enemy's health is now at " + enemyHealth);
            }
            else{
                playerHealth -= enemyPower;
                if(playerHealth > 0){
                    enemyHealth -= playerPower;
                }
                System.out.println("\nYou health is now at " + playerHealth);
                System.out.println("\nThe enemy's health is now at " + enemyHealth);
            }
            
        }
        if(enemyHealth < 1){
            System.out.println("\nCongratulations! You defeated the enemy!");
        }
        else{
            System.out.println("\nYou have been defeated. Game Over.");
            System.exit(0);
        }
    }

    private void useBat() {
        Enemies enemy = new Enemies();
        double enemyHealth = enemy.getHealth();
        double enemySpeed = enemy.getSpeed();
        double enemyPower = enemy.getPower();
        
        Player player = new Player();
        double playerHealth = player.getHealth();
        double playerSpeed = player.getSpeed();
        double playerPower = Weapons.BAT.getPower();
        
        while(enemyHealth > 0 && playerHealth > 0){
            if(playerSpeed > enemySpeed){
                enemyHealth -= playerPower;
                if(enemyHealth > 0){
                    playerHealth -= enemyPower;
                }
                System.out.println("\nYou health is now at " + playerHealth);
                System.out.println("\nThe enemy's health is now at " + enemyHealth);
            }
            else{
                playerHealth -= enemyPower;
                if(playerHealth > 0){
                    enemyHealth -= playerPower;
                }
                System.out.println("\nYou health is now at " + playerHealth);
                System.out.println("\nThe enemy's health is now at " + enemyHealth);
            }
            
        }
        if(enemyHealth < 1){
            System.out.println("\nCongratulations! You defeated the enemy!");
        }
        else{
            System.out.println("\nYou have been defeated. Game Over.");
            System.exit(0);
        }
    }

    private void useBrassKnuckles() {
        Enemies enemy = new Enemies();
        double enemyHealth = enemy.getHealth();
        double enemySpeed = enemy.getSpeed();
        double enemyPower = enemy.getPower();
        
        Player player = new Player();
        double playerHealth = player.getHealth();
        double playerSpeed = player.getSpeed();
        double playerPower = Weapons.BRASS_KNUCKLES.getPower();
        
        while(enemyHealth > 0 && playerHealth > 0){
            if(playerSpeed > enemySpeed){
                enemyHealth -= playerPower;
                if(enemyHealth > 0){
                    playerHealth -= enemyPower;
                }
                System.out.println("\nYou health is now at " + playerHealth);
                System.out.println("\nThe enemy's health is now at " + enemyHealth);
            }
            else{
                playerHealth -= enemyPower;
                if(playerHealth > 0){
                    enemyHealth -= playerPower;
                }
                System.out.println("\nYou health is now at " + playerHealth);
                System.out.println("\nThe enemy's health is now at " + enemyHealth);
            }
            
        }
        if(enemyHealth < 1){
            System.out.println("\nCongratulations! You defeated the enemy!");
        }
        else{
            System.out.println("\nYou have been defeated. Game Over.");
            System.exit(0);
        }
    }

    private void useGolfClub() {
        Enemies enemy = new Enemies();
        double enemyHealth = enemy.getHealth();
        double enemySpeed = enemy.getSpeed();
        double enemyPower = enemy.getPower();
        
        Player player = new Player();
        double playerHealth = player.getHealth();
        double playerSpeed = player.getSpeed();
        double playerPower = Weapons.GOLF_CLUB.getPower();
        
        while(enemyHealth > 0 && playerHealth > 0){
            if(playerSpeed > enemySpeed){
                enemyHealth -= playerPower;
                if(enemyHealth > 0){
                    playerHealth -= enemyPower;
                }
                System.out.println("\nYou health is now at " + playerHealth);
                System.out.println("\nThe enemy's health is now at " + enemyHealth);
            }
            else{
                playerHealth -= enemyPower;
                if(playerHealth > 0){
                    enemyHealth -= playerPower;
                }
                System.out.println("\nYou health is now at " + playerHealth);
                System.out.println("\nThe enemy's health is now at " + enemyHealth);
            }
            
        }
        if(enemyHealth < 1){
            System.out.println("\nCongratulations! You defeated the enemy!");
        }
        else{
            System.out.println("\nYou have been defeated. Game Over.");
            System.exit(0);
        }
    }

    private void useBludgeon() {
        Enemies enemy = new Enemies();
        double enemyHealth = enemy.getHealth();
        double enemySpeed = enemy.getSpeed();
        double enemyPower = enemy.getPower();
        
        Player player = new Player();
        double playerHealth = player.getHealth();
        double playerSpeed = player.getSpeed();
        double playerPower = Weapons.BLUDGEON.getPower();
        
        while(enemyHealth > 0 && playerHealth > 0){
            if(playerSpeed > enemySpeed){
                enemyHealth -= playerPower;
                if(enemyHealth > 0){
                    playerHealth -= enemyPower;
                }
                System.out.println("\nYou health is now at " + playerHealth);
                System.out.println("\nThe enemy's health is now at " + enemyHealth);
            }
            else{
                playerHealth -= enemyPower;
                if(playerHealth > 0){
                    enemyHealth -= playerPower;
                }
                System.out.println("\nYou health is now at " + playerHealth);
                System.out.println("\nThe enemy's health is now at " + enemyHealth);
            }
            
        }
        if(enemyHealth < 1){
            System.out.println("\nCongratulations! You defeated the enemy!");
        }
        else{
            System.out.println("\nYou have been defeated. Game Over.");
            System.exit(0);
        }
    }

    private void useBowieKnife() {
        Enemies enemy = new Enemies();
        double enemyHealth = enemy.getHealth();
        double enemySpeed = enemy.getSpeed();
        double enemyPower = enemy.getPower();
        
        Player player = new Player();
        double playerHealth = player.getHealth();
        double playerSpeed = player.getSpeed();
        double playerPower = Weapons.BOWIE_KNIFE.getPower();
        
        while(enemyHealth > 0 && playerHealth > 0){
            if(playerSpeed > enemySpeed){
                enemyHealth -= playerPower;
                if(enemyHealth > 0){
                    playerHealth -= enemyPower;
                }
                System.out.println("\nYou health is now at " + playerHealth);
                System.out.println("\nThe enemy's health is now at " + enemyHealth);
            }
            else{
                playerHealth -= enemyPower;
                if(playerHealth > 0){
                    enemyHealth -= playerPower;
                }
                System.out.println("\nYou health is now at " + playerHealth);
                System.out.println("\nThe enemy's health is now at " + enemyHealth);
            }
            
        }
        if(enemyHealth < 1){
            System.out.println("\nCongratulations! You defeated the enemy!");
        }
        else{
            System.out.println("\nYou have been defeated. Game Over.");
            System.exit(0);
        }
    }
    
}
