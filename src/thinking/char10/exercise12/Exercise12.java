package thinking.char10.exercise12;

/**
 * @author sgc
 * @create 2020/8/5
 */
public class Exercise12 {
    public static void main(String[] args) {
        MyClazz myClazz = new MyClazz();
        myClazz.innerNoName();
    }
}

interface InnerNoName{

}

class MyClazz{
    private String name;
    private void f(){
        System.out.println(name);
    }
    void innerNoName(){
        new InnerNoName(){
            void change(){
                name = "new Name";
                f();
            }
        }.change();
    }



}
