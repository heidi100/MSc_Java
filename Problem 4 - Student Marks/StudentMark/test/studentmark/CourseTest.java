/*
 * JUint Testing for the Course Class.
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
public class CourseTest {
    
    public CourseTest() {
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
     * Test of addStudent method, of class Course.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student stu = null;
        Course instance = new Course();
        instance.addStudent(stu);
        
    }

    /**
     * Test of getStudents method, of class Course.
     */
    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        Course instance = new Course();
        ArrayList<Student> expResult = null;
        ArrayList<Student> result = instance.getStudents();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setStudents method, of class Course.
     */
    @Test
    public void testSetStudents() {
        System.out.println("setStudents");
        ArrayList<Student> students = null;
        Course instance = new Course();
        instance.setStudents(students);
        
    }

    /**
     * Test of getModule method, of class Course.
     */
    @Test
    public void testGetModule() {
        System.out.println("getModule");
        Course instance = new Course();
        ArrayList<Module> expResult = null;
        ArrayList<Module> result = instance.getModule();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setModule method, of class Course.
     */
    @Test
    public void testSetModule() {
        System.out.println("setModule");
        ArrayList<Module> module = null;
        Course instance = new Course();
        instance.setModule(module);
        
    }

    /**
     * Test of getCode method, of class Course.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        Course instance = new Course();
        String expResult = "";
        String result = instance.getCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCode method, of class Course.
     */
    @Test
    public void testSetCode() {
        System.out.println("setCode");
        String code = "";
        Course instance = new Course();
        instance.setCode(code);
        
    }

    /**
     * Test of getTitle method, of class Course.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Course instance = new Course();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTitle method, of class Course.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Course instance = new Course();
        instance.setTitle(title);
        
    }
    
}
