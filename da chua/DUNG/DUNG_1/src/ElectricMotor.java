
public class ElectricMotor {
    private String name;
    private int voltage;
    private int current;

    public ElectricMotor() {
    }

    public ElectricMotor(String name, int voltage, int current) {
        this.name = name;
        this.voltage = voltage;
        this.current = current;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        if(voltage>=110 && voltage<= 220)
        this.voltage = voltage;
        else System.out.println("Invalid value");
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if(current>0)
        this.current = current;
        else System.out.println("Invalid value");
    }
    
    public int getPower(){
        return voltage*current;
    }
}
