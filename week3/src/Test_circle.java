public class Test_circle {
    static class Circle {
        private double radius;
        private String color;

        public Circle() {
            this.radius = 3.0;
            this.color = "red";
        }

        public Circle(double radius) {
            this.radius = radius;
            this.color = "blue";
        }

        public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }

        public double getRadius() { return radius; }
        public void setRadius(double radius) { this.radius = radius; }
        public String getColor() { return color; }
        public void setColor(String color) { this.color = color; }


        public String toString() {
            return "Circle[radius=" + radius + ",color=" + color + "]";
        }
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(2.0);
        System.out.println(c2);

        Circle c3 = new Circle(3.0, "blue");
        System.out.println(c3);

        Circle c4 = new Circle();
        c4.setRadius(5.5);
        c4.setColor("green");
        System.out.println("c4 radius: " + c4.getRadius());
        System.out.println("c4 color: " + c4.getColor());

        Circle c5 = new Circle(6.6, "yellow");
        System.out.println(c5.toString());
        System.out.println(c5);
        System.out.println("Circle details: " + c5);
    }
}


