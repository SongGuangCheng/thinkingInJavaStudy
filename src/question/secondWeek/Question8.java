package question.secondWeek;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
@author sgc
@version 2020年8月16日 下午5:59:00
@Description 动态代理
 **/
public class Question8 {

	public static void main(String[] args) {
		//1.被代理类的对象
		RealSubject real = new RealSubject();
		//2.创建一个实现了InvocationHandler接口的对象
		MyInvocationHander hander = new MyInvocationHander();
		//3.调用getProxyObject方法 动态返回一个同样实现了real所在类实现的接口Subject的代理类对象
		Subject sub =(Subject) hander.getProxyObject(real);//此时的sub就是代理类对象
		sub.action();//转到对InvocationHander接口的实现类的invoke（）方法的使用
	}
}

interface Subject{
	void action();
}

class RealSubject implements Subject{

	@Override
	public void action() {
		System.out.println("我是被代理类");
	}
}

class MyInvocationHander implements InvocationHandler{
	Object object;//被代理对象
	
	//给被代理对象实例化 返回一个代理类的对象
	public Object getProxyObject(Object object) {
		this.object = object;
		return 	Proxy.newProxyInstance(object.getClass().getClassLoader(), 
				object.getClass().getInterfaces(), this);
	}
	
	//当通过代理类的对象发起对重写方法的调用时，都会转换为对如下invoke方法的调用
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//方法调用的返回值
		Object returnVal = method.invoke(object, args);
		return returnVal;
	}
	
}