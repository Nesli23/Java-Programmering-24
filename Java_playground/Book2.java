package Java_playground;

public class Book2 {

    String title;
    String author;
    int year;

    public Book2 (){
    title = " Sämsta boken";
    author = " Författare Författaresson";
    year =  1996;

    }
    
    public void printDetails () {
       System.out.println("Title" + title);
       System.out.println("Author" + author);
       System.out.println("Year" + year);
    }

    public static void main(String[] args) {
        Book2 book = new Book2();
        book.printDetails();
    }
}



