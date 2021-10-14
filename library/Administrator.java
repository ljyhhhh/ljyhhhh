package library;
import java.util.ArrayList;
import java.util.List;

public class Administrator {
    public Administrator(){};
    BookShelf[] bookshelves;
    List<User> userblacklist=new ArrayList<>();
    //创建书架
    public void createShelves(int m){
        bookshelves=new BookShelf[m];
        for(int i=0;i<m;i++){
            bookshelves[i]=new BookShelf();
        }//注意初始化！！！
    }
    //放入书
    public void addBooks(Book book, int shelfnumber, library.LibraryBackstage li){
        if(li.BackStage.contains(book)){
            li.BackStage.remove(book);
            bookshelves[shelfnumber-1].books.add(book);
            book.m(shelfnumber);
        }
    }
    //下架书
    public void deleteBooks(Book book,int shelfnumber,LibraryBackstage li) {
        for (int i = 0; i < bookshelves[shelfnumber - 1].books.size(); i++) {
            if (bookshelves[shelfnumber - 1].books.get(i) == book) {
                bookshelves[shelfnumber - 1].books.remove(i);
                li.BackStage.add(book);

            }
        }
    }
    public ComicBooks createComicBook(String name,String writer,int page,int xinjiuchengdu,String summary){
        ComicBooks a=new ComicBooks();
        a.name=name;
        a.writer=writer;
        a.page=page;
        a.xinjiuchengdu=xinjiuchengdu;
        a.summary=summary;
        return a;
    }
    public Novels createNovel(String name,String writer,int page,int xinjiuchengdu,String summary,String hero,String heroine){
        Novels a=new Novels();
        a.name=name;
        a.writer=writer;
        a.page=page;
        a.xinjiuchengdu=xinjiuchengdu;
        a.summary=summary;
        a.hero=hero;
        a.heroine=heroine;
        return a;
    }
    public ProgrammingBooks createProgrammingBook(String name,String writer,int page,int xinjiuchengdu,String language,String bokelianjie){
        ProgrammingBooks a=new ProgrammingBooks();
        a.name=name;
        a.writer=writer;
        a.page=page;
        a.xinjiuchengdu=xinjiuchengdu;
        a.language=language;
        a.bokelianjie=bokelianjie;
        return a;
    }
    public void addUserToBlacklist(User a,Administrator ad,LibraryBackstage li){
        userblacklist.add(a);
        while(!a.booklist.isEmpty()){
            a.returnBooks(a.booklist.get(0),li);
        }
    }
    public ComicBooks rewriteComicBook(String name,String writer,int page,int xinjiuchengdu,String summary){
        ComicBooks a=new ComicBooks();
        a.name=name;
        a.writer=writer;
        a.page=page;
        a.xinjiuchengdu=xinjiuchengdu;
        a.summary=summary;
        return a;
    }
    public Novels rewriteNovel(String name,String writer,int page,int xinjiuchengdu,String summary,String hero,String heroine){
        Novels a=new Novels();
        a.name=name;
        a.writer=writer;
        a.page=page;
        a.xinjiuchengdu=xinjiuchengdu;
        a.summary=summary;
        a.hero=hero;
        a.heroine=heroine;
        return a;
    }
    public ProgrammingBooks rewriteProgrammingBook(String name,String writer,int page,int xinjiuchengdu,String language,String bokelianjie){
        ProgrammingBooks a=new ProgrammingBooks();
        a.name=name;
        a.writer=writer;
        a.page=page;
        a.xinjiuchengdu=xinjiuchengdu;
        a.language=language;
        a.bokelianjie=bokelianjie;
        return a;
    }
}
