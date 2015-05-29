/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zTakeover.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author The King's Wit
 */
public class SceneControlTest {
    
    public SceneControlTest() {
    }
    /**
     * Test cases for algorithm
     */
    @Test
    public void testCombatSpellDamage() {
        System.out.println("combatSpellDamage");
        /**
         * Test Case 1
         */
        System.out.println("\tTest case #1");
        double stepCounter = 1.0;
        double numItems = 4.0;
        double randomNum = 2.0;
        SceneControl instance = new SceneControl();
        double expResult = 17.0;
        double result = instance.combatSpellDamage(stepCounter, numItems,randomNum);
        assertEquals(expResult, result, 0.01);
        
        /**
         * Test Case 2
         */
        System.out.println("\tTest case #2");
        stepCounter = -2.0;
        numItems = 5.0;
        randomNum = 1.0;
        expResult = -1.0;
        result = instance.combatSpellDamage(stepCounter, numItems,randomNum);
        assertEquals(expResult, result, 0.0);
        
        /**
         * Test Case 3
         */
        System.out.println("\tTest case #3");
        stepCounter = 3.0;
        numItems = -1.0;
        randomNum = 2.0;
        expResult = -1.0;
        result = instance.combatSpellDamage(stepCounter, numItems,randomNum);
        assertEquals(expResult, result, 0.0);
        
        /**
         * Test Case 4
         */
        System.out.println("\tTest case #4");
        stepCounter = 4.0;
        numItems = 2.0;
        randomNum = -1.0;
        expResult = -1.0;
        result = instance.combatSpellDamage(stepCounter, numItems,randomNum);
        assertEquals(expResult, result, 0.0);
        
        /**
         * Test Case 5
         */
        System.out.println("\tTest case #5");
        stepCounter = 1.0;
        numItems = 0.0;
        randomNum = 0.0;
        expResult = 2.0;
        result = instance.combatSpellDamage(stepCounter, numItems,randomNum);
        assertEquals(expResult, result, 0.0);
        
        /**
         * Test Case 6
         */
        System.out.println("\tTest case #6");
        stepCounter = 1.0;
        numItems = 15.0;
        randomNum=1.0;
        expResult = 16.0;
        result = instance.combatSpellDamage(stepCounter, numItems,randomNum);
        assertEquals(expResult, result, 0.0);
        
        /**
         * Test Case 7
         */
        System.out.println("\tTest case #7");
        stepCounter = 7.0;
        numItems = 3.0;
        randomNum=2.0;
        expResult = 16.0;
        result = instance.combatSpellDamage(stepCounter, numItems,randomNum);
        assertEquals(expResult, result, 0.0);
        
    }
}
