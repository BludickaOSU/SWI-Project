public class WeekendPriceVisitor implements InterfaceVisitor{
    @Override
    public String get(Book book) {
        return "Price: 10";
    }

    @Override
    public String get(CD cd) {
        return "Price: 200";
    }

    @Override
    public String get(Magazine magazine) {
        return "Price: 40";
    }
}
