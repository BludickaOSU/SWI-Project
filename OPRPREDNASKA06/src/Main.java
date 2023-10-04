import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Items> items = new ArrayList<>();
        items.add(new Book("Babička"));
        items.add(new CD("Mozart"));
        items.add(new Magazine("Blesk"));

        PriceVisitor priceVisitor = new PriceVisitor();
        WeekendPriceVisitor weekendPriceVisitor = new WeekendPriceVisitor();
        System.out.println("Ceny přes týden");
        for (InterfaceVisited temp: items) {
            System.out.println(temp.accept(priceVisitor));
        }
        System.out.println("Ceny přes víkend");
        for (InterfaceVisited temp: items) {
            System.out.println(temp.accept(weekendPriceVisitor));
        }














    }

}