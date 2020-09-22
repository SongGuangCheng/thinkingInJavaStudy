package question.char17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
@author sgc
@version 2020年8月20日 上午9:11:31
@Description 如何把list中元素顺序打乱或者按一定规则排序
 **/
public class Exercise8 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Arrays.asList("aaa","sss","qqq","hhh"));
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("打乱");
		Collections.shuffle(list);
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("排序");
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
	}
}
