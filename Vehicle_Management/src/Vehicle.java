public class Vehicle {

    private String brand;
    private String fuelType;
    private int speed;

    public Vehicle(String brand, String fuelType, int speed) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.speed = speed;
    }
    @Override
    public String toString() {
        return "Brand        : " + brand +
                "\nFuelType     : " + fuelType +
                "\nSpeed        : " + speed;
    }
}
