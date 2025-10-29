//// инкапсуляция
//class Account {
//    private double balance;
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance){
//        if (balance >= 0)
//            this.balance = balance;
//    }
//}
//
//public class ex1 {
//    public static void main(String[] args) {
//        Account acc = new Account();
//        acc.setBalance(1000);
//        System.out.println("balance" + acc.getBalance());
//        acc.setBalance(-500);
//    }
//
//}
//
//// наследование
//class Animal {
//    void eat() {
//        System.out.println("animal can eat");
//    }
//}
//class Dog extends Animal {
//    void bark() {
//        System.out.println("dog can bark");
//    }
//}
//
//public class ex1 {
//    public static void main(String[] args) {
//        Dog dog = new Dog;
//        dog.eat();
//        dog.bark();
//    }
//}
//
//
//
//// полиморфизм
//class Animal {
//    void sound() {
//        System.out.println("animals make sound");
//    }
//}
//class Dog extends Animal {
//    @Override
//    void sound() {
//        System.out.println("dog is bark");
//    }
//}
//
//class Cat extends Animal {
//    @Override
//    void sound() {
//        System.out.println("cat make meow");
//    }
//}
//
//public class ex1 {
//    public static void main(String[] args) {
//        Animal a1 = new Cat();
//        Animal a2 = new Dog();
//        a1.sound();
//        a2.sound();
//    }
//
//}
//
//
//
//// абстракция
//abstract class Shape{
//    abstract void draw();
//}
//class Circle extends Shape {
//    void draw(){
//        System.out.println("draw circle");
//    }
//}
//public class ex1 {
//    public static void main(String[] args) {
//        Shape shape = new Circle();
//        shape.draw();
//    }
//}
//
//// interface
//interface Flayble {
//    void fly();
//}
//class Bird implements  Flayble {
//    public void fly(){
//        System.out.println("bird can fly");
//    }
//}
//public class ex1 {
//    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.fly();
//    }
//}
//
//// getter and setter
//class Student{
//    private String name;
//    public void setName(String name){
//        this.name = name;
//    }
//    public String getName() {
//        return name;
//    }
//}
//public class ex1 {
//    public static void main(String[] args) {
//        Student s = new Student();
//        s.setName("Job");
//        System.out.println("name Student" + s.getName());
//    }
//}
//
//// @Override and overload
//class Math{
//    int add(int a, int b){
//        return a + b;
//    }
//    double add(double a, double b){
//        return a + b;
//    }
//}
//class Dog{
//    @Override
//    public String toString(){
//        return "It's dog";
//    }
//}
//public class ex1 {
//    public static void main(String[] args) {
//        Math math = new Math();
//        System.out.println(math.add(3,5));
//        System.out.println(math.add(1.2, 2.3));
//
//        Dog dog = new Dog();
//        System.out.println(dog.toString());
//    }
//}
//
//// фибоначчи
//public class ex1 {
//    static int fib(int n) {
//        if (n == 0) return 0;
//        if (n == 1) return 1;
//        return fib(n - 1) + fib(n - 2);
//    }
//    public static void main(String[] args) {
//        int n = 12;
//        System.out.println("fib" + n + ":");
//        for (int i = 0; i <= n; i ++) {
//            System.out.println(fib(i) + "");
//        }
//    }
//}
//
//// factorial
//import java.util.Scanner;
//public class ex1 {
//
//    static int factorial(int n) {
//    if (n == 0 || n == 1) return 1;
//    return n * factorial(n -1);
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("enter number");
//        int num = input.nextInt();
//        System.out.println("factorial" + num + "=" + factorial(num));
//    }
//}
//
//
//// factorial rec
//public class ex1 {
//    static int factorial(int n) {
//        if (n == 0 || n == 1) return 1;
//        return n * factorial(n - 1);
//    }
//
//    public static void main(String[] args) {
//        int n = 5;
//        System.out.println("factorial" + n + "=" + factorial(n));
//    }
//}
//
//// constructor
//class person {
//    String name;
//    int age;
//
//    person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//    void info() {
//        System.out.println("name" + name + " age" + age);
//    }
//}
//
//public class ex1 {
//    public static void main(String[] args) {
//        person p1 = new person("Alex", 19);
//        p1.info();
//
//    }
//}
//
//
//public class ex1 {
//    public static void main(String[] args) {
//        byte b = 100;
//        short s = 20000;
//        int i = 300000;
//        long l = 1234567890l;
//        float f = 3.14f;
//        double d = 2.1213131331;
//        char c = 'A';
//        boolean bo = true;
//
//
//    }
//}

//public class ex1 {
//    public static void main(String[] args) {
//        String name = "Hello";
//        char firstletter = name.charAt(name.length() - 1);
//        System.out.println(firstletter);
//    }
//}