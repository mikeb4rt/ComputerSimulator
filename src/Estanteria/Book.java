package Estanteria;

public class Book {
    String title;
    String Author;
    int calification;

    public Book (String title, String author, int calification){
        this.title = title;
        this.Author = author;
        setCalification(calification);
    }
    //getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return Author;
    }
    public int getCalification() {
        return calification;
    }
    //setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        Author = author;
    }
    public void setCalification(int calification) {
        this.calification = calification;
    }
}
