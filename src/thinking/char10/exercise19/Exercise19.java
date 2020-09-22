package thinking.char10.exercise19;

/**
 * @author sgc
 * @create 2020/8/6
 */
public class Exercise19 {
    public static void main(String[] args) {
        Clazz clazz = new Clazz();
        Clazz.Inner11 inner11 = clazz.new Inner11();
        inner11.f();

    }

}
interface Inner{}
class Clazz{
    public int i = 1;
    class Inner11{
        void f(){
            System.out.println("Inner11.f()"+i);
        }
        class Inner22{
            void f(){
                System.out.println("Inner11.Inner22.f()");
            }
        }
    }
    static class Inner1 implements Inner{
        Inner1(){
            System.out.println("inner1");
        }

        static class Inner2 implements Inner{
            Inner2(){
                System.out.println("inner2");
            }
            static Inner get(){
                return new Inner2();
            }

            public static void main(String[] args) {
                Inner i = get();
            }
        }
    }


}
