abstract class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    abstract void eat();
    abstract void exercise();
}

class Athlete extends Person {

    Athlete(String name) {
        super(name);
    }

    void eat() {
        System.out.println(name + " eats a balanced diet rich in proteins and vitamins.");
    }

    void exercise() {
        System.out.println(name + " trains every day with running, weightlifting, and cardio.");
    }
}

class LazyPerson extends Person {

    LazyPerson(String name) {
        super(name);
    }

    void eat() {
        System.out.println(name + " eats junk food while watching TV.");
    }

    void exercise() {
        System.out.println(name + " prefers to exercise only when going to the fridge.");
    }
}

public class ex8 {
    public static void main(String[] args) {

        Person athlete = new Athlete("John");
        Person lazy = new LazyPerson("Mike");

        athlete.eat();
        athlete.exercise();

        System.out.println("-----------------------");

        lazy.eat();
        lazy.exercise();
    }
}
