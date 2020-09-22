package question.secondWeek;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
@author sgc
@version 2020年8月16日 下午4:58:36
@Description 
 **/
public class Question7 {
		public static void main(String[] args) throws Exception {
			Class<Reflect> classInfo = Reflect.class;
			//获得类的构造参数
			System.out.println("类Reflect构造函数如下所示");
			Constructor cons[] = classInfo.getConstructors();
			for (int i = 0; i < cons.length; i++) {
				System.out.println(cons[i]);
			}
			//获得类的属性
			System.out.println("类Reflect属性如下所示");
			Field[] fields = classInfo.getDeclaredFields();
			for (int i = 0; i < fields.length; i++) {
				System.out.println(fields[i]);
			}
			//获得类的方法
			System.out.println("类Reflect方法如下所示");
			Method[] methods = classInfo.getDeclaredMethods();
			for (int i = 0; i < methods.length; i++) {
				System.out.println(methods[i]);
				
			}
			
			System.out.println("---------------------------------------------");
			Reflect r = new Reflect();
			Field field = r.getClass().getDeclaredField("name");
			field.setAccessible(true); //注意私有类型访问权限需设置为true
			System.out.println(field);
			Object object = field.get(r);
			System.out.println(object);
			field.set(r,"修改私有属性");
			object = field.get(r);
			System.out.println(object);
			System.out.println("---------------------------------------------");
			Method privateMethod = classInfo.getDeclaredMethod("f1");
			//设置对私有方法的访问权限
			privateMethod.setAccessible(true);
	        //执行方法
			privateMethod.invoke(r);
			System.out.println("---------------------------------------------");
			Constructor<Reflect> privateConstructor = classInfo.getConstructor(String.class);
			Reflect newInstance = privateConstructor.newInstance("sss");
			newInstance.f2();
		}
}

class Reflect{
	private String name = "私有属性";
	private int age = 18;
	public Reflect() {
		System.out.println("公共构造器");
	}
	public Reflect(String s) {
		System.out.println("公共构造器");
	}
	private Reflect(int i) {
		System.out.println("私有构造器");
	}
	private void f1() {
		System.out.println("私有方法");
	}
	public void f2() {
		System.out.println("公有方法");
	}
}