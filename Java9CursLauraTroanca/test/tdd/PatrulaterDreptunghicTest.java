/*
 * Test Class for Class PatrulaterDreptunghic
 */
package tdd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Troanca
 */
public class PatrulaterDreptunghicTest {
    
    public PatrulaterDreptunghicTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDefinition method, of class PatrulaterDreptunghic.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        PatrulaterDreptunghic instance = new PatrulaterDreptunghic();
        String expResult = " a plane figure with four straight sides and four right angles";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
