import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.List;

public class CourseProgramme {

    private final String courseName;
    List<Modules> modules = new ArrayList<Modules>();
    List<Student> students = new ArrayList<Student>();
    private final DateTime startDate;
    private final DateTime endDate;

    public CourseProgramme(String courseName, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return courseName;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public List<Modules> getModules() {
        return modules;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addModule(Modules m) {
        modules.add(m);
    }

    @Override
    public String toString(){
        return courseName;
    }
}