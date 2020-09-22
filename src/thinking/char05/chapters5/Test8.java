package thinking.char05.chapters5;

public class Test8 {
    public void say(){
        System.out.println("i am saying");
        write();
        this.write();
    }

    public void write(){
        System.out.println("i am writing");
    }

    public static void main(String[] args) {
        new Test8().say();
    }
}
