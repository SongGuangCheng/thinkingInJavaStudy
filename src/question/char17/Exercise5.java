package question.char17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
@author sgc
@version 2020年9月3日 下午5:30:36
@Description 列举list中的子类，并说明不同
 **/
public class Exercise5 {
	public static void main(String[] args) {
		List<String> arraylList = new ArrayList<String>();
		//查询快 增删慢 线程不安全	底层数组
		List<String> linkedList = new LinkedList<String>();
		//查询慢 增删快 线程不安全	底层链表
		List<String> vector = new Vector<String>();
		//线程安全 效率低 底层数组
		
	}
}
