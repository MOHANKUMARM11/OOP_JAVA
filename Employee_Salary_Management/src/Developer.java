public class Developer extends Employee {

    private String roll;
    private double codingbonus;

    public Developer(int id, String name, double salary, String roll,double codingbonus) {
        super(id, name, salary);
        this.roll = roll;
        this.codingbonus = codingbonus;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public double getCodingbonus() {
        return codingbonus;
    }

    public void setCodingbonus(double codingbonus) {
        this.codingbonus = codingbonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary()+getCodingbonus();
    }

    @Override
    public String toString() {
        return "Developer{" + super.toString() + "Roll=" + this.roll + "Codingbonus=" + this.codingbonus + "}";
    }
}
