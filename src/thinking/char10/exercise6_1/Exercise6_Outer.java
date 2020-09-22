package thinking.char10.exercise6_1;

import thinking.char10.exercise6.Outer;

/**
 * @author sgc
 * @create 2020/8/5
 */
public class Exercise6_Outer {

    protected class Inner implements Outer {
        @Override
        public void f1() {
            System.out.println("inner.f1()");
        }
    }

    public Inner getInner(){
        return new Inner();
    }
}
