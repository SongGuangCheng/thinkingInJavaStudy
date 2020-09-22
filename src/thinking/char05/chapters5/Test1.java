package thinking.char05.chapters5;

/**
 * 1.创建一个类, 它包含一个未初始化的String引用。验证该引用被Java初始化成了null
 */
public class Test1 {
    private static String s;

    public static void main(String[] args) {
        System.out.println(s);
    }
}
