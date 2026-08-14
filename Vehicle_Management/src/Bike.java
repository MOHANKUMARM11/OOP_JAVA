public class Bike extends Vehicle{

    private String brand;
    private String fuelType;
    private int speed;
    private boolean hasGear;

    public Bike(String brand, String fuelType, int speed,boolean hasGear){
        super(brand, fuelType, speed);
        this.hasGear = hasGear;
    }
    @Override
    public String toString() {
        return "Bike\n[\n" +
                super.toString() +
                "\nhasGear     : " + hasGear +
                "\n]";
    }
}
