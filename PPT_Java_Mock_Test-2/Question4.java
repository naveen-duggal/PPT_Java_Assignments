interface Drawable {
    public void draw();
}

class Circle implements Drawable {

    @Override
    public void draw() {
        System.out.println("draw a circle");
    }

}

class Rectangle implements Drawable {

    @Override
    public void draw() {
        System.out.println("draw a rectangle");
    }

}

public class Question4 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}
