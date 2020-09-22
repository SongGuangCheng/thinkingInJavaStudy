package thinking.char12.exercise11;



/**
 * @author sgc
 * @create 2020/8/10
 */
public class Exercise11 {
    void g() throws RuntimeException {
        throw new RuntimeException();
    }
    void f(){
        try {
            g();
        }catch (RuntimeException e){
            e.printStackTrace();
            try {
                throw new Exception2();
            } catch (Exception2 exception2) {
                exception2.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Exercise11().f();
    }
}


class Exception1 extends Exception{

}

class Exception2 extends Exception{

}
