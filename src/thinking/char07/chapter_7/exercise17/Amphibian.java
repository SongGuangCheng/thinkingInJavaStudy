package thinking.char07.chapter_7.exercise17;

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
    public void read(){
        System.out.println("frog reading");
    }
    public void say(Amphibian amphibian){
        System.out.println("frog saying");
        amphibian.read();
    }
    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian amphibian = new Amphibian();
        amphibian.say(frog);
    }
}