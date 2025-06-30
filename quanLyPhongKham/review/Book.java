public class Book {
    String title;
    String author;
    int numPages;
    Book(){}    ;// default constructor
    public Book(String t, String a, int p) {
        title = t;
        author = a;
        numPages = p;
    }
    public Book(String author, int page){
        author = author;
        numPages = page;

    }
}