import org.joda.time.*;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String username;
    private final String name;
    private int age;
    private final DateTime DOB;
    private final int ID;
    private List<CourseProgramme> courses = new ArrayList<CourseProgramme>();
    private List<Modules> modules = new ArrayList<Modules>();

    public Student(String name, DateTime DOB, int ID,List<CourseProgramme> courses) {
        this.name = name;
        this.DOB = DOB;
        this.ID = ID;
        this.courses = courses;
        //this.modules = modules;
        setAge();
        String st = name + age;
        this.username= st.replaceAll("\\s+",""); // Removes white space

    }

    public void setAge() {
        age = new Period(DOB, DateTime.now()).getYears();
    }

    public List<Modules> getModules() {
        return modules;
    }

    public List<CourseProgramme> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    public DateTime getDOB() {
        return DOB;
    }

    public int getAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString(){
        return name;
    }
}