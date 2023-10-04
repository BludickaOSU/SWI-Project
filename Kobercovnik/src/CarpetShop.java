import java.util.ArrayList;
import java.util.Arrays;

public class CarpetShop {
    ArrayList<Carpet> carpets = new ArrayList<>();

    public void createNewCarpetInShop(String color,int sizeWidth,int sizeHeight){
        carpets.add(new Carpet(color,sizeWidth,sizeHeight));
    }
    public int getCarpetsCount(String requiredColor){
        int counter = 0;
        for (Carpet i:carpets){
            if (i.getColor().equals(requiredColor)){
                counter++;
            }
        }
        return counter;
    }
    public int getCarpetsCount(int minimalRequiredArea){
        int counter =0;
        for (Carpet i:carpets){
            if (i.getArea()>=minimalRequiredArea){
                counter++;
            }
        }
        return counter;
    }

    public Carpet[] getCarpetsWith(String requiredColor){
        ArrayList<Carpet> outColor = new ArrayList<>();
        for (Carpet i:carpets){
            if (i.getColor().equals(requiredColor)){}
            outColor.add(i);
        }
        return outColor.toArray(new Carpet[0]);
    }
    public Carpet[] getCarpetsWith(int minimalRequiredArea){
        ArrayList<Carpet> outArea = new ArrayList<>();
        for (Carpet i:carpets){
            if (i.getArea()>=minimalRequiredArea){
                outArea.add(i);
            }
        }
        return outArea.toArray(new Carpet[0]);
    }



}
