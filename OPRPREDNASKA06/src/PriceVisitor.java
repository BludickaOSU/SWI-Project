public class PriceVisitor implements InterfaceVisitor{
    @Override
    public String get(Book book) {
        return "Price: 15";
    }

    @Override
    public String get(CD cd) {
        return "Price: 240";
    }

    @Override
    public String get(Magazine magazine) {
        return "Price: 47";
    }
}
