package thinking.char09.p182;


import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @author sgc
 * @create 2020/8/4
 */
public class RandomFloats {
   public float aFloat(){
       Random random = new Random();
       float f = 0.0f;
       for(int i=0;i<7;i++){
           f += random.nextFloat();
       }
       return f;
   }
}

class FloatsAdaptor extends RandomFloats implements Readable{
    private int count;
    public FloatsAdaptor(int count){
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0)
            return -1;
        String s = Float.toString(aFloat())+" ";
        cb.append(s);
        return s.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new FloatsAdaptor(3));
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }

    }
}
