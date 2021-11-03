import java.util.ArrayList;
import java.util.List;

public class Modules {

    private final String name;
    private final String ID;
    List<Student> students = new ArrayList<Student>();

    private List<CourseProgramme> courses = new ArrayList<CourseProgramme>();

    public Modules(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<CourseProgramme> getCourses() {
        return courses;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    @Override
    public String toString(){
        return name;
    }
}