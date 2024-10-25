package codealongs.Java_playground;

public class Book1 { //Create a Book class with the following properties: title (String), author (String), and year (int).
    // Implement a parameterless constructor that initializes the properties with default values. 
    //Create an instance of the Book class using the default constructor and print the details.
public String title;
public String author;
private int year;

public Book1() {
    title = "Min bok";
    author = "Bok Boksson";
    year = 2024;

}

public static void main(String[] args) {
    System.out.println("Title:" + title);
}
    
}
