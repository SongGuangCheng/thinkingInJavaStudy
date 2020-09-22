package thinking.char11.exercise2;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author sgc
 * @create 2020/8/8
 */
public class Exercise2 {
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<Integer>();
        for (int i=0;i<10;i++){
            c.add(i);
        }
        for(Integer i:c){
            System.out.print(i+", ");
        }
    }
}
