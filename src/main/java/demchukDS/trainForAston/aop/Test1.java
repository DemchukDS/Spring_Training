package demchukDS.trainForAston.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibraryBean", UniLibrary.class);
        Book book = context.getBean("bookBean", Book.class);
        uniLibrary.getBook(book);
        uniLibrary.returnBook();


        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);

        context.close();
    }
}
