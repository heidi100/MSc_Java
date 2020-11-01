/*
 * JUnit Testing for the Module Class.
 */
package studentmark;

import java.util.ArrayList;
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
public class ModuleTest {
    
    public ModuleTest() {
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
     * Test of addStudent method, of class Module.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Module instance = new Module();
        instance.addStudent();
        
    }

    /**
     * Test of getAverage method, of class Module.
     */
    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        ArrayList<Student> students = null;
        Module instance = new Module();
        double expResult = 0.0;
        double result = instance.getAverage(students);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getPass method, of class Module.
     */
    @Test
    public void testGetPass() {
        System.out.println("getPass");
        ArrayList<Student> students = null;
        Module instance = new Module();
        int expResult = 0;
        int result = instance.getPass(students);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getFail method, of class Module.
     */
    @Test
    public void testGetFail() {
        System.out.println("getFail");
        ArrayList<Student> students = null;
        Module instance = new Module();
        int expResult = 0;
        int result = instance.getFail(students);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCode method, of class Module.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        Module instance = new Module();
        String expResult = "";
        String result = instance.getCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCode method, of class Module.
     */
    @Test
    public void testSetCode() {
        System.out.println("setCode");
        String code = "";
        Module instance = new Module();
        instance.setCode(code);
        
    }

    /**
     * Test of getModuleTitle method, of class Module.
     */
    @Test
    public void testGetModuleTitle() {
        System.out.println("getModuleTitle");
        Module instance = new Module();
        String expResult = "";
        String result = instance.getModuleTitle();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setModuleTitle method, of class Module.
     */
    @Test
    public void testSetModuleTitle() {
        System.out.println("setModuleTitle");
        String moduleTitle = "";
        Module instance = new Module();
        instance.setModuleTitle(moduleTitle);
        
    }

    /**
     * Test of getPassMark method, of class Module.
     */
    @Test
    public void testGetPassMark() {
        System.out.println("getPassMark");
        Module instance = new Module();
        int expResult = 0;
        int result = instance.getPassMark();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPassMark method, of class Module.
     */
    @Test
    public void testSetPassMark() {
        System.out.println("setPassMark");
        int passMark = 0;
        Module instance = new Module();
        instance.setPassMark(passMark);
        
    }

    /**
     * Test of getStudentNumber method, of class Module.
     */
    @Test
    public void testGetStudentNumber() {
        System.out.println("getStudentNumber");
        Module instance = new Module();
        int expResult = 0;
        int result = instance.getStudentNumber();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setStudentNumber method, of class Module.
     */
    @Test
    public void testSetStudentNumber() {
        System.out.println("setStudentNumber");
        int studentNumber = 0;
        Module instance = new Module();
        instance.setStudentNumber(studentNumber);
        
    }
    
}
