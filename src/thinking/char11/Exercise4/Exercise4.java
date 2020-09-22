package thinking.char11.Exercise4;

import java.util.*;

/**
 * @author sgc
 * @create 2020/8/8
 */
public class Exercise4 {
    public static void main(String[] args) {
        Process p = new Process();
        String[] strings = new String[4];
        strings[0] = p.next();
        strings[1] = p.next();
        strings[2] = p.next();
        strings[3] = p.next();
        System.out.println("数组");
        for(String s : strings){
            System.out.print(" "+s);
            System.out.println();
        }
        System.out.println("LinkedList");
        List<String> list = new LinkedList<>();
        list.add(p.next());
        list.add(p.next());
        list.add(p.next());
        for(String s : list){
            System.out.print(" "+s);
            System.out.println();
        }
        System.out.println("ArrayList");
        List<String> arrayList = new ArrayList<>();
        arrayList.add(p.next());
        arrayList.add(p.next());
        arrayList.add(p.next());
        for(String s : arrayList){
            System.out.print(" "+s);
            System.out.println();
        }
        System.out.println("HashSet");
        Set<String> set = new HashSet<>();
        set.add(p.next());
        set.add(p.next());
        set.add(p.next());
        for(String s : set){
            System.out.print(" "+s);
            System.out.println();
        }

    }
}

class Process{
    String[] strings = new String[]{"aaa","bbb","ccc","ddd"};
    String next(){
        Random random = new Random();
        int i = random.nextInt(3);
        return strings[i];
    }
}