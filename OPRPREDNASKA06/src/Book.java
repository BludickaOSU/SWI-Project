public class Book implements Items, InterfaceVisited {
    private String title ;




    public Book(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return "Book: "+ title;
    }

    @Override
    public String accept(InterfaceVisitor visitor) {
        return visitor.get(this);
    }
}
