package question.secondWeek;
/**
@author sgc
@version 2020年8月16日 下午4:06:23
@Description 反射
 **/
public class Question5 {
		public static void main(String[] args) {
			Factory factory = new Factory();
			Dog dog = (Dog)factory.getInstcance("secondWeekQuestion.Dog");
			dog.say();
		}
}

interface Animal{
	public void say();
}

class Dog implements Animal{
	@Override
	public void say() {
		System.out.println("汪汪汪");
	}	
}

class Cat implements Animal{
	@Override
	public void say() {
		System.out.println("喵喵喵");
	}	
}

class Factory{
	public static Animal getInstcance(String className) {
		Animal animal = null;
		try {
			animal = (Animal) Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return animal;
	}
}