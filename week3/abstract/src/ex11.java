abstract class Bird {
    public abstract void fly();
    public abstract void makeSound();
}

class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("The eagle soars high in the sky with powerful wings.");
    }

    @Override
    public void makeSound() {
        System.out.println("The eagle makes a sharp screeching sound!");
    }
}

class Hawk extends Bird {
    @Override
    public void fly() {
        System.out.println("The hawk glides gracefully and dives swiftly to catch prey.");
    }

    @Override
    public void makeSound() {
        System.out.println("The hawk emits a loud, piercing cry.");
    }
}

public class ex11 {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird hawk = new Hawk();

        System.out.println("Eagle:");
        eagle.fly();
        eagle.makeSound();

        System.out.println("\nHawk:");
        hawk.fly();
        hawk.makeSound();
    }
}
