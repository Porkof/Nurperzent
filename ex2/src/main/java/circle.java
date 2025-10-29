public class circle {
    // 1. Приватное поле
    private double radius;

    // 2. Конструкторы
    // Конструктор по умолчанию
    public circle() {
        this.radius = 1.0;
    }

    // Конструктор с параметром
    public circle(double radius) {
        this.radius = radius;
    }

    // 3. Геттеры и сеттеры
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // 4. Метод для вычисления площади
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // 5. Метод для вычисления длины окружности
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // 6. Метод toString() для строкового представления
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}