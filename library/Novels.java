package library;

public class Novels extends Book{
    public Novels(){};
    String name;
    public int m;
    String writer;
    int page;
    String classification="novel";
    int xinjiuchengdu;
    String summary;
    String hero;
    String heroine;
    public void m(int n){
        m=n;
    }
    public String returnClassification(){
        return classification;
    }
    public void bookSearch(){
        System.out.println("书名："+name);
        System.out.println("作者："+writer);
        System.out.println("页数："+page);
        System.out.println("分类："+classification);
        System.out.println("新旧程度："+xinjiuchengdu+"%");
        System.out.println("主要内容："+summary);
        System.out.println("男主："+hero);
        System.out.println("女主："+heroine);
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
        xinjiuchengdu=newxinjiuchengdu;
    }
    public String returnWriter(){
        return writer;
    }
    public int returnXinjiuchengdu(){
        return xinjiuchengdu;
    }
    public String returnName(){
        return name;
    }
    public int returnPage(){
        return page;
    }
}
