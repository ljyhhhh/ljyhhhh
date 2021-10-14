package library;

public  class Book {
    int m;
    String classification;
    String name;
    String writer;
    int page;
    int xinjiuchengdu;
    public Book(){
    }
    public String returnClassification(){
        return classification;
    }
    public void bookSearch(){}
    public void m(int n){
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
