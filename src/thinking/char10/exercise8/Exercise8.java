package thinking.char10.exercise8;

/**
 * @author sgc
 * @create 2020/8/5
 * 外部类可以访问内部类的私有属性及方法
 */
public class Exercise8 {
    class Inner{
        private int i = 1;
        int j = 2;
        private void say(){
            System.out.println("hello");
        }
        public void sayHello(){
            System.out.println("hello");
        }
    }
    public void TestInner(){
        Inner inner = new Inner();
        System.out.println(inner.i);
        System.out.println(inner.j);
        inner.say();
        inner.sayHello();
    }

    public static void main(String[] args) {
        Exercise8 exercise8 = new Exercise8();
        exercise8.TestInner();
    }
}

class Test{
    public static void main(String[] args) {
        Exercise8 exercise8 = new Exercise8();
        exercise8.TestInner();
    }
}
