package library;
import library.Administrator;
import library.Book;
public class main {
    public static void main(String[]atssgsh){
        //创建管理员
        Administrator ad=new Administrator();
        //创建书
        LibraryBackstage li=new LibraryBackstage();
        ComicBooks aaa=new ComicBooks();
        aaa=ad.createComicBook("aaa","hhh",2039,100,"那个男人踏上了奇妙之旅");
        Novels bbb=new Novels();
        bbb=ad.createNovel("bbb","hehehe",2028,100,"男主杀了女主","nanzhu","nvzhu");
        ComicBooks ccc=new ComicBooks();
        ccc=ad.createComicBook("ccc","heiheihei",2020,100,"那个女人踏上了奇妙之旅");
        ProgrammingBooks ddd=new ProgrammingBooks();
        ddd=ad.createProgrammingBook("ddd","hahaha",2083,100,"java","http://xuejavahuisiren");
        Novels eee=new Novels();
        eee=ad.createNovel("eee","huihuihui",2038,100,"女主杀了男主","nanzhu","nvzhu");
        //创建书架
        ad.createShelves(3);
        //后台加书
        li.addBook(aaa);
        li.addBook(bbb);
        li.addBook(ccc);
        li.addBook(ddd);
        li.addBook(eee);
        //书架加书
        ad.addBooks(aaa,1,li);
        ad.addBooks(bbb,1,li);
        ad.addBooks(ccc,2,li);
        ad.addBooks(ddd,3,li);
        ad.addBooks(eee,3,li);
        //新建操作系统
        LoginSystem lo=new LoginSystem();
        //注册a
        User a;
        a=lo.registerNewUser("a");
        lo.userLogin(a);
        a.borrowBookshelf(ad,1);
        a.borrowBooks(eee,ad,a);
        lo.quit(a);
        //注册b
        User b;
        b=lo.registerNewUser("b");
        lo.userLogin(b);
        b.borrowBookshelf(ad,1);
        b.borrowBooks(ddd,ad,b);
        lo.quit(b);
        ad.addUserToBlacklist(b,ad,li);
        for(int i=0;i<ad.bookshelves.length;i++){
            for(int x=0;x<ad.bookshelves[i].books.size();x++){
                ad.bookshelves[i].books.get(x).rewriteXinjichengdu(50);
            }
        }
        System.out.println("第一个书架：");
        for(int i=0;i<ad.bookshelves[0].books.size();i++){
            System.out.println("第"+(i+1)+"本书：");
            ad.bookshelves[0].books.get(i).bookSearch();
        }
        System.out.println();
        System.out.println("第二个书架：");
        for(int i=0;i<ad.bookshelves[1].books.size();i++){
            System.out.println("第"+(i+1)+"本书：");
            ad.bookshelves[1].books.get(i).bookSearch();
        }
        System.out.println();
        System.out.println("第三个书架：");
        for(int i=0;i<ad.bookshelves[2].books.size();i++){
            System.out.println("第"+(i+1)+"本书：");
            ad.bookshelves[2].books.get(i).bookSearch();
        }
        System.out.println();
        System.out.println("a的所有书：");
        a.putOutBookList("all");
        System.out.println();
        System.out.println("a的小说：");
        a.putOutBookList("novel");
        System.out.println();
        System.out.println("b的所有书：");
        b.putOutBookList("all");
    }
}
