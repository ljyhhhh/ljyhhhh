package library;

public class ComicBooks extends Book{
    //书架，第几本书
    public ComicBooks(){};
    int m;
    String name;
    String writer;
    int page;
    String classification="comic book";
    int xinjiuchengdu;
    String summary;
    public String returnClassification(){
        return classification;
    }
    public void bookSearch(){
        System.out.println("书名："+name);
        System.out.println("作者："+writer);
        System.out.println("页数："+page);
        System.out.println("分类："+classification);
        System.out.println("新旧程度:"+xinjiuchengdu+"%");
        System.out.println("主要内容："+summary);
    }
    public void m(int n){
        m=n;
    }
    public int returnm(){
        return m;
    }
    public void rewriteName(String newname){
        name=newname;
    }
    public void rewriteWriter(String newwriter){
        writer=newwriter;
    }
    public void rewritePage(int newpage){
        page=newpage;
    }
    public void rewriteXinjichengdu(int newxinjiuchengdu){
        this.xinjiuchengdu=newxinjiuchengdu;
    }
}
