
public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }
    
    public String getName() {
        return lastname + " " + firstname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    
    private int x=100;
    public int raiseSalary(int percent){
        x = 100+percent;
        return percent;
    }

 
    @Override
    public String toString() {
    
    return "Employee[id="+ id
            +",name="+lastname+" "+firstname
            +",salary="+(salary*x)/100+"]";
    }
    
}
