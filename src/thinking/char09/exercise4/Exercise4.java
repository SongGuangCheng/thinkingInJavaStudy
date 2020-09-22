package thinking.char09.exercise4;

/**
 * @author sgc
 * @create 2020/8/3
 * 如果基类中没有这个抽象方法 那么需要向下转型才可以调用子类的实现方法
 * 如果有则不需向下转型
 *
 */
public class Exercise4 {
    static void f1(Father father){
        Father father1 = father;
        //((Son)father1).f();
        father1.f();

    }

    public static void main(String[] args) {
        f1(new Son());
    }
}

abstract class Father{
    abstract  void f();
}

class Son extends Father{

    void f(){
        System.out.println("son.f()");
    }
}