
class Circle extends Shape{
    double r;

    public Circle(double rr) {
        r = rr;
    }

    public double circumference() {
        return 2 * Math.PI * r;
    }

    public double area() {
        return Math.PI * r * r;
    }
}