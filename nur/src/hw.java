import java.util.Arrays;
import java.util.List;

public class hw {
    public static void main(String[] args) {
        List<Footballer> footballers = Arrays.asList(
                new Footballer("Lionel Messi", "Forward", 37, 70.0),
                new Footballer("Cristiano Ronaldo", "Forward", 39, 83.0),
                new Footballer("Neymar Jr.", "Forward", 32, 68.0),
                new Footballer("Kylian Mbappé", "Forward", 25, 73.0),
                new Footballer("Kevin De Bruyne", "Midfielder", 33, 70.0),
                new Footballer("Robert Lewandowski", "Forward", 36, 79.0),
                new Footballer("Mohamed Salah", "Forward", 32, 72.0),
                new Footballer("Luka Modrić", "Midfielder", 38, 66.0),
                new Footballer("Harry Kane", "Forward", 30, 85.0),
                new Footballer("Sergio Ramos", "Defender", 37, 82.0)
        );


    }
}

class Footballer {
    private String name;
    private String position;
    private int age;
    private double weight;

    public Footballer(String name, String position, int age, double weight) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " (" + position + ")";
    }
}
