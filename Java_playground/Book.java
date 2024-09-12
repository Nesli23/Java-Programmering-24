package Java_playground;

class Book {
    private String title;
    private String author;
    private int year;

    public Book() {
        title = "Harry Potter";
        author = "JK Rowling";
        year = 2023;

    }
    
    public void printDetails(){
        System.out.println("Title " + title);
        System.out.println("Author: " + author);
        System.out.println("Year:" + year);

    }
    public static void main(String[] args) {
        Book book = new Book();
        book.printDetails();

    }
}

