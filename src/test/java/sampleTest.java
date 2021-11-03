import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class sampleTest {
    @Test
    public void test() {


        Modules m1 = new Modules("Mobile Architecture Engineering", "EE-517");
        Modules m2 = new Modules("Software Engineering", "CT-417");

        CourseProgramme c1 = new CourseProgramme("ECE", new DateTime(2021, 9, 1, 0, 0), new DateTime(2022, 6, 1, 0, 0));
        CourseProgramme c2 = new CourseProgramme("EEE", new DateTime(2021, 9, 1, 0, 0), new DateTime(2022, 6, 1, 0, 0));
        ArrayList courses = new ArrayList();
        c1.addModule(m1);
        c1.addModule(m2);
        c2.addModule(m1);
        courses.add(c1);
        courses.add(c2);
        Student s1 = new Student("JP", new DateTime(1999, 12, 20, 0, 0), 17111111, courses );
        m1.addStudent(s1);
        System.out.println(m1.getStudents());
        System.out.println(m1.getStudents().get(0).getUsername());
        System.out.println(s1.getCourses());
        System.out.print("Hello");
    }

}