package thinking.char16;

import java.util.Arrays;

/**
@author sgc
@version 2020年8月17日 下午4:03:14
@Description 
 **/
public class Exercise18 {
	public static void main(String[] args) {
		BerylliumSphere[] berylliumSpheres = {new BerylliumSphere(),
			new BerylliumSphere(),new BerylliumSphere()};
		Object[] objects = new Object[5];
		System.arraycopy(berylliumSpheres, 0, objects, 0, 2);
		
		System.out.println("berylliumSpheres:"+Arrays.toString(berylliumSpheres));
		System.out.println("object:"+Arrays.toString(objects));
	}
}

