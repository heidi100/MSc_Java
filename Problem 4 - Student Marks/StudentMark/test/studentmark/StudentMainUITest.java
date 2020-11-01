/*
 * JUint Testing for the StudentMainUI Class.
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
public class StudentMainUITest {
    
    public StudentMainUITest() {
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
     * Test of initStudentList method, of class StudentMainUI.
     */
    @Test
    public void testInitStudentList() {
        System.out.println("initStudentList");
        StudentMainUI instance = null;
        instance.initStudentList();
        
    }

    /**
     * Test of main method, of class StudentMainUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StudentMainUI.main(args);
        
    }
    
}
