package thinking.char17;


import java.util.*;

/**
@author sgc
@version 2020年8月18日 下午3:13:32
@Description 
 **/
public class Exercise06 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Arrays.asList("aa","bb","cc","dd","ee"));
		Collection<String> collection = list;
		Collection<String> collection1 = list.subList(1, 3);
		System.out.println("collection---------"+collection);
		System.out.println("collection1---------"+collection1);
		try {
			collection.contains(collection1);
			System.out.println("collection---------"+collection);
			System.out.println("collection1---------"+collection1);
		} catch (Exception e) {
			System.out.println("--------------contains-----------");
		}
		try {
			collection.removeAll(collection1);
			System.out.println("collection---------"+collection);
			System.out.println("collection1---------"+collection1);
		} catch (Exception e) {
			System.out.println("--------------removeAll-----------");
		}
		try {
			collection.addAll(collection1);
			System.out.println("collection---------"+collection);
			System.out.println("collection1---------"+collection1);
		} catch (Exception e) {
			System.out.println("--------------addAll-----------");
		}
		try {
			collection.retainAll(collection1);
			System.out.println("collection---------"+collection);
			System.out.println("collection1---------"+collection1);
		} catch (Exception e) {
			System.out.println("--------------retainAll-----------");
		}
		
	}
}
