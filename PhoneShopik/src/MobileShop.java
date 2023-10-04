import java.util.ArrayList;
import java.util.Arrays;

public class MobileShop {

    ArrayList<Item> items = new ArrayList<>(); // podle toho co se bude s daty dělat je lepší jít přes arraylist

    public void createNewItemInShop(Phone phone, Double price, String country) {
        items.add(new Item(phone, price, country)); // vytvoř item a přidej ho do listu
    }

    public String[] getAvailableCountries() {
        ArrayList<String> outCountries = new ArrayList<>(); // nový list kde se bude sbírat data ke vrácení

        for(Item i : items) { // projed všechny itemy
            String c = i.getCountry(); // vem z itemu country
            if(!outCountries.contains(c)) { // arraylist má metodu "contains" která zjistí jestli list hodnotu obsahuje nebo ne
                outCountries.add(c); // pokud country v listu ještě není, přidej ji
            }
        }
        return outCountries.toArray(new String[0]); // převed arraylist na array typu String a vrat ho
    }

    public String[] getAvailableColors() { // to samé co předtím jenom s barvou
        ArrayList<String> outColors = new ArrayList<>();

        for(Item i : items) {
            String c = i.getPhoneColor();
            if(!outColors.contains(c)) {
                outColors.add(c);
            }
        }
        return outColors.toArray(new String[0]);
    }

    public Item[] getItems(double maxPrice) {
        ArrayList<Item> outItems = new ArrayList<>(); // nový

        for(Item i : items) {
            if(i.getPrice() <= maxPrice) { // pokud sedí cena
                outItems.add(i);
            }
        }
        return outItems.toArray(new Item[0]); // převed arraylist na array typu Item a vrat ho
    }

    public Item[] getItems(String country, String phoneColor, double maxPrice) {
        ArrayList<Item> outItems = new ArrayList<>();

        for(Item i : items) {
            if(i.getCountry().equals(country) // pokud sedí country
                    && i.getPhoneColor().equals(phoneColor) // a zároven pokud sedí color
                    && i.getPrice() <= maxPrice) { // a zároven pokud sedí cena
                outItems.add(i);
            }
        }
        return outItems.toArray(new Item[0]); // převed arraylist na array typu Item a vrat ho
    }

    public void printArray(Item[] items) {
        System.out.println(Arrays.toString(items));
    }

    @Override
    public String toString() {
        return "MobileShop{" +
                "items=" + items +
                '}';
    }
}
