import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

public class sampleTest {
    @Test
    public void test() {
        Student s1 = new Student("JP", new DateTime(1999, 12, 20, 0, 0), 17111111);
        Modules m1 = new Modules("Mobile Architecture Engineering", "EE-517");

        CourseProgramme c1 = new CourseProgramme("ECE", new DateTime(2021, 9, 1, 0, 0), new DateTime(2022, 6, 1, 0, 0));
        // CourseProgramme c2= new CourseProgramme("CS",new DateTime(2021,9,1,0,0),new
        // DateTime(2022,6,1,0,0));

        c1.addModule(m1);
        m1.addStudent(s1);
        System.out.println(m1.getStudents());
        System.out.println(m1.getStudents().get(0).getUsername());
        System.out.print("Hello");
    }

}