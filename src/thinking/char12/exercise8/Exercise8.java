package thinking.char12.exercise8;

/**
 * @author sgc
 * @create 2020/8/10
 */
public class Exercise8 {


    public static void main(String[] args) {
        try {
            MyException exercise = null;
            exercise.g();
            new MyException().g();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class MyException extends Exception{
    void g() throws MyException {
        throw new MyException();
    }
}