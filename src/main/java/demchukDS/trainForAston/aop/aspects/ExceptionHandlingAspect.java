package demchukDS.trainForAston.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("demchukDS.trainForAston.aop.aspects.MyPointcuts.pointcutAllGetMethodsFromUniLibrary()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.println("beforeGetExceptionHandlingAdvice: " +
                "Handling exceptions when trying to get the book/magazine! ----->");
    }

    @Before("demchukDS.trainForAston.aop.aspects.MyPointcuts.pointcutAllReturnMethodsFromUniLibrary()")
    public void beforeReturningExceptionHandlingAdvice() {
        System.out.println("beforeReturningExceptionHandlingAdvice: " +
                "Handling exceptions when trying to return the book/magazine! ----->");
    }
}
