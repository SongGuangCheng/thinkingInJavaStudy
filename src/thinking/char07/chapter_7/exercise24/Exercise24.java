package thinking.char07.chapter_7.exercise24;

/**
 * @author sgc
 * @create 2020/8/2
 * 执行顺序
 * 父类静态变量、静态代码块
 * 子类静态变量、静态代码块
 * 父类成员变量、非静态代码块
 * 父类构造方法
 * 子类成员变量、非静态代码块
 * 子类构造方法
 */
public class Exercise24 extends Beetle {
    private int k = printInit("Exercise24.k initialized");
    public Exercise24() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 =
            printInit("static Exercise24.x2 initialized");
    public static void main(String[] args) {
        System.out.println("Exercise24 constructor");
        Exercise24 e = new Exercise24();
    }
}


class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 =
            printInit("static Insect.x1 initialized");
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");
    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 =
            printInit("static Beetle.x2 initialized");
    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
    }
}