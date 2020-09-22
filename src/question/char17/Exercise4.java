package question.char17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
@author sgc
@version 2020年8月19日 下午10:36:51
@Description 说出数组与集合的区别与联系，自己封装一个简单的集合类
 **/
public class Exercise4 {
	public static void main(String[] args) {
		MyArrayList<String> myArrayList = new MyArrayList();
		myArrayList.add("php");
		myArrayList.add("is");
		myArrayList.add("the best");
		myArrayList.add("language in the world");
		System.out.println(myArrayList.get(2));
		System.out.println(myArrayList.indexOf("is"));
		//myArrayList.clear();
		myArrayList.remove("is");
	    
	}
}

class MyArrayList<T> {
	private Object[] elementData;//存储的数据
	private final int DEFUALT_CAPACITY = 10;//数组默认长度
	private int size;//集合实际长度
	
	//构造方法
	public MyArrayList() {
		elementData = new Object[DEFUALT_CAPACITY];
	}
	public MyArrayList(int initLength) {
		if (initLength>0) {
			elementData = new Object[initLength];
		}else if (initLength == 0) {
			elementData = new Object[DEFUALT_CAPACITY];
		}else {
			throw new IllegalArgumentException("初始化长度不合法");
		}
	}
	
	 /**
     * 给数组中添加元素
     *
     * @param element */
    public void add(T element) {
        //数组扩容
        if (size == elementData.length) {
            Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
            System.arraycopy(elementData, 0, newArray, 0, elementData.length);
            elementData = newArray;
        }
        elementData[size++] = element;
    }
	
	//确定剩余空间是否支持继续添加一个元素
	private void ensureCapacitySpace(int l) {
		if(l>elementData.length){
			//长度不够 需要扩容
			grow(l);
		}
	}
	
	//扩容
	private void grow(int l) {
		int newCapacity = (int) (elementData.length*1.5);
        // 已经得到合理的容量，再进行和最小容量比较
        if(newCapacity - l < 0) {
            // 依然不小于最小容量，那么就直接用最小容量
            newCapacity = l;
        }
        // 已经得到了合理的容量，可以对数组进行扩容
        
        // 第一种方法：Arrays.copyOf();
        elementData = Arrays.copyOf(elementData, newCapacity);
        //重新声明一个数组 把原有数组中的数组遍历赋值进去
	}
	
	
	public int size() {
		return size;
	}
	
	public T get(int i) {
		if(i>0&&i<size){
			return (T) elementData[i];
		}
		throw new ArrayIndexOutOfBoundsException();
	}
	
	  public boolean remove(Object x){
	        //先判断是否存在该元素
	        if (indexOf(x) != -1){
	            //获取到元素的位置，再进行删除操作
	            remove(indexOf(x));
	            return true;
	        }
	        return false;
	    }
	
    /**
     * 移除所有的元素
     */
    public void clear() {
        // 把数组中每一个元素都设为null
        for(int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        // size设为0
        size = 0;
    }
    
    /**
     * 判断是否包含指定的对象
     * @param o 对象
     * @return boolean
     */
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }
    
    /**
     *  返回首次出现指定对象相同的元素对应的索引
     * @param o 对象
     * @return 索引
     */
    public int indexOf(Object o) {
        int index = 0;
        if (o == null){
            for (int i = 0; i < size; i ++){
                if (elementData[i] == null){
                    return index;
                }
                index ++;
            }
        } else {
            for (int i = 0; i < size; i ++){
                if (o.equals(elementData[i])){
                    return index;
                }
                index ++;
            }
        }
        return -1;
    }
    
    //查找元素最后出现的位置
    public int lastIndexOf(Object x){
        int index = size-1;
        if (x == null){
            for (int i = size - 1; i >= 0; i --){
                if (elementData[i] == null){
                    return index;
                }
                index --;
            }
        } else {
            for (int i = size - 1; i >= 0; i --){
                if (x.equals(elementData[i])){
                    return index;
                }
                index --;
            }
        }
        return -1;
    }

}
