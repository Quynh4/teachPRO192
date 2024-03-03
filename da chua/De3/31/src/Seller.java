

public class Seller extends Employee {
    private double revenue;

    public Seller(String name, double basicSalary, double revenue) {
        super(name, basicSalary);
        this.revenue = revenue;
    }

    public double getSalary() {
        double bonus = revenue < 30000 ? revenue * 0.05 : revenue * 0.1;
        return revenue + bonus;
    }
}