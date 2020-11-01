/*
 * JUint Testing for the StudentMark Class.
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
public class StudentMarkTest {
    
    public StudentMarkTest() {
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
     * Test of main method, of class StudentMark.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StudentMark.main(args);
        
    }

    /**
     * Test of initCourse method, of class StudentMark.
     */
    @Test
    public void testInitCourse() {
        System.out.println("initCourse");
        StudentMark.initCourse();
        
    }

    /**
     * Test of initStudent method, of class StudentMark.
     */
    @Test
    public void testInitStudent() {
        System.out.println("initStudent");
        StudentMark.initStudent();
        
    }

    /**
     * Test of updateModStu method, of class StudentMark.
     */
    @Test
    public void testUpdateModStu() {
        System.out.println("updateModStu");
        String mc = "";
        String cID = "";
        StudentMark.updateModStu(mc, cID);
        
    }
    
}
