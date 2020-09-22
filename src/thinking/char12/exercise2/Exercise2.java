package thinking.char12.exercise2;

/**
 * @author sgc
 * @create 2020/8/10
 */
public class Exercise2 {
    void f(){}

    public static void main(String[] args) {
        try {
            Exercise2 exercise2 = null;
            exercise2.f();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
