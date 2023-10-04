import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books = new ArrayList<>();


    public void createNewBookInLibrary(String nameOfTheBook, String authorOfBook, double priceOfBook){
        books.add(new Book(nameOfTheBook,authorOfBook,priceOfBook));
    }

    public void printAllBooks(){
        for (Book book:books){
            book.printInfo();
        }
    }

    public double getPriceOfAllBooks(){
        double priceOut =0;
        for (Book book:books){
            priceOut = priceOut+book.getPrice();
        }
        return priceOut;
    }

    public int getBooksCount(String requiredAuthor){
        int countOut =0;
        for (Book book:books){
            if (book.getAuthor().equals(requiredAuthor)){
                countOut++;
            }
        }
        return countOut;
    }

    public int getBooksCount(double minimalRequiredPrice){
        int countOut =0;
        for (Book book:books){
            if (book.getPrice() >=minimalRequiredPrice){
                countOut++;
            }
        }
        return countOut;
    }
    public Book getBookIfExist(String nameOfBook){

        for (Book book:books){
            if (book.getName().equals(nameOfBook)){
                book.printInfo();
                return book;
            }
        }
        return null;
    }

    public Book[] getBooksWith(String requiredAuthor){
        ArrayList<Book> outAuthor= new ArrayList<>();
        for (Book book:books){
            if (book.getAuthor().equals(requiredAuthor)){
                outAuthor.add(book);
                book.printInfo();
            }
        }
        return outAuthor.toArray(new Book[0]);
    }

    public Book[] getBooksWith(int minimalRequiredPrice){
        ArrayList<Book> outPrice = new ArrayList<>();
        for (Book book:books){
            if (book.getPrice()>=minimalRequiredPrice){
                outPrice.add(book);
                book.printInfo();
            }
        }
        return outPrice.toArray(new Book[0]);
    }





}
