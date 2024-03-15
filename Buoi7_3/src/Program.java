public class Program {
    public static void main(String[] args) {
        Shape s = new Circle(5.0);  // Creating an instance of Circle
        System.out.println("Circle Circumference: " + s.circumference());
        System.out.println("Circle Area: " + s.area());

        s = new Rect(4.0, 3.0);  // Creating an instance of Rect
        System.out.println("Rectangle Circumference: " + s.circumference());
        System.out.println("Rectangle Area: " + s.area());
    }
}
