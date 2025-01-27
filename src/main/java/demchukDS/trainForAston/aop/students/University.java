package demchukDS.trainForAston.aop.students;

import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Component("universityBean")
public class University {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent() {
        Student tempStudent1 = new Student(
                "Dmitriy",
                "Demchuk",
                Date.valueOf("1995-06-06"),
                9.7,
                4
        );
        Student tempStudent2 = new Student(
                "Vladislav",
                "Kobrusev",
                Date.valueOf("1996-01-23"),
                9.3,
                3
        );
        Student tempStudent3 = new Student(
                "Viktoria",
                "Demchuk",
                Date.valueOf("1999-05-10"),
                8.7,
                1
        );
        studentList.add(tempStudent1);
        studentList.add(tempStudent2);
        studentList.add(tempStudent3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudents(): ");
        System.out.println(studentList);
        return studentList;
    }
}
