package demchukDS.trainForAston.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* demchukDS.trainForAston.aop.library.UniLibrary.get*(..))")
    public void pointcutAllGetMethodsFromUniLibrary() {
    }

    @Pointcut("execution(* demchukDS.trainForAston.aop.library.UniLibrary.return*(..))")
    public void pointcutAllReturnMethodsFromUniLibrary() {
    }

    @Pointcut("execution(* demchukDS.trainForAston.aop.library.UniLibrary.add*(..))")
    public void pointcutAllAddMethodsFromUniLibrary() {
    }
}
