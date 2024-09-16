package Java_playground;

public class Book2 {

    private String title;
    private String author;
    private int year;

    public Book2(){
    title = " Boksson";
    author = "Sven Svensson";
    year = 1996;

    }

    public void printDetails () {
        System.out.println("Title" + title);
        System.out.println("Author" + author);
        System.out.println("Year" + year);
    }

    public static void main(String[] args) {
        Book book2 = new Book();
        book2.printDetails();
    }
}




