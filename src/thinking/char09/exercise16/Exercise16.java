package thinking.char09.exercise16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;


/**
 * @author sgc
 * @create 2020/8/4
 */
public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new CharAdaptor(1));  //count用来表示执行几遍 每次执行后count-1
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}

class RandomChar{
    private static Random random = new Random();
    private static final char[] chars=
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final int CHAR_SIZE = 5;
    char[] newChars = new char[CHAR_SIZE];
    char[] getChars(){
        for(int i=0;i<CHAR_SIZE;i++){
            newChars[i] = chars[random.nextInt(chars.length)];
        }
        return newChars;
    }

}

class CharAdaptor extends RandomChar implements Readable{
    private int count;
    public CharAdaptor(int count){
        this.count = count;
    }
    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0)
            return -1;
        char[] c = getChars();
        for(int i = 0;i<c.length;i++){
            System.out.println("c[i]==>"+c[i]);
            cb.append(c[i]);
        }
        System.out.println("c.length==>"+c.length);
        return c.length;
    }
}
