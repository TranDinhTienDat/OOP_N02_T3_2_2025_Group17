public class testbook{
public static void meme(){
        Book myObj = new Book("a","b",2);//New book

        Book obj = new Book("nguyen", 100 );

        System.out.println("title: " + myObj.title + " Author: "+ myObj.author + " pages: "+myObj.numPages);

        System.out.println("author :" + obj.author + "page number : "+ obj.numPages);
    }
}