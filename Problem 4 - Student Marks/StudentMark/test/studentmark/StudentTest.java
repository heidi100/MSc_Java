/*
 * JUint Testing for the Student Class.
 */
package studentmark;

import java.util.HashMap;
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
public class StudentTest {
    
    public StudentTest() {
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
     * Test of getfName method, of class Student.
     */
    @Test
    public void testGetfName() {
        System.out.println("getfName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getfName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setfName method, of class Student.
     */
    @Test
    public void testSetfName() {
        System.out.println("setfName");
        String fName = "";
        Student instance = new Student();
        instance.setfName(fName);
        
    }

    /**
     * Test of getlName method, of class Student.
     */
    @Test
    public void testGetlName() {
        System.out.println("getlName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getlName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setlName method, of class Student.
     */
    @Test
    public void testSetlName() {
        System.out.println("setlName");
        String lName = "";
        Student instance = new Student();
        instance.setlName(lName);
        
    }

    /**
     * Test of getCourse method, of class Student.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getCourse();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCourse method, of class Student.
     */
    @Test
    public void testSetCourse() {
        System.out.println("setCourse");
        String course = "";
        Student instance = new Student();
        instance.setCourse(course);
        
    }

    /**
     * Test of getMarks method, of class Student.
     */
    @Test
    public void testGetMarks() {
        System.out.println("getMarks");
        Student instance = new Student();
        HashMap<String, Integer> expResult = null;
        HashMap<String, Integer> result = instance.getMarks();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setMarks method, of class Student.
     */
    @Test
    public void testSetMarks() {
        System.out.println("setMarks");
        HashMap<String, Integer> marks = null;
        Student instance = new Student();
        instance.setMarks(marks);
        
    }

    /**
     * Test of getStudentID method, of class Student.
     */
    @Test
    public void testGetStudentID() {
        System.out.println("getStudentID");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getStudentID();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setStudentID method, of class Student.
     */
    @Test
    public void testSetStudentID() {
        System.out.println("setStudentID");
        String studentID = "";
        Student instance = new Student();
        instance.setStudentID(studentID);
        
    }

    /**
     * Test of addModMark method, of class Student.
     */
    @Test
    public void testAddModMark() {
        System.out.println("addModMark");
        String c = "";
        int ma = 0;
        Student instance = new Student();
        instance.addModMark(c, ma);
        
    }

    /**
     * Test of getAverage method, of class Student.
     */
    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        Student instance = new Student();
        double expResult = 0.0;
        double result = instance.getAverage();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getPasses method, of class Student.
     */
    @Test
    public void testGetPasses() {
        System.out.println("getPasses");
        Course c = null;
        Student instance = new Student();
        int expResult = 0;
        int result = instance.getPasses(c);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getFails method, of class Student.
     */
    @Test
    public void testGetFails() {
        System.out.println("getFails");
        Course c = null;
        Student instance = new Student();
        int expResult = 0;
        int result = instance.getFails(c);
        assertEquals(expResult, result);
        
    }
    
}
