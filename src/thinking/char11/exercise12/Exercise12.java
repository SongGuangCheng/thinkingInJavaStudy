package thinking.char11.exercise12;

import java.util.*;

/**
 * @author sgc
 * @create 2020/8/8
 */
public class Exercise12 {
    public static void main(String[] args) {

            List<Integer> ints = new ArrayList<Integer>(
                    Arrays.asList(1,2,3,4,5,6,7,8));
            ListIterator<Integer> fwd = ints.listIterator();

            List<Integer> ints1 = new ArrayList<Integer>(ints);
            ListIterator<Integer> rev = ints1.listIterator(ints1.size());//指向列表索引最后一个元素

            while(fwd.hasNext()){
                Integer tmp = fwd.next();
                rev.previous();//向前
                rev.set(tmp);
            }
            System.out.println("ints: "+ints);
            System.out.println("ints1: "+ints1);
        }
    }


