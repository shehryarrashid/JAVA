package Week15;

public class Book {

    private String name;
    private String ISBN;
    private String author;
    private String publisher;

    // Constructor

    public Book(String name,String ISBN, String author,String publisher){
        this.name = name;
        this.ISBN = ISBN;
        this.author = author;
        this.publisher = publisher;
    }
    // Public Methods

    public String getBookInfo(){
        return    "Title: " + this.name+
                        "\nAuthor: " + this.author +
                        "\nISBN: " + this.ISBN +
                        "\nPublisher: " + this.publisher +
                        "\n";
    }

    // Setters

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Getters

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }
}
