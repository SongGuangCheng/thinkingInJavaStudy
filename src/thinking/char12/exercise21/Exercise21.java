package thinking.char12.exercise21;

/**
 * @author sgc
 * @create 2020/8/11
 * 基类抛出异常之后直接终止了对派生类的访问
 *
 */

class E1 extends Exception {}
class A {
    A() throws E1 {
        throw new E1();
    }
}

public class Exercise21 extends A {
    int i = 1;
   public Exercise21() throws E1{

        try{ A a = new A();}
        catch (E1 e){
            System.out.println("捕获到基类的异常");
        }
        System.out.println("son.......");
   }

    public static void main(String[] args) {

        try {
            Exercise21 exercise21 = new Exercise21();
            System.out.println(exercise21.i);
        } catch (E1 e1) {
            System.out.println("E1在main中被捕获");;
        }
    }
}

