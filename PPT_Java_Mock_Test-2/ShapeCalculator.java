// Shape.java
// Base class Shape
abstract class Shape {
    public abstract double calculateArea();
}

// Circle.java
// Subclass Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Calculate area of circle
    }
}

// Rectangle.java
// Subclass Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height; // Calculate area of rectangle
    }
}

// Triangle.java
// Subclass Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height; // Calculate area of triangle
    }
}

public class ShapeCalculator {

    public void printArea(Shape shape) {
        System.out.println(shape.getClass().getName() + " " + shape.calculateArea());
    }

    public static void main(String[] args) {

        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(12, 34);
        Triangle triangle = new Triangle(5, 9);

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        shapeCalculator.printArea(circle);
        shapeCalculator.printArea(rectangle);
        shapeCalculator.printArea(triangle);

    }
}
