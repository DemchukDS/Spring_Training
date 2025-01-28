package demchukDS.trainForAston.aop.library;

import demchukDS.trainForAston.aop.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("The method main is starting...");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibraryBean", UniLibrary.class);
        String bookName = uniLibrary.returnBook();
        System.out.println("In library return the book \"" + bookName + "\"");

        context.close();
        System.out.println("The method main is ending...");
    }
}
