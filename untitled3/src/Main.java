public class Main {
    public static void main(String[] args) {

    CarpetShop cs = new CarpetShop();
    cs.createNewCarpetInShop("Blue",80,40);
    cs.createNewCarpetInShop("Red",60,90);
    cs.createNewCarpetInShop("Yellow",50,40);
    cs.createNewCarpetInShop("Green",20,30);
    cs.createNewCarpetInShop("Pink",18,48);

    cs.printAllCarpets();


    }
}