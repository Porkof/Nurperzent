public class ex_2 {
    private double radius;
    private String color;

    public ex_2() {
        this.radius = 1.0;
        this.color = "red";
    }

    public ex_2(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public ex_2(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "ex_2[radius=" + radius + ",color=" + color + "]";
    }


    public static void main(String[] args) {
        ex_2 c1 = new ex_2();
        System.out.println("c1: " + c1);
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Color: " + c1.getColor());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Circumference: " + c1.getCircumference());

        ex_2 c2 = new ex_2(2.0);
        System.out.println("\nc2: " + c2);

        ex_2 c3 = new ex_2(3.0, "blue");
        System.out.println("\nc3: " + c3);

        c1.setRadius(4.0);
        c1.setColor("green");
        System.out.println("\nAfter modification:");
        System.out.println("c1: " + c1);
    }
}