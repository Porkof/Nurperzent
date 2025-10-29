abstract class Shape2D {
    String name;

    Shape2D(String name) {
        this.name = name;
    }

    abstract void draw();
    abstract void resize(double factor);
}

class Rectangle extends Shape2D {
    double width, height;

    Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    void draw() {
        System.out.println(name + " is drawn with width " + width + " and height " + height + ".");
    }

    void resize(double factor) {
        width *= factor;
        height *= factor;
        System.out.println(name + " has been resized. New width: " + width + ", new height: " + height + ".");
    }
}

class Circlee extends Shape2D {
    double radius;

    Circlee(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    void draw() {
        System.out.println(name + " is drawn with radius " + radius + ".");
    }

    void resize(double factor) {
        radius *= factor;
        System.out.println(name + " has been resized. New radius: " + radius + ".");
    }
}

public class ex10 {
    public static void main(String[] args) {

        Shape2D rectangle = new Rectangle("Rectangle", 8, 4);
        Shape2D circle = new Circlee("Circle", 5);

        rectangle.draw();
        rectangle.resize(1.5);

        System.out.println("-----------------------");

        circle.draw();
        circle.resize(2.0);
    }
}
