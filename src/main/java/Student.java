import org.joda.time.*;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String username;
    private final String studentName;
    private int age;
    private final DateTime DOB;
    private final int ID;
    private List<CourseProgramme> courses = new ArrayList<CourseProgramme>();
    private List<Modules> modules = new ArrayList<Modules>();

    public Student(String studentName, DateTime DOB, int ID,List<CourseProgramme> courses,List<Modules> modules ) {
        this.studentName = studentName;
        this.DOB = DOB;
        this.ID = ID;
        this.courses = courses;
        this.modules = modules;
        calculateAge();
        String st = studentName + age;
        this.username= st.replaceAll("\\s+",""); // Removes white space

    }
    public String getName() {
        return studentName;
    }

    public List<Modules> getModules() {
        return modules;
    }
    public String getUsername() {
        return username;
    }

    public List<CourseProgramme> getCourses() {
        return courses;
    }

    public DateTime getDOB() {
        return DOB;
    }

    public int getAge() {
        return age;
    }


    public int getID() {
        return ID;
    }

    public void calculateAge() {
        age = new Period(DOB, DateTime.now()).getYears();
    }

    @Override
    public String toString(){
        return studentName;
    }
}