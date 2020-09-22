package thinking.char12.exercise25;

/**
 * @author sgc
 * @create 2020/8/11
 */
public class Exercise25 {
    public static void main(String[] args) {
        A a = new C();
        try {
            a.f1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class E1 extends Exception{}
class E2 extends E1{}
class E3 extends E2{}

class A{
    public void f1() throws E1{
        throw new E1();
    }
}

class B extends A{
    public void f1() throws E2{
        throw new E2();
    }
}

class C extends B{
    public void f1() throws E3{
        throw new E3();
    }
}