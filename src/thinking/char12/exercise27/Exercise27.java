package thinking.char12.exercise27;

/**
 * @author sgc
 * @create 2020/8/11
 */
public class Exercise27 {


    public static void main(String[] args) {
        int a[] = {1,2,4,5,2};
        try {
            System.out.println(a[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            throw new RuntimeException();
        }
    }
}

