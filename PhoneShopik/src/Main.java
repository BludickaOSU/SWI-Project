import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MobileShop ms = new MobileShop();

        ms.createNewItemInShop(new Phone("Nokia", "black"), 200., "Finland");
        ms.createNewItemInShop(new Phone("Samsung", "black"), 400., "South Korea");
        ms.createNewItemInShop(new Phone("Sony", "red"), 600., "Japan");
        ms.createNewItemInShop(new Phone("Apple", "white"), 800., "United States");




        System.out.println(Arrays.toString(ms.getAvailableColors()));
        System.out.println(Arrays.toString(ms.getAvailableCountries()));
        System.out.println(Arrays.toString(ms.getItems(99999)));
        System.out.println(Arrays.toString(ms.getItems("Japan","red",600)));









    }
}