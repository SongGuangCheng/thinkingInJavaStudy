package thinking.char21.test;

import java.util.ArrayList;
import java.util.Iterator;

/**
@author sgc
@version 2020年9月2日 上午11:25:13
@Description 
 **/
public class TestCurrentModify {
	public static void main(String[] args) {
	    ArrayList<String> list=new ArrayList<String>();
	    list.add("111");
	    list.add("222");
	    list.add("333");
	 
	    for(Iterator<String> iterator=list.iterator();iterator.hasNext();){
	        String ele=iterator.next();
	        if(ele.equals("111")) //（1）处
	            list.remove("222"); //(2)处
	    }
	    System.out.println(list);
	}
}
