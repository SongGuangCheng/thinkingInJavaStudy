package thinking.char12.exercise30;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author sgc
 * @create 2020/8/11
 */

class SomeOtherException extends Exception{}
class Annoyance extends RuntimeException {}
class Sneeze extends Annoyance {}
class WrapCheckedException {
    void throwRuntimeException(int type) {
        try {
            switch(type) {
                case 0: throw new Sneeze();
                case 1: throw new Annoyance();
                case 2: throw new RuntimeException("Where am I?");
                default: return;
            }
        } catch(Exception e) { // Adapt to unchecked:
            throw new RuntimeException(e);
        }
    }
}
public class Exercise30 {
    public static void main(String[] args) {
        // Catch the exact type:
        WrapCheckedException wc=new WrapCheckedException();
        for(int i=0;i<4;i++){
            try {
                if(i<3) wc.throwRuntimeException(i);
                else throw new SomeOtherException();
            } catch(SomeOtherException s) {
                s.printStackTrace();
            }catch(RuntimeException r){

                try{
                    throw r.getCause();
                }catch(Sneeze s){
                    s.printStackTrace();
                }catch(Annoyance a){
                    a.printStackTrace();
                }catch(Throwable e){
                    e.printStackTrace();
                }
            }
        }
    }
}