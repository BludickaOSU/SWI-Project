import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Library lb = new Library();
        lb.createNewBookInLibrary("12 Rules for Life","Jordan Peterson",20);
        lb.createNewBookInLibrary("12 more rules for life","Jordan Peterson",25);
        lb.createNewBookInLibrary("Between good and evil","Friedrich Nietze",15);
        lb.createNewBookInLibrary("neco","nekdo",30);
        lb.createNewBookInLibrary("neco2","nekdo",35);

        lb.printAllBooks();
        System.out.println(lb.getPriceOfAllBooks());
        System.out.println(lb.getBooksCount("nekdo"));
        System.out.println(lb.getBooksCount(25));
        System.out.println("*/**************************************************");
        lb.getBookIfExist("neco");
        System.out.println("***********************************");
        lb.getBooksWith("nekdo");
        System.out.println("****************************************");
        lb.getBooksWith(25);


    }

}