/*
 * Students for the student marking system.
 * This class creates the fields needed for a student entry to be added to the system.
 */
package studentmark;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Heidi Portwine (S6110438)
 */
public class Student 
{
    // Variable for the class declared.
    private String studentID;
    private String fName;
    private String lName;
    private String course;
    HashMap<String, Integer> marks;
    
    /**
     * Empty constructor method created.
     */
    public Student()
    {
        
    }
    
    /**
     * Student created with a student ID, first name, last name, course.
     * @param st
     * @param fn
     * @param ln
     * @param c 
     */
    public Student(String st, String fn, String ln, String c)
    {
        studentID = st;
        fName = fn;
        lName = ln;
        course = c;
        marks = new HashMap<>();
    }

    /**
     * Gets the students first name.
     * @return fName
     */
    public String getfName() 
    {
        return fName;
    }

    /**
     * Sets the students first name.
     * @param fName 
     */
    public void setfName(String fName) 
    {
        this.fName = fName;
    }

    /**
     * Gets the students last name.
     * @return lName
     */
    public String getlName() 
    {
        return lName;
    }

    /**
     * Sets the students last name.
     * @param lName 
     */
    public void setlName(String lName) 
    {
        this.lName = lName;
    }

    /**
     * Gets the course the student is on.
     * @return course
     */
    public String getCourse() 
    {
        return course;
    }

    /**
     * Sets the course the student is on.
     * @param course 
     */
    public void setCourse(String course) 
    {
        this.course = course;
    }

    /**
     * Gets the marks for the course module in a hashmap.
     * @return marks.
     */
    public HashMap<String, Integer> getMarks() 
    {
        return marks;
    }

    /**
     * Sets the students marks.
     * @param marks 
     */
    public void setMarks(HashMap<String, Integer> marks) 
    {
        this.marks = marks;
    }

    /**
     * Gets the students ID.
     * @return studentID
     */
    public String getStudentID() 
    {
        return studentID;
    }

    /**
     * Sets the students ID.
     * @param studentID 
     */
    public void setStudentID(String studentID) 
    {
        this.studentID = studentID;
    }
    
    /**
     * Adds a module mark for the student.
     * @param c
     * @param ma 
     */
    public void addModMark(String c, int ma)
    {
        // Checks is the course mark is null.
        if(marks.get(c) == null)
        {
            // Adds the mark to the hashmap.
            marks.put(c, ma);
        }
    }
    
    /**
     * Gets the students average mark for all marks.
     * @return total/count
     */
    public double getAverage()
    {
        // Initialises the variables.
        int total = 0;
        int count = 0;
        
        // Loops through the hashmap checking the marks.
        for(Map.Entry m : marks.entrySet())
        {
            // Adds together all the marks to gain a total.
            total += Integer.parseInt(m.getValue().toString());
            count++;
        }
        // Divides the total of marks by the count of how many marks there where.
        return total/count;
    }
    
    /**
     * Gets the students total number of passes.
     * @param c
     * @return total
     */
    public int getPasses(Course c)
    {
        // Initalises variable.
        int total = 0;
        
        // Loops through the hashmap checking the marks.
        for(Map.Entry m : marks.entrySet())
        {
            // Sets variables to equal data gathered from the map.
            String code = m.getKey().toString();
            int ma = Integer.parseInt(m.getValue().toString());
            
            // Loops through the course modules. 
            for(Module mod : c.getModule())
            {
                // Checks if the module code is equal to the module code from the map.
                if(mod.getCode().equals(code))
                {
                    // Sets pass as the module pass mark.
                    int pass = mod.getPassMark();
                    
                    // Checks if the students mark is greater than or equal 
                    // to the pass mark of the module.
                    if(ma >= pass)
                    {
                        // Increments the total.
                        total++;
                    }
                }
            }
        }
        return total;
    }
    
    /**
     * Getst the total number of fails for the student.
     * @param c
     * @return total
     */
    public int getFails(Course c)
    {
        // Initalises the varibale.
        int total = 0;
        
        // Loops through the hashmap checking the marks.
        for(Map.Entry m : marks.entrySet())
        {
            // Sets variables to equal data gathered from the map.
            String code = m.getKey().toString();
            int ma = Integer.parseInt(m.getValue().toString());
            
            // Loops through the course modules. 
            for(Module mod : c.getModule())
            {
                // Checks if the module code is equal to the module code from the map.
                if(mod.getCode().equals(code))
                {
                    // Sets pass as the module pass mark.
                    int pass = mod.getPassMark();
                    
                    // Checks if the students mark is less than the pass mark for the module.
                    if(ma < pass)
                    {
                        // Increments the total.
                        total++;
                    }
                }
            }
        }
        return total;   
    }
}
