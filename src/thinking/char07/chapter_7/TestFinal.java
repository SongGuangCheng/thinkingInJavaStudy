package thinking.char07.chapter_7;

import java.util.Random;

public class TestFinal {
    Random rand = new Random();
    final int i = rand.nextInt(10);
    final  Value value = new Value(66);


    public static void main(String[] args) {
        TestFinal t = new TestFinal();
        System.out.println(t.i);
        TestFinal t1 = new TestFinal();
        System.out.println(t1.i);

        Value value1 = t.value;
        value1 = new Value(111);
        System.out.println(value1);
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

