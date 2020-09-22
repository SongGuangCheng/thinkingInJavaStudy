package thinking.char09.exercise9;

/**
 * @author sgc
 * @create 2020/8/3
 */
public class Exercise9 {
    static void tune(Instrument i) {
        i.adjust();
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
        for (Instrument instrument : e) {
            tune(instrument);
        }
    }
    public static void main(String[] args) {
        Instrument[] ins = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(ins);
    }
}

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

abstract class Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
    public abstract String toString();
}

class Wind extends Instrument {
    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument {
    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed extends Instrument {
    @Override
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    public String toString() {
        return "Woodwind";
    }
}

