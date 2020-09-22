package thinking.char10.exercise18;

/**
 * @author sgc
 * @create 2020/8/6
 */
public class Exercise18 {
    public static void main(String[] args) {
        MyInterface i = Outer.get();
        i.f();
    }
}
interface MyInterface{
    void f();
}
class Outer{
    public static class InnerStatic implements MyInterface{
        String name = "static inner class";

        @Override
        public void f() {
            System.out.println(name);
        }
    }
    public static InnerStatic get(){
        return new InnerStatic();
    }

    public static void main(String[] args) {
        MyInterface m = get();
        m.f();
    }
}
