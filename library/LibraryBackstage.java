package library;

import java.util.ArrayList;
import java.util.List;

public class LibraryBackstage {
    List<Book> BackStage=new ArrayList<>();
    public void addBook(Book book){
        BackStage.add(book);
    }
}
