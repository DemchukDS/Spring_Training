package demchukDS.trainForAston.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
}