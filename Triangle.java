public class Triangle implements Shape {
    private double a, b, c;

    // Constructor
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Override getArea method using Heron's formula
    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Override getPerimeter method
    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    // Override printShapeType method
    @Override
    public void printShapeType() {
        System.out.println("Triangle");
    }
}
