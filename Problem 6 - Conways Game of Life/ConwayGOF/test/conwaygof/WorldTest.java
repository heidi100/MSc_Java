/*
 * JUnit Testing for the World Class.
 */
package conwaygof;

import java.awt.Graphics;
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
public class WorldTest {
    
    public WorldTest() {
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
     * Test of makeWorld method, of class World.
     */
    @Test
    public void testMakeWorld() {
        System.out.println("makeWorld");
        World instance = new World();
        instance.makeWorld();
        
    }

    /**
     * Test of startButton method, of class World.
     */
    @Test
    public void testStartButton() {
        System.out.println("startButton");
        World instance = new World();
        instance.startButton();
        
    }

    /**
     * Test of resetButton method, of class World.
     */
    @Test
    public void testResetButton() {
        System.out.println("resetButton");
        World instance = new World();
        instance.resetButton();
        
    }

    /**
     * Test of pauseButton method, of class World.
     */
    @Test
    public void testPauseButton() {
        System.out.println("pauseButton");
        World instance = new World();
        instance.pauseButton();
        
    }

    /**
     * Test of speedButton method, of class World.
     */
    @Test
    public void testSpeedButton() {
        System.out.println("speedButton");
        World instance = new World();
        instance.speedButton();
        
    }

    /**
     * Test of updateWorld method, of class World.
     */
    @Test
    public void testUpdateWorld() {
        System.out.println("updateWorld");
        World instance = new World();
        instance.updateWorld();
        
    }

    /**
     * Test of checkGameRules method, of class World.
     */
    @Test
    public void testCheckGameRules() {
        System.out.println("checkGameRules");
        Life cell = null;
        Life cell1 = null;
        World instance = new World();
        instance.checkGameRules(cell, cell1);
        
    }

    /**
     * Test of paintComponent method, of class World.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics gr = null;
        World instance = new World();
        instance.paintComponent(gr);
        
    }
    
}
