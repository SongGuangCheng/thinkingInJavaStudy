package thinking.char10.exercise3;

/**
 * @author sgc
 * @create 2020/8/5
 */
public class Exercise3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
//      Outer.Inner inner = outer.getInner();
        Outer.Inner inner = outer.new Inner(); //两种创建内部类的方式
        System.out.println(inner);
    }
}
class Outer{
    private String s;
    public Outer(){
        s = "aaa";
    }
    class Inner{
        int i = 1;
        public String toString(){
            return "Outer.name==>"+s;
        }

    }

    public Outer.Inner getInner(){
        return new Outer.Inner();
    }

}