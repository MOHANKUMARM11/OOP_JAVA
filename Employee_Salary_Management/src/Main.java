import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Designer(1,"Mohan",100000,"UI/UX",15000);
        Employee e2 = new Developer(2,"Pranesh",100000,"Frontend",16000);
        Employee e3 = new Manager(3,"Nandha",100000,"IT",20000);

        List<Employee> employees = new ArrayList<>();

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        for(Employee e : employees) {
            System.out.println(e);
            System.out.println(e.calculateSalary());
        }
    }
}
