package thinking.char07.chapter_7.exercise19;

public class TestBlackFinal {
    private final int i;
    private final A a;
    TestBlackFinal(){
        i = 1;
        a = new A();
    }

    public static void main(String[] args) {
        TestBlackFinal t = new TestBlackFinal();
        System.out.println(t.i);
        //t.i = 2;
    }
}

class A{
    A(){
        System.out.println("AAA");
    }
}
