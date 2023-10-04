package Books.src.cz.osu;

import cz.osu.Book;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void createNewBookInLibrary(String nameOfBook, String authorOfBook, double priceOfBook) {
        Book book = new Book(nameOfBook, authorOfBook, priceOfBook);
        this.books.add(book);
    }

    public void printAllBooks() {
        for (Book book : books) { // Book - typ(proměnná), book list knih
            book.printInfo();
        }
    }

    public double getPriceOfAllBooks() {
        double count = 0;
        for (Book book : books) {
            count = count + book.getPrice();
        }
        return count;
    }

    public int getBooksCount(String requiredAuthor) {
        int count = 0;
        for (Book book : books) {
            if ( book.getAuthor().equals(requiredAuthor)){ //if (book.getAuthor() == requiredAuthor))
                count ++;
            }
        }
        return count;
    }

    public int getBooksCount(double minimalRequiredPrice){
        int count = 0;
        for (Book book : books) {
            if (book.getPrice() >= minimalRequiredPrice){
                count++;
            }
        }return count;
    }

    public Book getBookIfExist(String nameOfBook){
        for(Book book : books){
            if(book.getName().equals(nameOfBook)) {
            return book;
            }
        }return null;
    }

    public Book[] getBooksWith(String requiredAuthor){
        ArrayList<Book> listOfBooks = new ArrayList<Book>();
        for(Book book : books){
            if(book.getAuthor().equals(requiredAuthor)){
                listOfBooks.add(book);
            }
        }return listOfBooks.toArray(new Book[listOfBooks.size()]);
    }

    public Book[] getBooksWith (int minimalRequiredPrice){
        ArrayList<Book> listOfBooks = new ArrayList<Book>();
        for(Book book : books){
            if(book.getPrice() >= minimalRequiredPrice){
                listOfBooks.add(book);
            }
        }return listOfBooks.toArray(new Book[listOfBooks.size()]);
    }
}