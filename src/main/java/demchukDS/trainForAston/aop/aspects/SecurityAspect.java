package demchukDS.trainForAston.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

    @Before("demchukDS.trainForAston.aop.aspects.MyPointcuts.pointcutAllGetMethodsFromUniLibrary()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: Check the rights to receive a book/magazine! ----->");
    }

    @Before("demchukDS.trainForAston.aop.aspects.MyPointcuts.pointcutAllReturnMethodsFromUniLibrary()")
    public void beforeReturnSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: Check the rights to receive a book/magazine! ----->");
    }
}
