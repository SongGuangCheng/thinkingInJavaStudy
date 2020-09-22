package thinking.char05.chapters5;

public class Test4 {
    public Test4() {
        System.out.println("我是一个无参构造器！");
    }

    public Test4(String s){
        System.out.println("传入参数为==》"+s);
    }

    public static void main(String[] args) {
        Test4 test4 = new Test4("hello world!");
    }
}
