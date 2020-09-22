package thinking.char16;

import java.util.Arrays;
import java.util.Comparator;

/**
@author sgc
@version 2020年8月17日 下午5:28:45
@Description 
 **/
public class Exercise21 {
	public static void main(String[] args) {
		A1[] as = {new A1(),
			new A1(),new A1()};
		Object[] objects = new Object[5];
		System.arraycopy(as, 0, objects, 0, 2);
		System.out.println(new A1().compareTo(new A1()));
		System.out.println("berylliumSpheres:"+Arrays.toString(as));
		System.out.println("object:"+Arrays.toString(objects));
		System.out.println("----------------------------------------");
		Arrays.sort(as);
		Arrays.sort(objects);
		
	}
}

class A1 implements Comparable<A1>{
	private static long count;
	protected final long id = count++;
	@Override
	public int compareTo(A1 o) {
		return (this.id>o.id?1:(this.id==o.id?0:-1));
	}
	@Override
	public String toString() {
		return "A1---"+id;
	}
}

class MyComparator implements Comparator<A1>{

	@Override
	public int compare(A1 o1, A1 o2) {
		
		return (o1.id>o2.id?1:(o1.id==o2.id?0:-1));
	}

	
	
}