package thinking.char17;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import thinking.Countries;


/**
@author sgc
@version 2020年8月18日 下午2:04:47
@Description 
 **/
public class Exercise03 {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		int l = Countries.DATA.length;
		System.out.println(l);
		for (int i = 0; i < l; i++) {
			set.add(Countries.DATA[i][0]);
		}
		for (int i = 0; i < l; i++) {
			set.add(Countries.DATA[i][0]);
		}
		System.out.println(set.size());
	}
}
