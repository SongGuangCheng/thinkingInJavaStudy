package thinking.char12.exercise5;

/**
 * @author sgc
 * @create 2020/8/10
 */
public class Exercise5 {
    public static void main(String[] args) {
        int a[] = new int[2];
        int i = 5;
        while(true){
            try {
                a[i] = 10;
                System.out.println(a[i]);
                break;
            }catch (Exception e){
                e.printStackTrace();
                i--;
            }
        }
        System.out.println("循环结束");
    }
}
