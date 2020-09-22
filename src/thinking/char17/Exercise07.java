package thinking.char17;


import java.util.*;

import thinking.Countries;


/**
@author sgc
@version 2020年8月18日 下午3:45:45
@Description 
 **/
public class Exercise07 {
	public static void main(String[] args) {
		 List<String> a = new LinkedList<String>(Countries.names(6));
		 
	        List<String> b = new ArrayList<String>(Countries.names(6));
	 
	        ListIterator<String> c = a.listIterator();
	 
	        ListIterator<String> d = b.listIterator();
	 
	        while (c.hasNext()) {
	 
	            c.next();
	 
	            if (c.hasNext())
	                c.add(d.next());
	 
	            else {
	                c.add(d.next());
	                break;
	            }
	 
	        }
	 
	        System.out.println(a);
	 

	}
}
