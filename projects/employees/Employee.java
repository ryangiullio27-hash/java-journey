public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary <= 0) throw new IllegalArgumentException("Salary must be greater than 0");
        this.baseSalary = baseSalary;
    }
}
