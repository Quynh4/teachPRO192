public class Teacher {
    private String name;
    private double salary;

    public Teacher() {
        // Default constructor
    }

    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return name + " " + salary;
    }
}