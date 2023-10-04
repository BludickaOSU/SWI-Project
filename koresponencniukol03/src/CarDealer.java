import java.util.Arrays;

public class CarDealer {
    private Car[] cars;

    private int count;

    public int getCount() {
        return count;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public CarDealer(Car[] cars) {
        this.cars = cars;
    }

    public void addCar(Car car){
        for (int i =0;i<cars.length;i++){
            if (cars[i] == null){
            cars[i] = car;
            break;
            }

        }
    }
    public int getCarCount(){
        return cars.length;
    }

    public Car getCarByModel(String model){

        for (int i = 0;i<cars.length;i++){
            if (cars[i] != null && cars[i].getModel().equals(model)){
                System.out.println(cars[i]);
            }
        }
        return null;
    }

    public Car[] getCarByManufacturer(String manufacturer) {
        int fitToFilterSize = 0;
        for (Car car : cars) {
            if (car != null && car.getManufacturer().equals(manufacturer)) {
                fitToFilterSize++;
            }
        }
        Car[] filteredCars = new Car[fitToFilterSize];
        for (int i = 0, filteredCarIndex = 0; i < cars.length; i++) {
            if (cars[i] != null && cars[i].getManufacturer().equals(manufacturer)) {
                filteredCars[filteredCarIndex] = cars[i];
                filteredCarIndex++;
            }
        }
        return filteredCars;
    }

    public Car[] getCarUnderAvarageConsumption(double consumption) {
        int fitToFilter = 0;
        for (Car car : cars) {
            if (car != null && car.getConsumption().getAverage() < consumption) {
                fitToFilter++;
            }
        }
        Car[] filteredCars = new Car[fitToFilter];
        int filteredCarsIndex = 0;
        for (Car car : cars) {
            if (car != null && car.getConsumption().getAverage() < consumption) {
                filteredCars[filteredCarsIndex] = car;
                filteredCarsIndex++;
            }
        }
        return filteredCars;
    }

    public Car[] getCarsByFuel(Fuel fuel){
        int fitToFilter = 0;
        for (Car car : cars) {
            if (car != null && car.getFuel().equals(fuel) ) {
                fitToFilter++;
            }
        }
        Car[] filteredCars = new Car[fitToFilter];
        int filteredCarsIndex = 0;
        for (Car car : cars) {
            if (car != null && car.getFuel().equals(fuel)) {
                filteredCars[filteredCarsIndex] = car;
                filteredCarsIndex++;
            }
        }
        return filteredCars;

    }

    @Override
    public String toString() {
        String result = "";
        for (int i =0; i <count; i++){
            result += cars[i] + "\n";
        }
        return result;
    }
}
