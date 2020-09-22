package thinking.char10.exercise7;

/**
 * @author sgc
 * @create 2020/8/5
 */
public class Exercise7 {
    public static void main(String[] args) {
        Clazz1 clazz1 = new Clazz1();
        Clazz1.Inner inner = clazz1.getInner();
        inner.change("tom");
    }
}

class Clazz1{
    private String name = "Clazz1";
    private void say(){
        System.out.println(name);
    }
    class Inner{
        void change(String s){
            name = s;
            say();
        }
    }

    Inner getInner(){
        return new Inner();
    }

}
