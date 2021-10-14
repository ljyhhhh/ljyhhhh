package library;
import library.Book;
import library.Administrator;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    List<Book> booklist=new ArrayList<>();

    public User(String Username){
        name=Username;
    };
    public void borrowBooks(Book book,Administrator ad,User k){
       if(ad.userblacklist.contains(k)){
           return;
       }
        booklist.add(book);
       for(int i=0;i<ad.bookshelves.length;i++)
       {
           for(int x=0;x<ad.bookshelves[i].books.size();x++)
           {
               if(ad.bookshelves[i].books.get(x)==book)
               {
                   ad.bookshelves[i].books.remove(x);
               }
           }
       }
    }
    public void returnBooks(Book book,LibraryBackstage li){
        booklist.remove(book);
        li.BackStage.add(book);
    }
    public void putOutBookList(String classf){
        if(classf!="all"){
        for(int i=0;i<booklist.size();i++){
            if(booklist.get(i).returnClassification()==classf){
                booklist.get(i).bookSearch();
            }
        }
        }
        if(classf=="all"){
            for(int i=0;i<booklist.size();i++){
                booklist.get(i).bookSearch();
            }
        }
    }
    public void librarySearch(String classif,Administrator ad){
        if(classif=="all"){
            for(int i=0;i<ad.bookshelves.length;i++){
                for(int x=0;x<ad.bookshelves[i].books.size();x++){
                    ad.bookshelves[i].books.get(x).bookSearch();
                }
            }
        }else{
            for(int i=0;i<ad.bookshelves.length;i++){
                for(int x=0;x<ad.bookshelves[i].books.size();x++) {
                    if (ad.bookshelves[i].books.get(x).returnClassification() == classif)
                    {
                        ad.bookshelves[i].books.get(x).bookSearch();
                    }
                }
            }
        }
    }
    public void borrowBookshelf(Administrator ad,int shelfnumber){
        while(!ad.bookshelves[shelfnumber-1].books.isEmpty()){
            booklist.add(ad.bookshelves[shelfnumber-1].books.get(0));
            ad.bookshelves[shelfnumber-1].books.remove(0);
        }
    }
}
