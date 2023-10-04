package Books.src.cz.osu;

public class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void printInfo(){
        System.out.println("Jméno: " + name + ",Autor: " + author + ",Cena: " + price);
    }
}
