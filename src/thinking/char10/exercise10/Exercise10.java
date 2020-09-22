package thinking.char10.exercise10;

/**
 * @author sgc
 * @create 2020/8/5
 */
public class Exercise10 {
    public MyInterface get(){
        if(true){
            // 和练习9的区别就是这个方法，加个if 被定义在if语句的作域内
            class Inner implements MyInterface {
                @Override
                public void f() {
                    System.out.println("hello");
                }
            }
            return new Inner();
        }
        return null;
    }

    public static void main(String[] args) {
        Exercise10 exercise10 = new Exercise10();
        MyInterface myInterface = exercise10.get();
        myInterface.f();
    }
}

interface MyInterface{
    void f();
}