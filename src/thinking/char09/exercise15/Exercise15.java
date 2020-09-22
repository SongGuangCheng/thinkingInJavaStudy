package thinking.char09.exercise15;

/**
 * @author sgc
 * @create 2020/8/4
 */
public class Exercise15 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.f();
        myClass.f1();

    }
}

abstract class AbstractClass{
    int i = 1;
    abstract void f();
    void f1(){
        System.out.println("抽象类中可以含有非抽象方法");
    }
}

class MyClass extends AbstractClass{

    @Override
    void f() {
        System.out.println("实现抽象方法");
    }
}