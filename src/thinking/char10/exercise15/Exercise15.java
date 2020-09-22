package thinking.char10.exercise15;

/**
 * @author sgc
 * @create 2020/8/5
 */
public class Exercise15 {
    int i;
    public Exercise15(int i){
        this.i = i;
    }
    void f(){
        System.out.println("hello world");
    }

}

class Clazz{
    public Exercise15 get(int i){
        return new Exercise15(i){
            void f(){
                System.out.println("匿名内部诶f()");
            }
        };
    }

    public static void main(String[] args) {
        Clazz c = new Clazz();
        Exercise15 e = c.get(11);
        e.f();
        System.out.println(e.i);
    }
}
