class Rect extends Shape {
    double l, w;

    public Rect(double length, double width) {
        l = length;
        w = width;
    }

    public double circumference() {
        return 2 * (l + w);
    }

    public double area() {
        return l * w;
    }
}
