package thinking.char09.p182;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @author sgc
 * @create 2020/8/4
 */
public class RandomWords implements Readable{
    private static Random random = new Random();
    private static final char[] capitals=
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers=
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase().toCharArray();
    private static final char[] vowels=
            "aeiou".toCharArray();
    private int count;
    public RandomWords(int count){
        this.count = count;
    }
    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0)
        return -1;
        cb.append(capitals[random.nextInt(capitals.length)]);
        for(int i = 0;i<4;i++){
            cb.append(vowels[random.nextInt(vowels.length)]);
            cb.append(lowers[random.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new RandomWords(10));
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
