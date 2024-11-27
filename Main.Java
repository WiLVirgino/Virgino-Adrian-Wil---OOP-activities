public class Main {
    public static void main(String[] args) {
        // Create instances of shapes
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(8, 12);
        Triangle triangle = new Triangle(10, 12, 15);

        // Collection of shapes
        Shape[] shapes = { square, rectangle, triangle };

        // Create ShapeCollection and call the method to print properties
        ShapeCollection shapeCollection = new ShapeCollection(shapes);
        shapeCollection.getPropertyValues();
    }
}
