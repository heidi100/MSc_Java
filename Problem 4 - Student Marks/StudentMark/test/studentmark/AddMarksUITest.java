/*
 * JUnit Testing for the AddMarksUI Class.
 */
package studentmark;

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
public class AddMarksUITest {
    
    public AddMarksUITest() {
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
     * Test of initComboBox method, of class AddMarksUI.
     */
    @Test
    public void testInitComboBox() {
        System.out.println("initComboBox");
        AddMarksUI instance = null;
        instance.initComboBox();
        
    }

    /**
     * Test of main method, of class AddMarksUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AddMarksUI.main(args);
        
    }
    
}
