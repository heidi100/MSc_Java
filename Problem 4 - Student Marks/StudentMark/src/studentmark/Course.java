/*
 * Course for the student marking system.
 * This class creates the fields needed for a course entry to be added to the system.
 */
package studentmark;

import java.util.ArrayList;

/**
 * @author Heidi Portwine (s6110438)
 */
public class Course 
{
    // Initialises the array lists students and modules.
    ArrayList<Student> students;
    ArrayList<Module> module;
    String code;
    String title;
    
    /**
     * Empty Constructor.
     */
    public Course()
    {
        
    }
    
    /**
     * Course created with a course code, course title and modules.
     * @param c
     * @param t
     * @param mod 
     */
    public Course(String c, String t,ArrayList mod)
    {
        code = c;
        title = t;
        module = mod;
        students = new ArrayList();
    }
    
    /**
     * Course created with a course code, course title, modules and students.
     * @param c
     * @param t
     * @param mod
     * @param stu 
     */
    public Course(String c, String t,ArrayList mod, ArrayList stu)
    {
        code = c;
        title = t;
        module = mod;
        students = stu;
    }
    
    /**
     * Adds a student to the course.
     * @param stu 
     */
    public void addStudent(Student stu)
    {
        students.add(stu);
    }

    /**
     * Gets a list of students for the course.
     * @return students
     */
    public ArrayList<Student> getStudents() 
    {
        return students;
    }

    /**
     * Sets students on the course.
     * @param students 
     */
    public void setStudents(ArrayList<Student> students) 
    {
        this.students = students;
    }

    /**
     * Gets the modules for the course.
     * @return module
     */
    public ArrayList<Module> getModule() 
    {
        return module;
    }

    /**
     * Sets the modules on the course.
     * @param module 
     */
    public void setModule(ArrayList<Module> module) 
    {
        this.module = module;
    }

    /**
     * Gets the course code.
     * @return code
     */
    public String getCode() 
    {
        return code;
    }

    /**
     * Sets the course code.
     * @param code 
     */
    public void setCode(String code) 
    {
        this.code = code;
    }

    /**
     * Gets the course title.
     * @return title
     */
    public String getTitle() 
    {
        return title;
    }

    /**
     * Sets the course title.
     * @param title 
     */
    public void setTitle(String title) 
    {
        this.title = title;
    }
    
}
