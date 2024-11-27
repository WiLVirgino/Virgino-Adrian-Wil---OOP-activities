public class ShapeCollection {
    private Shape[] shapes;

    // Constructor
    public ShapeCollection(Shape[] shapes) {
        this.shapes = shapes;
    }

    // Method to calculate and print the area and perimeter of each shape
    public void getPropertyValues() {
        for (Shape shape : shapes) {
            shape.printShapeType();
            System.out.printf("Area: %.2f\n", shape.getArea());
            System.out.printf("Perimeter: %.2f\n\n", shape.getPerimeter());
        }
    }
}
