import java.util.Arrays;

public class CarpetShop {
    public Carpet[] carpets = new Carpet[10];
    public int count =0;
    void createNewCarpetInShop(String color,int width, int height){
    for (int i = 0;i<carpets.length;i++){
        if (carpets[i]==null){
            count++;
            carpets[i] = new Carpet(color,width,height);
            break;
        }
    }
    }
    public void printAllCarpets(){
        for (int i = 0; i < count; i++) {
            if (carpets[i] != null){
                carpets[i].printInfo();
            }
        }
    }
    public int getCarpetsCount(String requiredColor){
        int sum = 0;
        for (int i = 0;i<count;i++){
            if (carpets[i].getColor().equals(requiredColor)){
                sum++;
            }
        }return sum;

    }
    public int getCarpetsCount(int minimalRequiredArea){
        int sum = 0;
        for (int i = 0; i < count; i++) {
            if (carpets[i].getArea()>=minimalRequiredArea){
                sum++;
            }
        }return sum;
    }

    Carpet[]getCarpetsWith(String requiredColor){
        int capacity =0;
        for (int i = 0; i < count; i++) {
            if (carpets[i].getColor().equals(requiredColor)){
                capacity++;
            }
        }
        Carpet[] carpetswithColorArray = new Carpet[capacity];
        for (int i = 0; i <= capacity; i++) {
            if (carpets[i].getColor().equals(requiredColor)){
            carpetswithColorArray[i-1] = carpets[i];
            }
        }
    return carpetswithColorArray;
    }
    Carpet[]getCarpetsWith(int minimalRequiredArea){
        int capacity = 0;
        for (int i = 0; i < count; i++) {
            if (carpets[i].getArea()>=minimalRequiredArea){
                capacity++;
            }
        }
        Carpet[] carpetswithAreaArray = new Carpet[capacity];
        for (int i = 0; i < capacity; i++) {
            if (carpets[i].getArea()>=minimalRequiredArea){
                carpetswithAreaArray[i] = carpets[i];
            }
        }
        return carpetswithAreaArray;
    }


    @Override
    public String toString() {
        return "CarpetShop{" +
                "carpets=" + Arrays.toString(carpets) +
                '}';
    }
}
