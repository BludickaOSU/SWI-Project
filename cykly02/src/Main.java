import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //1,2,3,4
        //4,3,2,1
        //2,4
        //1,3


        for (int i =1;i<=4;){
            System.out.print(i++ +",");
        }
        System.out.println("-------");
        for (int i = 4;i>=1;){
            System.out.print(i-- + ",");
        }
        System.out.println("------");
        for (int i = 0;i<4;i+=2){

                System.out.print((i +2)+",");

        }

    }
}