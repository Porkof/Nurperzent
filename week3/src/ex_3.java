public class ex_3 {
    private float length;
    private float width;

    public ex_3() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    public ex_3(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "ex_3[length=" + length + ",width=" + width + "]";
    }

    public static void main(String[] args) {
        ex_3 r1 = new ex_3();
        System.out.println("r1: " + r1);
        System.out.println("Length: " + r1.getLength());
        System.out.println("Width: " + r1.getWidth());
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        ex_3 r2 = new ex_3(5.0f, 3.0f);
        System.out.println("\nr2: " + r2);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        r1.setLength(4.0f);
        r1.setWidth(2.0f);
        System.out.println("\nAfter modification:");
        System.out.println("r1 length: " + r1.getLength());
        System.out.println("r1 width: " + r1.getWidth());
        System.out.println("r1 area: " + r1.getArea());
        System.out.println("r1 perimeter: " + r1.getPerimeter());

        // Тестируем граничные значения
        ex_3 r3 = new ex_3(0.5f, 0.5f);
        System.out.println("\nr3 (small): " + r3);
        System.out.println("r3 area: " + r3.getArea());
    }
}