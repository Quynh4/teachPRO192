
public class Seller extends Employee{
    private double revenue;

    public Seller() {
    }
    
    public Seller(double revenue) {
        this.revenue = revenue;
    }

    public Seller(String name,double revenue, double salary) {
        super(name, salary);
        this.revenue = revenue;
    }
    
    @Override
    public double getSalary(){
        if(revenue<30000)  super.setSalary(super.getSalary()*1.000005);
        else super.setSalary(super.getSalary()*1.0000001);
        //làm tròn
        double roundedSalary;
        if (super.getName().toLowerCase().startsWith("c")) {
            roundedSalary = Math.ceil(super.getSalary());
        } else {
            roundedSalary = Math.floor(super.getSalary());
        }
        return (double) roundedSalary;    
    }
}
