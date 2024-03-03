package q1;
class Candy extends DessertItem {
    double price;
    double weight;

    Candy(String name, double price, double weight) {
        super(name);
        this.price = price;
        this.weight = weight;
    }

    double getCost() {
        double cost = price * weight;
        double x;
        if (super.getName().charAt(0)=='c' || super.getName().charAt(0)=='C'){
             x = Math.ceil(cost);
        } else x = Math.floor(cost);
        return (double)x;
    }

    @Override
    public String toString() {
        return getName() + " " + weight + " " + price;
    }
    
    
}