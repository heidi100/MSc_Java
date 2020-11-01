/*
 * Student Marks Problem + Additional.
 * A simple UI linking to a dataset of student marks where each student has a 
 * name, an id and a range of marks for their modules. The UI allows new 
 * students to be added; new marks to be added and provides various lookup 
 * functions and facilities to check the average mark & number of passes/fails 
 * for a given student.
 * Additional : Module statistics; the UI provides various lookup functions and 
 * facilities to check the average mark & number of passes/fails for a given module.
 */
package studentmark;

import java.util.ArrayList;

/**
 * @author Heidi Portwine (s6110438)
 */
public class StudentMark 
{
    // Variables declared.
    static ArrayList<Course> courses = new ArrayList<>();
    static Course c1, c2;
    
    /**
     * Main method of Student Mark class.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Calls initCourse and initStudent to grab data.
        initCourse();
        initStudent();
        StudentMainUI main = new StudentMainUI(courses);
        main.setVisible(true);
    }
    
    
    /**
     * Initalises the courses for the system.
     */
    public static void initCourse()
    {
        // Creates an arrayList of module.
        ArrayList<Module> mod1 = new ArrayList<>();
        // Creates the module objects used for the system.
        Module m1 = new Module("432","Object Oriented Programming",40,0);
        Module m2 = new Module("754","Machine Learning",40,0);
        Module m3 = new Module("287","3D Animation",40,0);
        Module m4 = new Module("486","Android App Development",40,0);
        // Adds the modules to the array lists.
        mod1.add(m1);
        mod1.add(m2);
        mod1.add(m3);
        mod1.add(m4);
        // Creates a new course.
        c1 = new Course("COM4987_N","Computer Science",mod1);
        courses.add(c1);

        // For the second course and its modules.
        ArrayList<Module> mod2 = new ArrayList<>();
        Module m5 = new Module("123","Games Prototyping",40,0);
        Module m6 = new Module("453","Games Studies",40,0);
        Module m7 = new Module("876","Mission Design",40,0);
        Module m8 = new Module("543","Games Future",40,0);
        mod2.add(m5);
        mod2.add(m6);
        mod2.add(m7);
        mod2.add(m8);
        c2 = new Course("COM9512_N","Computer Games Design",mod2);
        courses.add(c2);
    }
    
    /**
     * Initalises the students for the system.
     */
    public static void initStudent()
    {
        // Creates an arrayList of students.
        ArrayList<Student> stu1 = new ArrayList<>();
        ArrayList<Student> stu2 = new ArrayList<>();
        
        // Creates a new student
        Student s1 = new Student("S6464921", "Bob", "Green", "COM9512_N");
        // Adds the module marks for the student.
        s1.addModMark("123", 50);
        s1.addModMark("453", 30);
        
        // Calls updateModStu to update the system.
        updateModStu("123", "COM9512_N");
        updateModStu("453", "COM9512_N");
        
        // For the second student.
        Student s2 = new Student("S6110375", "Sally", "Brown", "COM4987_N");
        s2.addModMark("754", 45); 
        updateModStu("754", "COM4987_N");
        stu1.add(s1);
        stu2.add(s2);
        
        // Sets cIndex a certain course and sets the students on the course.
        int cIndex1 = courses.indexOf(c1);
        courses.get(cIndex1).setStudents(stu2);
        int cIndex2 = courses.indexOf(c2);
        courses.get(cIndex2).setStudents(stu1);
    }
    
    /**
     * This method is called to update the module students.
     * @param mc
     * @param cID 
     */
    public static void updateModStu(String mc, String cID)
    {
        // Initalises the variables.
        int cIndex = 0;
        int mIndex = 0;
        Course course = null;
        
        // Loops through the courses.
        for(Course c : courses)
        {
            // checks if the course code is equal to the current course code.
            if(c.getCode().equals(cID))
            {
                course = c;
                cIndex = courses.indexOf(c);
            }
        }
        
        // Sets the module variable to null.
        Module mod = null;
        
        // Loops through the modules.
        for(Module m : course.getModule())
        {
            // Checks if the module code is equal to the current module code.
            if(m.getCode().equals(mc))
            {
                mod = m;
            }
        }
        mIndex = courses.get(cIndex).getModule().indexOf(mod);
        
        // Updates the stident number.
        int studNum = courses.get(cIndex).getModule().get(mIndex).getStudentNumber() +1;
        courses.get(cIndex).getModule().get(mIndex).setStudentNumber(studNum);
    }
}
