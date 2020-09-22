package test.java8Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author sgc
 * @create 2020/9/7
 */
public class Lambda02 {
    public static void main(String[] args) {
        Comparator<Integer> com = (a,b)-> {
            Integer.compare(a,b);
            return a.compareTo(b);
        };
        System.out.println(com.compare(3,2));
    }
}

