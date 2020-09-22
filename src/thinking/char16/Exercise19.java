package thinking.char16;

import java.util.Arrays;

/**
@author sgc
@version 2020年8月17日 下午4:37:22
@Description 
 **/
public class Exercise19 {
	public static void main(String[] args) {
		A[] as = {new A(1),new A(1),new A(1)};
		A[] as1 = {new A(1),new A(1),new A(1)};
		System.out.println(Arrays.equals(as, as1));

		
		
	}
}

class A{
	int i ;
	public A(int i){
		this.i  = i;
	}
	
	@Override
	public boolean equals(Object b) {
		System.out.println(b.getClass().getSimpleName());
        if (b.getClass().getSimpleName().equals("A"))
            return true;
		return false;
	}
	
	
}