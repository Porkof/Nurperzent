abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion eats meat — it hunts other animals.");
    }

    void sleep() {
        System.out.println("Lion sleeps for about 20 hours a day in the shade.");
    }
}

class Tiger extends Animal {
    void eat() {
        System.out.println("Tiger eats fresh meat, usually hunting alone.");
    }

    void sleep() {
        System.out.println("Tiger sleeps around 16 hours a day, mostly after hunting.");
    }
}
class Deer extends Animal {
    void eat() {
        System.out.println("Deer eats grass, leaves, and plants.");
    }

    void sleep() {
        System.out.println("Deer sleeps lightly for short periods to stay alert.");
    }
}

public class ex4 {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal deer = new Deer();

        lion.eat();
        lion.sleep();

        System.out.println("-------------------");

        tiger.eat();
        tiger.sleep();

        System.out.println("-------------------");

        deer.eat();
        deer.sleep();
    }
}
