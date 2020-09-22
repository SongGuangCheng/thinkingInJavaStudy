package thinking.char10.exercise27;

/**
 * @author sgc
 * @create 2020/8/8
 */
public class Exercise26 {
    class Inner{
        public Inner(int i){
            System.out.println("被继承类的内部类构造器");
        }
    }
}

class Outer{
    class Inner1 extends Exercise26.Inner{
        public Inner1(Exercise26 e){
            e.super(1);
            System.out.println("继承类的构造器");
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Inner1 i= o.new Inner1(new Exercise26());
    }
}
