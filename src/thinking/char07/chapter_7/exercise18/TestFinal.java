package thinking.char07.chapter_7.exercise18;

import java.util.Random;

public class TestFinal {
    static Random rand = new Random();
    final int i = rand.nextInt(10);
    static final int i1 = rand.nextInt(10);

    public static void main(String[] args) {
        TestFinal t = new TestFinal();
        System.out.println(t.i);
        TestFinal t1 = new TestFinal();
        System.out.println(t1.i);
        System.out.println("static类型---------------");
        System.out.println(t.i1);
        TestFinal t2 = new TestFinal();
        System.out.println(t2.i1);
    }
}

class Value {
    int i;
    Value(int i){this.i = i;}

    @Override
    public String toString() {
        return "Value{" +
                "i=" + i +
                '}';
    }
}
