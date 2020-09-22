package question.char16;


import java.util.*;

/**
@author sgc
@version 2020年8月20日 下午2:45:31
@Description 
 **/
public class Exercise1 {
	public static void main(String[] args) {
		Map map = new HashMap<String, String>();
		map.put("name", "杰克马");
		map.put("age", "52");
		map.put("sex", "男");
		map.put("company", "alibaba");
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("key:"+key+"   value:"+map.get(key));
		}
		int[] a = {1,2,4,6,5};
		int[] s = new int[5];
		s[0] = 2;
		s[1] = 5;
		s[2] = 7;
		s[3] = 3;
		s[4] = 8;
		for (int i : s) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("方式一扩容");
		//方式一调用Arrays.copyOf(原数组，新数组长度)方法 返回一个新数组
		//将原数组s复制进来，指定新数组长度为8，会设默认值
		int[] newArr = Arrays.copyOf(s, 8);
		for (int i : newArr) {
			System.out.print(i+" ");
		}
		//方式二：还可以声明一个新数组 将原有数组遍历赋值
		int[] newArr2 = new int[8];
		for (int i = 0; i < newArr2.length; i++) {
			if(i<s.length){
				newArr2[i] = s[i];
			}
			
		}
		System.out.println();
		System.out.println("方式二扩容");
		for (int i : newArr2) {
			System.out.print(i+" ");
		}
	}
}
