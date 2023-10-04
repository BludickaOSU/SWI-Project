import java.util.Arrays;

public class CarpetShop {
    public Carpet[] carpets;

    public void createNewCarpetInShop(Carpet carpet){
        for (int i = 0; i < carpets.length; i++) {
            carpets[i] = carpet;
        }
    }















    @Override
    public String toString() {
        return "CarpetShop{" +
                "carpets=" + Arrays.toString(carpets) +
                '}';
    }
}
