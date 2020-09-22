package thinking.char10.exercise13;

/**
 * @author sgc
 * @create 2020/8/5
 */
public class Exercise13 {
    public MyInterface get(){
        return new MyInterface(){
            public void f(){
                System.out.println("匿名内部类");
            };
        };
    }

    public static void main(String[] args) {
        Exercise13 exercise13 = new Exercise13();
        exercise13.get().f();
    }
}

    interface MyInterface{
        void f();
    }
