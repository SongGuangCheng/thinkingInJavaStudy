package thinking.char17;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
@author sgc
@version 2020年8月20日 下午8:56:12
@Description 
 **/
public class MyTest1{
	public static void main(String[] args) {
		List list = Arrays.asList("111","222");
		List<String> arrayList = new ArrayList<String>(list);
		
		arrayList.addAll(list);
		arrayList.replaceAll(t ->t+"A");
		System.out.println(arrayList);
		/*List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("good");
		list.add("night");
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add("world");
		set.add("good");
		set.add("night");
		Collections.fill(list, "nice");
		for (String string : list) {
			System.out.println(string);
		}
		Collections.addAll(list, "goodnight","goodmorning");
		for (String string : list) {
			System.out.println(string);
		}
		List<String> crushList = Collections.nCopies(3,"crush");
		for (String string : crushList) {
			System.out.println(string);
		}*/
		
	}

	
}
