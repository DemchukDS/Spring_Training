package demchukDS.trainForAston.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Library library = (Library) context.getBean("libraryBean");
        library.getBook();

        context.close();
    }


}
