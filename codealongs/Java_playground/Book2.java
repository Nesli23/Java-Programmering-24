package codealongs.Java_playground;

public class Book2 {

    public String title;
    public String author;
    public int year;

    public Book2() {
        title = " Harry Potter";
        author = " JK Rowling";
        year =  2000;

    }

    public void printDetails(){
    System.out.println("Title" + title);
    System.out.println("Author" + author);
    System.out.println("Year" + year);
    }
public static void main(String[] args) {
    Book2 book = new Book2();
    book.printDetails();
}
}



