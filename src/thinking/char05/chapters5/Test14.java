package thinking.char05.chapters5;

import java.net.SocketTimeoutException;

public class Test14 {
    static String s1 = "aaa";
    static String s2;
    static { //静态初始化
        s2 = "bbb";
    }

    static void printValue(){
        System.out.println("s1==>"+s1);
        System.out.println("s2==>"+s2);
    }

    public static void main(String[] args) {
        printValue();
        s1 = "111";
        s2 = "222";
        System.out.println("------------使用后--------------");
        printValue();
    }
}
