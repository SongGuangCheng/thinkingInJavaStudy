package thinking.char17;

import java.util.*;

/**
@author sgc
@version 2020年8月18日 上午11:05:04
@Description 
 **/
public class Exercise01 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<String> list2 = new LinkedList<String>();
		for (int i = 0; i < 5; i++) {
			list1.add(i);
		}
		Collections.sort(list1);
		Collections.shuffle(list1);
		for (Integer a : list1) {
			System.out.print(a+" ");
		}
		list2.add("bbb");
		list2.add("aaaa");
		list2.add("acd");
		Collections.sort(list2);
		Collections.shuffle(list2);
		for (Object object : list2) {
			System.out.print(object+" ");
		}
		Collections.shuffle(list2);
		for (Object object : list2) {
			System.out.print(object+" ");
		}
	}
}
