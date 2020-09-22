package thinking.char07.chapter_7.exercise16;

public class Amphibian {
    public void read(){
        System.out.println("reading");
    }
    public void say(Amphibian amphibian){
        System.out.println("saying");
        amphibian.read();
    }
}

class Frog extends Amphibian {
    public static void main(String[] args) {
        Frog frog = new Frog();
        new Amphibian().say(frog);
    }
}
