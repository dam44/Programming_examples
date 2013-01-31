/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterMashGroupProject;

import databaseManagement.Monster;
import databaseManagement.MonsterFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dan
 */
public class WorthTest {
    
    private Monster m;
    private Monster n;
    private Worth instance;
    
    public WorthTest() {
    }
    @Before
    public void setUp() {
        m = MonsterFactory.makeIt("Jerry the Turtle", 100, 100, 100, 100, "Meh");
        n = MonsterFactory.makeIt("Barry the Zebra", 100, 100, 100, 100, "Mehhh");
        m.setAge(50);
        n.setAge(90);
        instance = new Worth();
    }
    /**
     * Test of Worth method, of class Worth.
     */
    @Test
    public void testWorth() {
        System.out.println("Worth");
        int resultm = instance.Worth(m);
        int resultn = instance.Worth(n);
        //assertEquals(200, resultm);
        assertEquals(120, resultn);
    }

    /**
     * Test of assessAge method, of class Worth.
     */
    @Test
    public void testAssessAge() {
        System.out.println("assessAge");
        int resultm = Worth.assessAge(m);
        int resultn = Worth.assessAge(n);
        //assertEquals(10, resultm);
        assertEquals(6, resultn);
    }
}
