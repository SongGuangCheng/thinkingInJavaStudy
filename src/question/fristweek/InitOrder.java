package question.fristweek;

/**
 * @author sgc
 * @create 2020/8/7
 * 初始化顺序
 */
public class InitOrder {
    public static void main(String[] args) {
        Father f = new Son();
    }
}

class Father{
    static String ss = "父类静态变量";
    static{
        System.out.println("父类静态代码块");
        //System.out.println("父类静态变量的值==》"+ss);

    }
    String s = "父类成员变量";
    {
        System.out.println("父类非静态代码块");
        //System.out.println("父类非静态变量的值==》"+s);
    }
    Father(){
        System.out.println("父类构造方法");
    }
}

class Son extends Father {
    static String ss1 = "子类静态常量";
    static{
        System.out.println("子类静态代码块");
    }
    String s1 = "子类成员变量";
    {
        System.out.println("子类非静态代码块");
    }
    Son(){
        System.out.println("子类构造方法");
    }
}


