package demchukDS.trainForAston.aop;

import demchukDS.trainForAston.aop.students.Student;
import demchukDS.trainForAston.aop.students.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("universityBean", University.class);

        university.addStudent();
        List<Student> students = university.getStudents();


        System.out.println(students);

        context.close();
    }
}
