/*
 * JUnit Testing for the Life Class.
 */
package conwaygof;

import java.awt.Graphics2D;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Heidi Portwine
 */
public class LifeTest {
    
    public LifeTest() {
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
     * Test of getColumn method, of class Life.
     */
    @Test
    public void testGetColumn() {
        System.out.println("getColumn");
        Life instance = null;
        int expResult = 0;
        int result = instance.getColumn();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getRow method, of class Life.
     */
    @Test
    public void testGetRow() {
        System.out.println("getRow");
        Life instance = null;
        int expResult = 0;
        int result = instance.getRow();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isCellAlive method, of class Life.
     */
    @Test
    public void testIsCellAlive() {
        System.out.println("isCellAlive");
        Life instance = null;
        boolean expResult = false;
        boolean result = instance.isCellAlive();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCellAlive method, of class Life.
     */
    @Test
    public void testSetCellAlive() {
        System.out.println("setCellAlive");
        boolean b = false;
        Life instance = null;
        instance.setCellAlive(b);
        
    }

    /**
     * Test of draw method, of class Life.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Graphics2D gr2 = null;
        Life instance = null;
        instance.draw(gr2);
        
    }

    /**
     * Test of repaint method, of class Life.
     */
    @Test
    public void testRepaint() {
        System.out.println("repaint");
        Life instance = null;
        instance.repaint();
        
    }
    
}
