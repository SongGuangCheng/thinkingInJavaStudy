package thinking.char16;
/**
@author sgc
@version 2020年8月17日 上午9:50:15
@Description 
 **/
public class Exercise1 {

	public static void  f(BerylliumSphere[] berylliumSpheres) {
		System.out.println(berylliumSpheres.length);
	}
	
	public static void main(String[] args) {
		BerylliumSphere[] bs1 = new BerylliumSphere[]{new BerylliumSphere(),new BerylliumSphere()};
		BerylliumSphere[] bs2 = {new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()};
		BerylliumSphere[] bs3 = new BerylliumSphere[3];
		f(bs1);
		f(bs2);
		f(bs3);
		
	}
}

class BerylliumSphere{}

