package thinking.char09.exercise10;

/**
 * @author sgc
 * @create 2020/8/3
 */
public class Exercise10 {
    static void tune(PlayAble i) {
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(PlayAble[] e) {
        for (PlayAble playAble : e) {
            tune(playAble);
        }
    }
    public static void main(String[] args) {
        PlayAble[] ins = {
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

interface PlayAble{
    public void play(Note n);

}

interface Instrument {
    public void adjust();
    public abstract String toString();
}

class Wind implements Instrument,PlayAble {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion implements Instrument,PlayAble {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed implements Instrument,PlayAble {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
    @Override
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind implements PlayAble{
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind implements PlayAble{
    @Override
    public String toString() {
        return "Woodwind";
    }
}

