package thinking.char07.chapter_7.exercise21;

/**
 * @author sgc
 * @create 2020/8/2
 * 试图覆盖一个private方法似乎是奏效的且编译器不会报错 但这会造成混淆 应该用Override注释来解决混淆
 */
public class Exercise21 {
    private final void say(){
        System.out.println("hello");
    }

}

class Son extends Exercise21 {
    final void say(){
        System.out.println("hello");
    }
}

