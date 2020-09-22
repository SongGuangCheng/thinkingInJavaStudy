package thinking.char09.exercise17;

/**
 * @author sgc
 * @create 2020/8/4
 */
public class Exercise17 {
    public static void main(String[] args) {
        System.out.println(TestInterface.NAME);
        //可以通过类名调用
    }
}

interface TestInterface{
    int CUM = 1; //必须指定值
    String NAME = "jack";
}

class MyClass implements TestInterface{
    public static void main(String[] args) {
        //CUM = 2; 无法修改 为final类型
    }
}
