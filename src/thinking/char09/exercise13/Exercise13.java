package thinking.char09.exercise13;

/**
 * @author sgc
 * @create 2020/8/4
 * 创建一个接口，并从该接口继承两个接口，然后从后面两个接口
 * 多重继承第三个接口。
 */
public class Exercise13{
    public static void main(String[] args) {
        new Impl().f();
    }

}

interface BaseInterface{
    void f();
}

interface MyInterface1 extends BaseInterface{
    void f();
}

interface MyInterface2 extends BaseInterface{
    void f();
}

interface MyInterface3 extends MyInterface1,MyInterface2{
    void f();
}

class Impl implements MyInterface3{
    @Override
    public void f() {
        System.out.println("impl.f()");
    }
}

