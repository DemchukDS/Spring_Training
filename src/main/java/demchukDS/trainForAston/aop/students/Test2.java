package demchukDS.trainForAston.aop.students;

import demchukDS.trainForAston.aop.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("universityBean", University.class);
        university.addStudent();
        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        }
        catch (Exception e) {
            System.out.println("Exception " + e);
        }

        context.close();
    }
}
