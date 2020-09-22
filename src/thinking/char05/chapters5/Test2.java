package thinking.char05.chapters5;

/**
 * 2.创建一个类, 它包含一个在定义时就被初始化了的String域,
 * 以及另一个通过构造器初始化的String域, 这两种方式有何差异?
 *
 * 在构造器初始化之前会被付默认值
 */
public class Test2 {
    String s1 = "str1";
    String s2;
    String s3 = s2;
    public Test2() {
    }

    public Test2(String s) {
        this.s2 = s;
    }

    public static void main(String[] args) {
        Test2 t = new Test2("a");
        System.out.println("s1==>"+t.s1);
        System.out.println("s2==>"+t.s2);
        System.out.println("s3==>"+t.s3);
        //定义时初始化了的string域，在实例化时被赋值一次
        //通过构造器初始化的string域，在实例化时被赋值两次 先是null 后是a
    }
}