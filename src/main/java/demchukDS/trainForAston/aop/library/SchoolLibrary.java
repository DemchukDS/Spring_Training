package demchukDS.trainForAston.aop.library;

import org.springframework.stereotype.Component;

@Component("schoolLibraryBean")
public class SchoolLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("We take a book in school library");
    }

    @Override
    public void getBook(Book book) {
        System.out.println("We take a book " + book.getTitle() + " in school library");
    }
}
