public class Employee {

    private int id;
    private String name;
    private double basic_salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.basic_salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return basic_salary;
    }

    public void setSalary(double salary) {
        this.basic_salary = salary;
    }
    @Override
    public String toString() {
        return  "Id=" + id +
                ", Name=" + name +
                ", Basic salary=" + basic_salary;
    }

    public double calculateSalary(){
        return this.basic_salary;
    }
}
