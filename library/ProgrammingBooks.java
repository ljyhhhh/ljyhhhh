package library;

public class ProgrammingBooks extends Book{
    public ProgrammingBooks(){};
    int m;
    String name;
    String writer;
    int page;
    String classification="programming books";
    int xinjiuchengdu;
    String language;
    String bokelianjie;
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
        System.out.println("语言种类："+language);
        System.out.println("作者博客链接："+bokelianjie);
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
}
