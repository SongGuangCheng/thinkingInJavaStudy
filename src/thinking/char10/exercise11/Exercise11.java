package thinking.char10.exercise11;

/**
 * @author sgc
 * @create 2020/8/5
 */
public class Exercise11 {
    private class Inner implements MyInterface{

        @Override
        public void f() {
            System.out.println("inner.f()");
        }
    }

    public MyInterface get(){
        return new Inner();
    }

    public Inner get1(){
        return new Inner();
    }

/*    public static void main(String[] args) {
        Exercise11 exercise11 = new Exercise11();
        Inner inner = exercise11.get1();
    }*/

}

class Test{
    public static void main(String[] args) {
        // 此练习显示，因为内部类是私有的，只能向上转型，返回可见的基类
        Exercise11 exercise11 = new Exercise11();
        MyInterface m = exercise11.get();
        MyInterface m1 = exercise11.get1();
        m.f();
        m1.f();
        // 下面的直接报错，编译不通过
        // Inner i1 = exercise11.get1();
        // Inner i2 = (Inner)m;
    }
}

// 注意此例子必须再其他类中的main()方法中
// 如果仍然在Exercise11中的main()方法就会编译通过