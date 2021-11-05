import java.util.ArrayList;
import java.util.List;

public class Modules {

    private final String moduleName;
    private final String ID;
    List<Student> students = new ArrayList<Student>();

    //private List<CourseProgramme> courses = new ArrayList<CourseProgramme>();

    public Modules(String moduleName, String ID ) {
        this.moduleName = moduleName;
        this.ID = ID;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getID() {
        return ID;
    }

    public List<Student> getStudents() {
        return students;
    }


    public void addStudent(Student s) {
        students.add(s);
    }

    @Override
    public String toString(){
        return moduleName;
    }
}