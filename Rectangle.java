public class Rectangle implements Shape {
    private double length, width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override getArea method
    @Override
    public double getArea() {
        return length * width;
    }

    // Override getPerimeter method
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Override printShapeType method
    @Override
    public void printShapeType() {
        System.out.println("Rectangle");
    }
}
