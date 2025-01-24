package demchukDS.trainForAston.aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary{

    @Override
    public void getBook() {
        System.out.println("We take a book in university library");
    }

    @Override
    public void getBook(Book book) {
        System.out.println("We take a book " + book.getTitle() + " in university library");
    }

    public void returnBook() {
        System.out.println("We return the book in university library");
    }

    public void getMagazine() {
        System.out.println("We take a magazine in university library");
    }
}
