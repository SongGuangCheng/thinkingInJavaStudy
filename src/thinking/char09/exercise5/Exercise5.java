package thinking.char09.exercise5;

import thinking.char09.exercise5_interface.MyInterface;

/**
 * @author sgc
 * @create 2020/8/3
 */
public class Exercise5 implements MyInterface {

    @Override
    public void f1() {
        System.out.println("f1()");
    }

    @Override
    public void f2() {
        System.out.println("f2()");
    }

    @Override
    public void f3() {
        System.out.println("f3()");
    }

    public static void main(String[] args) {
        Exercise5 exercise5 = new Exercise5();
        exercise5.f1();
        exercise5.f2();
        exercise5.f3();
    }
}


