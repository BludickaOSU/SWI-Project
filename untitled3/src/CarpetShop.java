import java.util.ArrayList;
import java.util.Arrays;

public class CarpetShop {
    public ArrayList<Carpet> carpets;

public void createNewCarpetInShop(String carpetColor, int carpetWidth, int carpetHeight){
        Carpet carpet = new Carpet(carpetColor,carpetWidth,carpetHeight);
        this.carpets.add(carpet);
}

    public void printAllCarpets(){
        for(Carpet carpet: carpets){
               carpet.printInfo();
        }
    }
    public int getCarpetsCount(String requiredColor){
    int numberOfCarpetsWithColor = 0;
    for (Carpet carpet: carpets) {
        if (carpet.getColor().equals(requiredColor)){
            numberOfCarpetsWithColor++;
        }
        }
    return numberOfCarpetsWithColor;
    }
    public int getCarpetsCount(int minimalRequiredArea){
        int numberOfCarpetsWithArea = 0;
        for (Carpet carpet: carpets) {
            if (carpet.getArea()>=minimalRequiredArea){
                numberOfCarpetsWithArea++;
            }
        }
        return numberOfCarpetsWithArea;
    }
    public Carpet[] getCarpetsWith(String requiredColor){
    ArrayList<Carpet> listOfCarpets = new ArrayList<Carpet>();
    for (Carpet carpet:carpets){
        if (carpet.getColor().equals(requiredColor)){
            listOfCarpets.add(carpet);
        }
    }
    return listOfCarpets.toArray(new Carpet[listOfCarpets.size()]);
    }
    public Carpet[] getCarpetsWith(int minimalRequiredArea){
    Carpet[] listOfCarpets = new Carpet[10];
    for (Carpet carpet:carpets){
        if (carpet.getArea()>=minimalRequiredArea){
            listOfCarpets.add(carpet);
        }
    }
    return listOfCarpets;
    }




}

