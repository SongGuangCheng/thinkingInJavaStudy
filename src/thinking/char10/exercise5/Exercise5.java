package thinking.char10.exercise5;

/**
 * @author sgc
 * @create 2020/8/5
 */
public class Exercise5 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inter inter = outer.new Inter();
        System.out.println(inter.i);
    }
}

class Outer{
    class Inter{
        int i = 1;
    }
}
