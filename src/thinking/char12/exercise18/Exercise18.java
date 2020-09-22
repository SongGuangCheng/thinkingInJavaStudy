package thinking.char12.exercise18;

/**
 * @author sgc
 * @create 2020/8/10
 */


class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}
class Exception3 extends Exception{}

public class Exercise18 {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }
    public static void main(String[] args) {
        try {
            Exercise18 lm = new Exercise18();
            try {
                lm.f();
            } finally {
                try{
                    lm.dispose();
                }
                finally{
                    throw new Exception3();
                }
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}