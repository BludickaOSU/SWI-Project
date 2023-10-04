package Books.src.cz.osu;

public class Main {
    public static void main(String[] args) {
        Library lb = new Library();
        lb.createNewBookInLibrary("Romeo A Julie","William Shakespeare",159);
        lb.createNewBookInLibrary("Kopačku a Solar","Taško",200);
        lb.createNewBookInLibrary("Ew Žávera","Stenky",150);
        lb.createNewBookInLibrary("Kybl poradnu","Tomáš Machát",320);
        lb.createNewBookInLibrary("Jak vyměnit kamarády za šukaní","Tomáš Machát",500);

        lb.printAllBooks();
        System.out.println("Cena všech knih: " + lb.getPriceOfAllBooks());
        System.out.println("Počet knih s autorem: " + lb.getBooksCount("Tomáš Machát"));
        System.out.println("Počet knih s minimální cenou: " + lb.getBooksCount(320));

        Book book = lb.getBookIfExist("Jak vyměnit kamarády za šukaní");
        if (book != null){
            book.printInfo();
        }

        Book [] booksWithAuthor = lb.getBooksWith("Taško");
        Book [] booksWithMinReqPrice = lb.getBooksWith(320);

        System.out.println("Knihy s autorem Taško: ");
        for(Book book2 :  booksWithAuthor){
            book2.printInfo();
        }

        System.out.println("Knihy s minimální cenou 320: ");
        for(Book book2 :  booksWithMinReqPrice){
            book2.printInfo();
        }

    }
}