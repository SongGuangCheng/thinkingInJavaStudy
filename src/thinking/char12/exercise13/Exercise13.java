package thinking.char12.exercise13;



/**
 * @author sgc
 * @create 2020/8/10
 */
public class Exercise13 {
    void f() throws Exception{
        //throw new Exception1();
        //throw new Exception2();
        throw new Exception3();
    }
    public static void main(String[] args) {
        try {
            new Exercise13().f();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("我还是执行行了");
        }
    }
}

class Exception1 extends Exception{

}

class Exception2 extends Exception{

}

class Exception3 extends Exception{

}

