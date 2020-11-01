/*
 * Modules for the student marking system.
 * This class creates the fields needed for a module entry to be added to the system.
 */
package studentmark;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author Heidi Portwine (S6110438)
 */
public class Module 
{
    // Variable for the class declared.
    String code;
    String moduleTitle;
    int passMark;
    int studentNumber;
    
    /**
     * Empty Constructor Created.
     */
    public Module()
    {
        
    }
    
    /**
     * Module created with module code, module title, pass mark and a total of students.
     * @param c
     * @param t
     * @param p
     * @param s 
     */
    public Module(String c, String t, int p, int s)
    {
        code = c;
        moduleTitle = t;
        passMark = p;
        studentNumber = s;
    }
    
    /**
     * Adds a Student to a module.
     */
    public void addStudent()
    {
        // Increments student number by 1.
        studentNumber++;
    }
        
    /**
     * Gets the average mark for a module.
     * @param students
     * @return total/studentNumber
     */
    public double getAverage(ArrayList<Student> students)
    {
        // Initialise the variable.
        int total = 0;
        
        // Loops through students.
        for(Student stu : students)
        {
            // Loops through the hashmap checking the student marks.
            for(Map.Entry m : stu.getMarks().entrySet())
            {
                // Checks if the map key equals the module code.
                if(m.getKey().equals(code))
                {
                    // Adds together all the marks to gain a total.
                  total += Integer.parseInt(m.getValue().toString());  
                }
            }
        }
        // Divides the total of all marks by the number of students.
        return total/studentNumber;
    }
    
    /**
     * Gets the number of students who passed the module.
     * @param students
     * @return total
     */
    public int getPass(ArrayList<Student> students)
    {
        // Initalises the variable.
        int total = 0;
        
        // Loops through the students.
        for(Student stu : students)
        {
            // Checks the map for the student marks.
            for(Map.Entry m : stu.getMarks().entrySet())
            {
                // Checks if the map key equals the module code.
                if(m.getKey().equals(code))
                {
                    // Sets the mark as the value from the map.
                    int mark = Integer.parseInt(m.getValue().toString()); 
                    
                    // Checks if the mark is greater than or equal to the pass mark.
                    if(mark >= passMark)
                    {
                        // Increments the total by 1.
                        total++;
                    }
                }
            }
        }
        return total;
    }
    
    /**
     * Gets the number of fails for a module.
     * @param students
     * @return total
     */
    public int getFail(ArrayList<Student> students)
    {
        // Initalises the variable.
        int total = 0;
        
        // Loops through the students
        for(Student stu : students)
        {
            // Checks the map for student marks.
            for(Map.Entry m : stu.getMarks().entrySet())
            {
                // If the map key is equal to the module code.
                if(m.getKey().equals(code))
                {
                    // Set mark as the student mark from the map/
                    int mark = Integer.parseInt(m.getValue().toString()); 
                    
                    // Checks if the mark is less than the pass mark.
                    if(mark < passMark)
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
     * Gets the module code.
     * @return code
     */
    public String getCode()
    {
        return code;
    }

    /**
     * Sets the module code.
     * @param code 
     */
    public void setCode(String code) 
    {
        this.code = code;
    }

    /**
     * Gets the module title.
     * @return moduleTitle
     */
    public String getModuleTitle() 
    {
        return moduleTitle;
    }

    /**
     * Sets the module title.
     * @param moduleTitle 
     */
    public void setModuleTitle(String moduleTitle) 
    {
        this.moduleTitle = moduleTitle;
    }

    /**
     * Gets the pass mark for a module.
     * @return passMark
     */
    public int getPassMark() 
    {
        return passMark;
    }

    /**
     * Sets the pass mark.
     * @param passMark 
     */
    public void setPassMark(int passMark) 
    {
        this.passMark = passMark;
    }

    /**
     * Gets the student number for a module.
     * @return studentNumber
     */
    public int getStudentNumber() 
    {
        return studentNumber;
    }

    /**
     * Sets the student number for a module.
     * @param studentNumber 
     */
    public void setStudentNumber(int studentNumber) 
    {
        this.studentNumber = studentNumber;
    }
    
}
