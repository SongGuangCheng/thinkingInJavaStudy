package question.secondWeek;
/**
@author sgc
@version 2020年8月16日 下午4:34:54
@Description 
 **/
public class Question6 {
	public static void main(String[] args) {
		Father f = new Son();
		Class<Son> sonType = Son.class;
		Son son = sonType.cast(f);
		son.sonSay();
		//Son s = (Son)f;
		//s.sonSay(); 与cast方法效果一样
	}
}

class Father{
	public void say() {
		System.out.println("基类方法");
	}
}
class Son extends Father{
	public void sonSay(){
		System.out.println("子类方法");
	}
}