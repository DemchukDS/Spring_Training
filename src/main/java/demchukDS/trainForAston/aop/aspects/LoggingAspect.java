package demchukDS.trainForAston.aop.aspects;

import demchukDS.trainForAston.aop.library.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("demchukDS.trainForAston.aop.aspects.MyPointcuts.pointcutAllGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: Logging try to take a book/magazine! ----->");
    }

    @Before("demchukDS.trainForAston.aop.aspects.MyPointcuts.pointcutAllReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: Logging try to take a book/magazine! ----->");
    }

    @Before("demchukDS.trainForAston.aop.aspects.MyPointcuts.pointcutAllAddMethodsFromUniLibrary()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals(("addBook"))) {

            Object[] args = joinPoint.getArgs();
            for(Object arg : args) {
                if(arg instanceof Book) {
                    Book myBook = (Book) arg;
                    System.out.println(
                            "Information about book: title - " + myBook.getTitle() +
                            ", author - " + myBook.getAuthor() +
                            ", year of publication - " + myBook.getYearOfPublication()
                    );
                } else if(arg instanceof String) {
                    System.out.println("The book in library add " + arg);
                }
            }
        }

        System.out.println("beforeAddLoggingAdvice: Logging try to take a book/magazine! ----->");
    }
}