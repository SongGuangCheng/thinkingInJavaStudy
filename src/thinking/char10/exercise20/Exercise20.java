package thinking.char10.exercise20;

/**
 * @author sgc
 * @create 2020/8/6
 */
public class Exercise20 {
    public static void main(String[] args) {
        MyInterface m = new MyInterface.Inner();
        m.f();
    }
}

interface MyInterface{
    void f();
    public static class Inner implements MyInterface{
        @Override
        public void f() {
            System.out.println("接口中的嵌套类");
        }
    }
}