package demchukDS.trainForAston.aop.aspects;

import demchukDS.trainForAston.aop.students.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.SimpleTimeZone;

@Component
@Aspect
public class UliversityLoogingAspect {

    @Before("execution(* getStudents())")
    public void BeforeGetStudentLoggingAdvice() {
        System.out.println("BeforeGetStudentLoggingAdvice: Logging students list before method getStudents");
    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void AfterReturningGetStudentLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//        String firstStudentName = firstStudent.getName();
//        String firstStudentSurname = firstStudent.getSurname();
//
//        firstStudentName = "Mr. " + firstStudentName;
//        firstStudent.setName(firstStudentName);
//
//        double averageGrade = firstStudent.getAverageGrade();
//        averageGrade = 7.3d;
//        firstStudent.setAverageGrade(averageGrade);
//
//        System.out.println("AfterReturningGetStudentLoggingAdvice: Logging students list after method getStudents");
//    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void AfterThrowingGetStudentLoggingAdvice(Throwable exception) {


        System.out.println(
                "AfterThrowingGetStudentLoggingAdvice: Logging exception without method getStudents! " +
                        exception);
    }
}
