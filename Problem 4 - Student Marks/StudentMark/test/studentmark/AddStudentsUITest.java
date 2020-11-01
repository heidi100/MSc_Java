/*
 * JUnit Testing for the AddStudentsUI Class.
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
public class AddStudentsUITest {
    
    public AddStudentsUITest() {
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
     * Test of initComboBox method, of class AddStudentsUI.
     */
    @Test
    public void testInitComboBox() {
        System.out.println("initComboBox");
        AddStudentsUI instance = null;
        instance.initComboBox();
        
    }

    /**
     * Test of main method, of class AddStudentsUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AddStudentsUI.main(args);
        
    }
    
}
