package thinking.char12.exercise19;

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

public class Exercise19 {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }
    public static void main(String[] args) {
        try {
            Exercise19 lm = new Exercise19();
            try {
                lm.f();
            }catch (Exception e){
                e.printStackTrace();
            }
            finally {
                try {
                    lm.dispose();
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}