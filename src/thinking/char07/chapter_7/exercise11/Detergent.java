package thinking.char07.chapter_7.exercise11;

public class Detergent {
    private Cleanser cleanser = new Cleanser();
    public void scrub(){
        cleanser.append("Detergent.scrub()");
        cleanser.scrub();
    }
    public void dilute(){cleanser.append("dilute()");}
    public void apply(){cleanser.append("apply()");}
    public void foam(){cleanser.append("foam()");}

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.print("Testing base class:");
        Cleanser.main(args);

    }
}
