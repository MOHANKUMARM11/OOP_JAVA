public class Manager extends Employee {

    private String department;
    private double managementbonus;

    public Manager(int id, String name, double salary, String department, double managementbonus) {
        super(id, name, salary);
        this.department = department;
        this.managementbonus = managementbonus;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getManagementbonus() {
        return managementbonus;
    }

    public void setManagementbonus(double managementbonus) {
        this.managementbonus = managementbonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary()+getManagementbonus();
    }

    @Override
    public String toString() {
        return "Manager{"+ super.toString() + "Department=" + this.department + "Managementbonus=" + this.managementbonus + "}";
    }
}
