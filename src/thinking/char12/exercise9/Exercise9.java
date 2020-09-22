package thinking.char12.exercise9;

/**
 * @author sgc
 * @create 2020/8/10
 */
public class Exercise9 {
    void f() throws Exception{
        //throw new Exception1();
        //throw new Exception2();
        throw new Exception3();
    }
    public static void main(String[] args) {
        try {
            new Exercise9().f();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Exception1 extends Exception{

}

class Exception2 extends Exception{

}

class Exception3 extends Exception{

}
