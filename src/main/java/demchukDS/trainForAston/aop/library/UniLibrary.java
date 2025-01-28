package demchukDS.trainForAston.aop.library;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary{

    @Override
    public void getBook() {
        System.out.println("We take a book in university library");
        System.out.println("------------------------------------------------------");
    }

    @Override
    public void getBook(Book book) {
        System.out.println("We take a book " + book.getTitle() + " in university library");
        System.out.println("------------------------------------------------------");
    }

    public String returnBook() {
        System.out.println("We return the book in university library");
        return "Война и мир";
    }

    public void getMagazine() {
        System.out.println("We take a magazine in university library");
        System.out.println("------------------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We return the magazine in university library");
        System.out.println("------------------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("We add a new book in university library");
        System.out.println("------------------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("We add a new magazine in university library");
        System.out.println("------------------------------------------------------");
    }
}
