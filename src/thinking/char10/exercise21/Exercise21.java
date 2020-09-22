package thinking.char10.exercise21;

/**
 * @author sgc
 * @create 2020/8/6
 */
public class Exercise21 implements MyInterface{

    @Override
    public void f() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        MyInterface impl = new Exercise21();
        new MyInterface.Inner().use(impl);
    }
}

interface MyInterface {
    //放置到接口中的类会默认成为public static类型
    void f();
    public static class Inner{
        static void use(MyInterface impl){
            impl.f();
        }
    }
}
