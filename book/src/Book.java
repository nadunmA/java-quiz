public class Book {

    private String title;
    private String author;
    private int pCount;

    public Book(String title, String author, int pCount){
        this.title = title;
        this.author = author;
        this.pCount = pCount;
    }

    public void setTitle(){
        this.title = title;
    }

    public String getTitle(String title){
        return title;
    }

    public void setAuthor(){
        this.author = author;
    }

    public String getAuthor(String author){
        return author;
    }

    public void setPcount(){
        this.pCount = pCount;
    }

    public String gePcount(String pCount){
        return pCount;
    }

}
