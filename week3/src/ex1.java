abstract class Animal {
    abstract void sound();
}

class Lion extends Animal {

    void sound() {
        System.out.println("Lion roars: Roooar!");
    }
}

class Tiger extends Animal {
    void sound() {
        System.out.println("Tiger growls: Grrrr!");
    }
}

public class ex1 {
    public static void main(String[] args) {

        Animal lion = new Lion();
        Animal tiger = new Tiger();

        lion.sound();
        tiger.sound();
    }
}
