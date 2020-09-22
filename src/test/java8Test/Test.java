package test.java8Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
@author sgc
@version 2020年8月20日 下午1:39:26
@Description Comparable and Comparator
 **/
public class Test {
	public static void main(String[] args) {
		A a = new A(11,"aa");
		A a1 = new A(22,"bb");
		A a2 = new A(11,"cc");
		System.out.println(a1.compareTo(a));
		System.out.println(a2.compareTo(a));
		List<A> list = new ArrayList<A>(Arrays.asList(a1,a2,a));
		Collections.sort(list);
		for (A a3 : list) {
			System.out.println(a3);
		}
		System.out.println("------------------------------------------");
		B b = new B(38,"sa");
		B b1 = new B(58,"qa");
		B b2 = new B(8,"ga");
		List<B> listB = new ArrayList<B>();
		listB.add(b);
		listB.add(b1);
		listB.add(b2);
		Collections.sort(listB, b);
		for (B b3 : listB) {
			System.out.println(b3);
		}
	}
}

class A implements Comparable<A>{
	int age;
	String id ;
	
	public A(int age,String id){
		this.age = age;
		this.id = id;
	}
	@Override
	public int compareTo(A o) {
		if(this.age!=o.age){
			return this.age>o.age?1:-1;
		}
		return this.id.compareTo(o.id);
	}
	
	@Override
	public String toString() {
		return "age:"+age+"id:"+id;
	}
}

class B implements Comparator<B>{
	int age;
	String id ;
	
	public B(int age,String id){
		this.age = age;
		this.id = id;
	}
	@Override
	public int compare(B o1, B o2) {
		if(o1.id.equals(o2.id)){
			return o1.age-o2.age;
		}
		return o1.id.compareTo(o2.id);
	}
	@Override
	public String toString() {
		return "age:"+age+"id:"+id;
	}
}