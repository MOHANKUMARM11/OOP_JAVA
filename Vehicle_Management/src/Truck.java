public class Truck extends Vehicle{

    private String brand;
    private String fuelType;
    private int speed;
    private double loadCapacity;

    public Truck(String brand, String fuelType, int speed, double loadCapacity) {
        super(brand, fuelType, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck\n[\n" +
                super.toString() +
                "\nloadCapacity : " + loadCapacity +
                "\n]";
    }

}
