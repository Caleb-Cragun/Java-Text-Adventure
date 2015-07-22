/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
package byui.cit260.zTakeover.control;

import byui.cit260.zTakeover.exception.*;
import byui.cit260.zTakeover.model.*;
 */
package byui.cit260.zTakeover.control;

import byui.cit260.zTakeover.exception.*;
import byui.cit260.zTakeover.model.*;
import java.io.*;
import zombietakeover.ZombieTakeover;

public class GameControl {

    public static void createNewGame(Player player) throws MapControlException, ActionException {
        Game game1 = new Game();
        ZombieTakeover.setCurrentGame(game1);
        
        game1.setPlayer(player);
        FootstepCounter footsteps = new FootstepCounter();
        footsteps.setCounter(0);
        Items[] inventoryList = GameControl.createInventoryList();
        game1.setInventory(inventoryList);
        
        Map map=MapControl.createMap();
        game1.setMap(map);
        
        MapControl.startAtLocation(map);
        
        MapControl.printScene();
    }
    
    public static Items[] createInventoryList(){
        Items[] inventory = new Items[20];
        
        Items bread = new Items();
        bread.setAmount(0);
        bread.setDescription("Bread");
        inventory[0]=bread;
        
        Items granola = new Items();
        granola.setAmount(0);
        granola.setDescription("Granola Bar");
        inventory[1]=granola;
        
        Items hamburger = new Items();
        hamburger.setAmount(0);
        hamburger.setDescription("Hamburger");
        inventory[2]=hamburger;
        
        Items staff = new Items();
        staff.setAmount(0);
        staff.setDescription("Staff");
        inventory[3]=staff;
        
        Items extinguisher = new Items();
        extinguisher.setAmount(0);
        extinguisher.setDescription("Fire Extinguisher");
        inventory[4]=extinguisher;
        
        Items bottle = new Items();
        bottle.setAmount(0);
        bottle.setDescription("Bottled Ghost");
        inventory[5]=bottle;
        
        Items fish = new Items();
        fish.setAmount(0);
        fish.setDescription("Catfish");
        inventory[6]=fish;
        
        Items foot = new Items();
        foot.setAmount(0);
        foot.setDescription("Rabbit' Foot");
        inventory[7]=foot;
        
        Items fur = new Items();
        fur.setAmount(0);
        fur.setDescription("Leopard Fur");
        inventory[8]=fur;
        
        Items claw = new Items();
        claw.setAmount(0);
        claw.setDescription("Bear Claw Dounut");
        inventory[9]=claw;
        
        Items doll = new Items();
        doll.setAmount(0);
        doll.setDescription("Barbie Doll");
        inventory[10]=doll;
        
        Items marbles = new Items();
        marbles.setAmount(0);
        marbles.setDescription("Marbles");
        inventory[11]=marbles;
        
        Items book = new Items();
        book.setAmount(0);
        book.setDescription("Encyclopedia");
        inventory[12]=book;
        
        Items shovel = new Items();
        shovel.setAmount(0);
        shovel.setDescription("Broken Shovel");
        inventory[13]=shovel;
        
        Items fist = new Items();
        fist.setAmount(1);
        fist.setDescription("Fist");
        inventory[14]=fist;
        
        Items bat = new Items();
        bat.setAmount(0);
        bat.setDescription("Baseball bat");
        inventory[15]=bat;
        
        Items brass = new Items();
        brass.setAmount(0);
        brass.setDescription("Brass Knuckles");
        inventory[16]=brass;
        
        Items club = new Items();
        club.setAmount(0);
        club.setDescription("Golf Club");
        inventory[17]=club;
        
        Items bludgeon = new Items();
        bludgeon.setAmount(0);
        bludgeon.setDescription("Bludgeon");
        inventory[18]=bludgeon;
        
        Items knife = new Items();
        knife.setAmount(0);
        knife.setDescription("Bowie Knife");
        inventory[19]=knife;
    
        return inventory;
    }

    public static Items[] getSortedInventoryList() {
        
        // get inventory list for the current game
        Items[] originalInventoryList = ZombieTakeover.getCurrentGame().getInventory();
        
        //make a copy, original list
        Items[] inventoryList = originalInventoryList.clone();
        
        //using a BubbleSort to sort the list of inventoryList by name
        Items tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++){
            for (int j = 0; j < inventoryList.length-1-i; j++){
                if (inventoryList[j].getDescription().compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
            }
        }
        return inventoryList;
    }

    public static void saveGame(Game currentGame, String filePath) 
            throws ActionException{
        try(FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(currentGame);
        }catch(IOException e){
            throw new ActionException(e.getMessage());
        }
    }

    public static void loadGame(String filePath) throws ActionException{
        Game game = null;
        try(FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            game = (Game) input.readObject();
            ZombieTakeover.setCurrentGame(game);
        }catch(FileNotFoundException fnfe){
            throw new ActionException(fnfe.getMessage());
        }catch(Exception e){
            throw new ActionException(e.getMessage());
        }
    }
}