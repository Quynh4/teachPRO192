
public class DuluxePizza extends Pizza{
    String addedTopping;

    public DuluxePizza() {
    }

    public DuluxePizza(String addedTopping, double pizza, int slice) {
        super(pizza, slice);
        this.addedTopping = addedTopping;
    }

    @Override
    public String toString() {
        return addedTopping + " " + getPizza() + "" + getSlice();
    }
     
    
}
