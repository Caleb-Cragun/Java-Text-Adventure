/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.control;

import byui.cit260.zTakeover.exception.ActionException;
import byui.cit260.zTakeover.model.*;
import java.util.Random;
import zombietakeover.ZombieTakeover;

public class SceneControl {

    public static void checkScene() {
        Map map1 = ZombieTakeover.getCurrentGame().getMap();
        Items[] inv = ZombieTakeover.getCurrentGame().getInventory();
        Location[][] locations = map1.getLocations();
        Random chanceCube = new Random();
        int roll = chanceCube.nextInt(4) + 1;
        switch (locations[ZombieTakeover.getCurrentLocation().getX()][ZombieTakeover.getCurrentLocation().getY()].getScene()) {
            case sport_store:
                if (roll == 1 && inv[15].getAmount() == 0) {
                    double bat = inv[15].getAmount();
                    bat += 1;
                    inv[15].setAmount(bat);
                    System.out.println("You found " + inv[15].getDescription());
                } else if (roll == 2 && inv[17].getAmount() == 0) {
                    double club = inv[17].getAmount();
                    club += 1;
                    inv[17].setAmount(club);
                    System.out.println("You found " + inv[17].getDescription());
                } else if (roll == 3) {
                    double bar = inv[1].getAmount();
                    bar += 1;
                    inv[1].setAmount(bar);
                    System.out.println("You found " + inv[1].getDescription());
                } else {
                    System.out.println("\nYou find nothing.");
                }
                break;
            case donut_shop:
                if (roll == 1) {
                    double bread = inv[0].getAmount();
                    bread += 1;
                    inv[0].setAmount(bread);
                    System.out.println("You found " + inv[0].getDescription());
                } else if (roll == 2 && inv[8].getAmount() == 0) {
                    double bear = inv[8].getAmount();
                    bear += 1;
                    inv[8].setAmount(bear);
                    System.out.println("You found " + inv[8].getDescription());
                } else {
                    System.out.println("\nYou find nothing.");
                }
                break;
            case alley:
                if (roll == 1) {
                    double bread = inv[0].getAmount();
                    bread += 1;
                    inv[0].setAmount(bread);
                    System.out.println("You found " + inv[0].getDescription());
                } else if (roll == 2) {
                    double bar = inv[1].getAmount();
                    bar += 1;
                    inv[1].setAmount(bar);
                    System.out.println("You found " + inv[1].getDescription());
                } else if (roll == 3 && inv[16].getAmount() == 0) {
                    double brass = inv[16].getAmount();
                    brass += 1;
                    inv[16].setAmount(brass);
                    System.out.println("You found " + inv[16].getDescription());
                } else {
                    System.out.println("\nYou find nothing.");
                }
                break;
            case toy_store:
                if (roll == 1) {
                    double bar = inv[1].getAmount();
                    bar += 1;
                    inv[1].setAmount(bar);
                    System.out.println("You found " + inv[1].getDescription());
                } else if (roll == 2 && inv[10].getAmount() == 0) {
                    double barbie = inv[10].getAmount();
                    barbie += 1;
                    inv[10].setAmount(barbie);
                    System.out.println("You found " + inv[10].getDescription());
                } else if (roll == 3 && inv[11].getAmount() == 0) {
                    double marbles = inv[11].getAmount();
                    marbles += 1;
                    inv[11].setAmount(marbles);
                    System.out.println("You found " + inv[11].getDescription());
                } else {
                    System.out.println("\nYou find nothing.");
                }
                break;
            case magic_store:
                if (roll == 1 && inv[3].getAmount() == 0) {
                    double staff = inv[3].getAmount();
                    staff += 1;
                    inv[3].setAmount(staff);
                    System.out.println("You found " + inv[3].getDescription());
                } else if (roll == 2 && inv[18].getAmount() == 0) {
                    double blu = inv[18].getAmount();
                    blu += 1;
                    inv[18].setAmount(blu);
                    System.out.println("You found " + inv[18].getDescription());
                } else {
                    System.out.println("\nYou find nothing.");
                }
                break;
            case fire_house:
                if (roll == 1) {
                    double bur = inv[2].getAmount();
                    bur += 1;
                    inv[2].setAmount(bur);
                    System.out.println("You found " + inv[2].getDescription());
                } else if (roll == 2 && inv[4].getAmount() == 0) {
                    double fe = inv[4].getAmount();
                    fe += 1;
                    inv[4].setAmount(fe);
                    System.out.println("You found " + inv[4].getDescription());
                } else if (roll == 3 && inv[19].getAmount() == 0) {
                    double bk = inv[19].getAmount();
                    bk += 1;
                    inv[19].setAmount(bk);
                    System.out.println("You found " + inv[19].getDescription());
                } else {
                    System.out.println("\nYou find nothing.");
                }
                break;
            case pet_store:
                if (roll == 1 && inv[6].getAmount() == 0) {
                    double cf = inv[6].getAmount();
                    cf += 1;
                    inv[6].setAmount(cf);
                    System.out.println("You found " + inv[6].getDescription());
                } else {
                    System.out.println("\nYou find nothing.");
                }
                break;
            case book_store:
                if (roll == 1) {
                    double br = inv[0].getAmount();
                    br += 1;
                    inv[0].setAmount(br);
                    System.out.println("You found " + inv[0].getDescription());
                } else if (roll == 2 && inv[12].getAmount() == 0) {
                    double bk = inv[12].getAmount();
                    bk += 1;
                    inv[12].setAmount(bk);
                    System.out.println("You found " + inv[12].getDescription());
                } else {
                    System.out.println("\nYou find nothing.");
                }
                break;
            case fur_shop:
                if (roll == 1 && inv[7].getAmount() == 0) {
                    double rf = inv[7].getAmount();
                    rf += 1;
                    inv[7].setAmount(rf);
                    System.out.println("You found " + inv[7].getDescription());
                } else if (roll == 2 && inv[9].getAmount() == 0) {
                    double lf = inv[9].getAmount();
                    lf += 1;
                    inv[9].setAmount(lf);
                    System.out.println("You found " + inv[9].getDescription());
                } else {
                    System.out.println("\nYou find nothing.");
                }
                break;
            case hospital:
                if (roll == 1) {
                    double bread = inv[0].getAmount();
                    bread += 1;
                    inv[0].setAmount(bread);
                    System.out.println("You found " + inv[0].getDescription());
                } else if (roll == 2) {
                    double hb = inv[2].getAmount();
                    hb += 1;
                    inv[2].setAmount(hb);
                    System.out.println("You found " + inv[2].getDescription());
                } else if (roll == 3 && inv[5].getAmount() == 0) {
                    double eb = inv[5].getAmount();
                    eb += 1;
                    inv[5].setAmount(eb);
                    System.out.println("You found " + inv[5].getDescription());
                } else {
                    System.out.println("\nYou find nothing.");
                }
                break;
            case trap:
                checkEncounter();
                break;
            case start:
                if (roll == 1 && inv[13].getAmount() == 0) {
                    double shovel = inv[13].getAmount();
                    shovel += 1;
                    inv[13].setAmount(shovel);
                    System.out.println("You found " + inv[13].getDescription());
                } else {
                    System.out.println("\nYou find nothing.");
                }
                break;
            default:
                System.out.println("\nYou find nothing.");
        }
    }

    private static void checkEncounter() {
        System.out.println("*** checkEncounter function called ***");
    }

    public double combatSpellDamage(double stepCounter, double numItems, double randomNum) throws ActionException {
        if (stepCounter <= 0) {
            throw new ActionException("Invalid Stepcounter");
        } else if (numItems < 0) {
            throw new ActionException("Invalid number of items");
        } else if (randomNum < 0 || randomNum > 2) {
            throw new ActionException("Invalid random number");
        } else {
            double output = stepCounter + Math.pow(numItems, randomNum);
            return output;
        }
    }

    public double brokenShovelDamage(double stepCounter, double numItems, double randomNum) throws ActionException {
        if (stepCounter <= 0) {
            throw new ActionException("Invalid Stepcounter");
        } else if (numItems < 0) {
            throw new ActionException("Invalid number of items");
        } else if (randomNum < 0 || randomNum > 5) {
            throw new ActionException("Invalid random number");
        } else {
            double output = stepCounter + Math.pow(numItems, randomNum);
            return output;
        }
    }

    public boolean checkSpecialEncounter(double stepCounter, double numItems) throws ActionException {
        if (stepCounter <= 0) {
            throw new ActionException("Invalid Stepcounter");
        } else if (numItems < 0) {
            throw new ActionException("Invalid number of items");
        } else {
            double chance = Math.sqrt(stepCounter * numItems) % 2;

            if (chance == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

}
