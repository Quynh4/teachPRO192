
public class Pizza {
    private double pizza;
    private int slice;

    public Pizza() {
    }

    public Pizza(double pizza, int slice) {
        this.pizza = pizza;
        this.slice = slice;
    }

    public double getPizza() {
        return pizza;
    }

    public void setPizza(double pizza) {
        this.pizza = pizza;
    }

    public int getSlice() {
        return slice;
    }

    public void setSlice(int slice) {
        this.slice = slice;
    }

    @Override
    public String toString() {
        return pizza + " " + slice;
    }
}
