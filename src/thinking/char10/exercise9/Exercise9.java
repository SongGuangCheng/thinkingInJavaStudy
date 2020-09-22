package thinking.char10.exercise9;

/**
 * @author sgc
 * @create 2020/8/5
 */
public class Exercise9 {
    public MyInterface get(){
        class Inner implements MyInterface{
            @Override
            public void f() {
                System.out.println("hello");
            }
        }
        return new Inner();
    }

    public static void main(String[] args) {
        Exercise9 exercise9 = new Exercise9();
        exercise9.get().f();
    }
}

interface MyInterface{
    void f();
}
