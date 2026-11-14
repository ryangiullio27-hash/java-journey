import java.util.ArrayList;

public class HumanResources {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void listEmployees() {
        for (Employee e : employees) {
            System.out.println("Name " + e.getName());
            System.out.println("Salary $" + e.calculateSalary());
        }
    }

    public Employee findByName(String name) {
        for (Employee e : employees) {
            if (e.getName().equals(name)) {
                return e;
            }
        }
        return null;
    }
}
