package demchukDS.trainForAston.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {
    @Value("Преступление и наказание")
    private String title;
    private String author;



    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
