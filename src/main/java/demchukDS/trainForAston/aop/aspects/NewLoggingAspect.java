package demchukDS.trainForAston.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: In library try return the book!");

        long begin = System.currentTimeMillis();
        Object targetMethodResult = joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("aroundReturnBookLoggingAdvice: In library successful return the book!");
        System.out.println("aroundReturnBookLoggingAdvice: The method returnBook() completed the code in " +
                (end - begin) + " milliseconds!");

        return targetMethodResult;
    }
}
