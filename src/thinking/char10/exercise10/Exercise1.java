package thinking.char10.exercise10;

/**
 * @author sgc
 * @create 2020/8/5
 */
public class Exercise1 {

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner inner = o.getInner();
        System.out.println(inner.i);
    }
}

class Outer{
    class Inner{
        int i = 1;
    }

    public Inner getInner(){
        return new Inner();
    }

}