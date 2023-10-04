import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Consumption cons1 = new Consumption (20,10,15);
        Car c1 = new Car("Fabia","Škoda",25000,cons1,250000,Fuel.Hybrid);

        Consumption cons2 = new Consumption (35,80,26);
        Car c2 = new Car("Vrtaq","Škoda",75000,cons2,400000,Fuel.Diesel);

        Consumption cons3 = new Consumption (45,50,45);
        Car c3 = new Car("C4","Škoda",90000,cons3,650000,Fuel.Petrol);

        Consumption cons4 = new Consumption (10,20,30);
        Car c4 = new Car("C4","Citroen",3500000,cons4,673000,Fuel.Petrol);

        Car[] cars = new Car[10];
        CarDealer cd = new CarDealer(cars);

        cd.addCar(c1);
        cd.addCar(c2);
        cd.addCar(c3);
        cd.addCar(c4);

        System.out.println("Všechny auta");
        for (int i = 0;i<cars.length;i++){
            if (cars[i] != null)
            System.out.println(cars[i]);
        }
        System.out.println("---------------------");
        System.out.println("Počet položek v bazaru");
        System.out.println(cd.getCarCount());
        System.out.println("---------------------");

        System.out.println("Požadovany model");
        cd.getCarByModel("C4");
        System.out.println("---------------------");

        System.out.println("Auta podle vyrobce");
        System.out.println(Arrays.toString(cd.getCarByManufacturer("Škoda")));
        System.out.println("---------------------");

        System.out.println("Auta s penší spotřebou než je zadaná:");
        System.out.println(Arrays.toString(cd.getCarUnderAvarageConsumption(30)));
        System.out.println("---------------------");

        System.out.println("Auta podle paliva");
        System.out.println(Arrays.toString(cd.getCarsByFuel(Fuel.Petrol)));



        System.out.println();








    }



















}