package thinking.char16;


import java.util.*;

/**
@author sgc
@version 2020年8月17日 下午2:16:11
 * @param <T>
@Description 
 **/
public class Exercise10<T> {
	List<T> list = new ArrayList<T>();

}

class ArrayOfGenericType<T>{
	T[] array;
	@SuppressWarnings("unchecked")
	public ArrayOfGenericType(int size) {
		array = (T[])new Object[size];
	}
}