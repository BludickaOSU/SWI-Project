import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CarpetShop cs = new CarpetShop();

        cs.createNewCarpetInShop("Red",60,40);
        cs.createNewCarpetInShop("Yellow",80,70);
        cs.createNewCarpetInShop("Blue",30,20);
        cs.createNewCarpetInShop("Black",40,40);
        cs.createNewCarpetInShop("Red",90,60);

        System.out.println(Arrays.toString(cs.carpets.toArray()));
        System.out.println(cs.getCarpetsCount("Red"));
        System.out.println(cs.getCarpetsCount(1800));

        System.out.println(Arrays.toString(cs.getCarpetsWith("Red")));



    }
}