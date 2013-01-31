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
public class FightTest {

    private Monster m;
    private Monster f;
    private Fight instance;

    public FightTest() {
    }

    @Before
    public void setUp() {
        m = MonsterFactory.makeIt("Gary", 0, 0, 0, 0, "Doesn't matter");
        f = MonsterFactory.makeIt("Crabbies", 100, 100, 100, 100, "Don't care");
        instance = new Fight();
    }

    /**
     * Test of determineWinner method, of class Fight.
     */
    @Test
    public void testDetermineWinner() {
        System.out.println("determineWinner");

        Monster expResult = f;
        Monster result = instance.determineWinner(m, f);
        assertEquals(expResult, result);
    }
    /**
     * Test of compareAttributesRetM1 method, of class Fight.
     */
    @Test
    public void testCompareAttributesRetM1() {
        System.out.println("compareAttributesRetM1");
        int outCome = instance.compareAttributesRetM1(f, m);
        assertTrue((outCome >= 90) && (outCome <= 100));
    }
}
