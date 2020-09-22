package thinking.char07.chapter_7.exercise23;

/**
 * @author sgc
 * @create 2020/8/2
 * 静态块在类第一次加载时执行。初始化块在调用构造方法是执行。
 * 静态块只执行一次，初始化块可以执行多次。
 *
 */
public class Exercise23 {
    public static void main(String[] args) {
        System.out.println("调用静态成员");
        LoadTest.staticMember();
        System.out.println("创建一个对象");
        new LoadTest();
    }
}
class LoadTest{
    static{
        System.out.println("类加载");
    }
    static void staticMember() {};
}
