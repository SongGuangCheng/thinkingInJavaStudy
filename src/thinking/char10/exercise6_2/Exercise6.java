package thinking.char10.exercise6_2;


import thinking.char10.exercise6.Outer;
import thinking.char10.exercise6_1.Exercise6_Outer;

/**
 * @author sgc
 * @create 2020/8/5
 */
public class Exercise6 extends Exercise6_Outer {
    Exercise6 exercise6 = new Exercise6();
    Outer getInner1(){
        Exercise6_Outer.Inner inner = exercise6.getInner();
        return inner;
    }

}
