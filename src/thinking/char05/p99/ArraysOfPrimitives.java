package thinking.char05.p99;

import java.util.Arrays;

/**
 * 数组传的是引用
 */
public class ArraysOfPrimitives {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[];
        b = a;
/*        for(int i=0;i<5;i++){
            b[i] = b[i] + 1;
            System.out.println("a["+i+"]==>"+a[i]);
        }*/
        System.out.println(Arrays.toString(a));
    }
}
