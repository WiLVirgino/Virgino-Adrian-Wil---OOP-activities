public class Square implements Shape {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Override getArea method
    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    // Override getPerimeter method
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    // Override printShapeType method
    @Override
    public void printShapeType() {
        System.out.println("Square");
    }
}
