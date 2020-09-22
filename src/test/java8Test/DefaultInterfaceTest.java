package test.java8Test;

/**
 * @author sgc
 * @create 2020/9/7
 * 测试接口默认方法
 */
public class DefaultInterfaceTest {
    public static void main(String[] args) {
        Car car = new BigCar();
        car.say();
        Car.blow();
        Car.hello();
    }
}

interface Car{
    default void say(){
        System.out.println("我是一辆车");
    }

    static void hello(){
        System.out.println("你好");
    }

    static void blow(){
        System.out.println("按喇叭");
    }
}

class BigCar implements Car{

}