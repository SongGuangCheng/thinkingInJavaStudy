package question.char17;



import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
@author sgc
@version 2020年8月19日 下午10:00:31
@Description HashMap与LinkedHashMap存储方式，分别初始化并输出值，查看排列方式。
 **/
public class Exercise2 {
	public static void main(String[] args) {
			Map<Integer, String> hashMap = new HashMap<Integer, String>();
			hashMap.put(1, "aaa");
			hashMap.put(9, "fff");
			hashMap.put(7, "ggg");
			hashMap.put(3, "eee");
			Iterator<Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
			linkedHashMap.put(1, "aaa");
			linkedHashMap.put(5, "fff");
			linkedHashMap.put(7, "ggg");
			linkedHashMap.put(3, "eee");
			for ( Integer a : linkedHashMap.keySet()) {
				System.out.println(a+" "+linkedHashMap.get(a));
			}
	}
}
