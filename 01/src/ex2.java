class Animal {
    void eat() {
        System.out.println("animal can eat");
    }

}
class Dog extends Animal {
    void bark() {
        System.out.println("dog can bark");
    }
}

public class ex2 {
    public static void main(String[] args) {
       Dog dog = new Dog();
       dog.bark();
       dog.eat();
    }
}
