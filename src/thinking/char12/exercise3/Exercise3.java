package thinking.char12.exercise3;



/**
 * @author sgc
 * @create 2020/8/10
 */
public class Exercise3 {


    public static void main(String[] args) {
        int a[] = {1,2,4,5,2};
        try {
            System.out.println(a[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace(System.out);
        }
    }
}
