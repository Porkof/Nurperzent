abstract class Shape3D {

    abstract double calculateVolume();
    abstract double calculateSurfaceArea();
}
class Sphere extends Shape3D {
    double radius;


    Sphere(double radius) {
        this.radius = radius;
    }

    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
class Cube extends Shape3D {
    double side;

    Cube(double side) {
        this.side = side;
    }

    double calculateVolume() {
        return Math.pow(side, 3);
    }

    double calculateSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }
}

public class ex6 {
    public static void main(String[] args) {
        Shape3D sphere = new Sphere(5.0);
        Shape3D cube = new Cube(4.0);

        System.out.println("Sphere:");
        System.out.println("Volume: " + sphere.calculateVolume());
        System.out.println("Surface Area: " + sphere.calculateSurfaceArea());

        System.out.println("------------------------");

        System.out.println("Cube:");
        System.out.println("Volume: " + cube.calculateVolume());
        System.out.println("Surface Area: " + cube.calculateSurfaceArea());
    }
}
