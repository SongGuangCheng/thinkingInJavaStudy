package question.secondWeek;
/**
@author sgc
@version 2020年8月17日 下午8:44:04
@Description 
 **/
public class Question9 {
	public static void main(String[] args) {
		IPerson<Integer> person1 = new Person1();
		person1.say(1888);
		IPerson person2 = new Person2();
		person2.say("hello");
	}
}

interface IPerson<T>{
	void say(T t);
}

//第一种在实现接口的子类依旧使用泛型,在实例化的时候在动态添加type
class Person1<T> implements IPerson<T>{

	@Override
	public void say(T t) {
			System.out.println("Person1==>"+t);
	}
	
}

//第二种形式,子类实现接口的时候具体化type,在实例化的时候不用再动态添加type
class Person2 implements IPerson<String>{

	@Override
	public void say(String s) {
				System.out.println("Person2==》"+s);
	}
	
}