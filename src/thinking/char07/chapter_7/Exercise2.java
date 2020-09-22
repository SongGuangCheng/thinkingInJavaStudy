package thinking.char07.chapter_7;

import thinking.char07.p127.Son;

public class Exercise2 extends Son {
    public void f1(){
        System.out.println("覆盖原有son类的f1（）方法");
    }

    public void newF(){
        System.out.println("添加一个新方法");
    }
}
