public class Car extends Vehicle{

    private String brand;
    private String fuelType;
    private int speed;
    private int numberOfDoors;

    public Car(String brand, String fuelType, int speed, int numberOfDoors) {
        super(brand, fuelType, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car\n[\n" +
                super.toString() +
                "\nnumberOfDoors: " + numberOfDoors +
                "\n]";
    }
}
