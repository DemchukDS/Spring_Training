package demchukDS.trainForAston.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* demchukDS.trainForAston.aop.UniLibrary.get*(..))")
    public void pointcutAllGetMethodsFromUniLibrary() {
    }

    @Pointcut("execution(* demchukDS.trainForAston.aop.UniLibrary.return*(..))")
    public void pointcutAllReturnMethodsFromUniLibrary() {
    }
}
