abstract class Instrument {
    String name;


    Instrument(String name) {
        this.name = name;
    }

    abstract void play();
    abstract void tune();
}

class Glockenspiel extends Instrument {

    Glockenspiel(String name) {
        super(name);
    }

    void play() {
        System.out.println(name + " plays a bright, metallic melody with mallets.");
    }

    void tune() {
        System.out.println(name + " is tuned by adjusting the metal bars for perfect pitch.");
    }
}

class Violin extends Instrument {

    Violin(String name) {
        super(name);
    }

    void play() {
        System.out.println(name + " plays a soft, emotional tune using a bow.");
    }

    void tune() {
        System.out.println(name + " is tuned by tightening or loosening the strings.");
    }
}


public class ex9 {
    public static void main(String[] args) {

        Instrument glockenspiel = new Glockenspiel("Glockenspiel");
        Instrument violin = new Violin("Violin");

        glockenspiel.tune();
        glockenspiel.play();

        System.out.println("-----------------------");

        violin.tune();
        violin.play();
    }
}
