package question.char17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
@author sgc
@version 2020年8月19日 下午5:14:26
@Description 
 **/
public class Exercise1 {
	public static void main(String[] args) {
		//ArrayList
		//声明方式一
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(111);
		arrayList.add(222);
		arrayList.add(333);
		//声明方式二
		List<Integer> arrayList2 = new ArrayList<Integer>(){{add(111);add(222);add(333);}};
		//遍历方式一 for循环
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		/*//遍历方式二 foreach
		for (Integer integer : arrayList2) {
			System.out.println(integer);
		}
		//遍历方式三 迭代器
		Iterator<Integer> iterator =  arrayList2.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		System.out.println("-------------------------------------------");
		//ArrayList
		//声明方式一
		List<Integer> linkedList = new LinkedList<Integer>(arrayList);
/*		arrayList.add(111);
		arrayList.add(222);
		arrayList.add(333);*/
		/*//遍历方式一 for循环
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
		//遍历方式二 foreach
		for (Integer integer : linkedList) {
			System.out.println(integer);
		}
		//遍历方式三 迭代器
		Iterator<Integer> iterator1 =  linkedList.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}*/
		//方法
		linkedList.addAll(1, arrayList);
		linkedList.set(2, 8848);
		//遍历方式二 foreach
				for (Integer integer : linkedList) {
					System.out.println(integer);
				}
	}
}
