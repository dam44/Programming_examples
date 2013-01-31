/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterMashGroupProject;

import databaseManagement.Monster;
import databaseManagement.MonsterFactory;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Dan
 */
public class BreedTest {
    
    private Monster m;
    private Monster f;
    private Breed instance;
    
    public BreedTest() {
    }
    
    @Before
    public void setUp() {
        m = MonsterFactory.makeIt("Gary", 40, 40, 40, 40, "Doesn't matter");
        f = MonsterFactory.makeIt("Crabbies", 80, 80, 80, 80, "Don't care");
        instance = new Breed();
    }

    /**
     * Test of breedMonsters method, of class Breed.
     */
    @Test
    public void testBreedMonsters() {
        System.out.println("breedMonsters");
        Monster child = instance.breedMonsters(m, f, "Paranoid Android", "Don't care", false);
        assertTrue((child.getHeight() >= 55) && (child.getHeight() <= 70));
        assertTrue((child.getAggression() >= 55) && (child.getAggression() <= 70));
        assertTrue((child.getStrength() >= 55) && (child.getStrength() <= 70));
        assertTrue((child.getMaxAge() >= 55) && (child.getMaxAge() <= 70));
        assertEquals(0, child.getAge());
    }

    /**
     * Test of makeAttribute method, of class Breed.
     */
    @Test
    public void testMakeAttribute() {
        System.out.println("makeAttribute");
        int attrib1 = 40;
        int attrib2 = 80;
        int outCome = instance.makeAttribute(attrib1, attrib2);
        assertTrue((outCome >= 55) && (outCome <= 70));
    }

    /**
     * Test of generalAssess method, of class Breed.
     */
    @Test
    public void testGeneralAssess() {
        System.out.println("generalAssess");
        int expResult = 80;
        int result = instance.generalAssess(m);
        assertEquals(expResult, result);
    }
}
