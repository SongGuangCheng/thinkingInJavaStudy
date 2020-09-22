package thinking.char17;

import java.util.*;
import java.util.regex.Pattern;

import thinking.Countries;


/**
@author sgc
@version 2020年8月18日 上午11:16:55
@Description 
 **/
public class Exercise02 {
	public static void main(String[] args) {
		Map<String,String> countryMap = new HashMap<String,String>();
		int length = Countries.DATA.length;
		for (int i = 0; i < length; i++) {
			if(Pattern.compile("A\\w+").matcher(Countries.DATA[i][0]).matches());
			countryMap.put(Countries.DATA[i][0], Countries.DATA[i][1]);
		}
		Set<String> countrySet = countryMap.keySet();
			System.out.println(countryMap);
			System.out.println(countrySet);
	}
}
