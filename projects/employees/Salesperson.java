public class Salesperson extends Employee {
    private int salesCount;
    private double commission;

    public Salesperson(String name, int salesCount, double baseSalary, double commission) {
        super(name, baseSalary);
        this.salesCount = salesCount;
        this.commission = commission;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + salesCount * commission;
    }
}
