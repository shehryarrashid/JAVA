package practice;

import java.util.*;

public class BookTest {


    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        Book bookone = new Book("1984","9780140817744","George Orwell","Amazon");
        Book booktwo = new Book("El Capitan Alatriste","9780140817744","Arturo Perez Reverte","Amazon");
        Book bookthree = new Book("How to Book","9780140817744","Paul Hollywood","Amazon");
        books.add(bookone);
        books.add(booktwo);
        books.add(bookthree);

        System.out.println(bookone.getBookInfo());

    }


}
