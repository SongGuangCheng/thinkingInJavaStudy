package thinking.char09.exercise3;

/**
 * @author sgc
 * @create 2020/8/3
 * 抽象类中可以调用抽象方法，因为调用时一定是有导出类实现，故直接用导出类重写的方法。
 * 且最开始未初始化完全时为默认值。
 *
 */
public class Exercise3 {
    public static void main(String[] args) {
        Son son = new Son();
        son.print();
    }
}

abstract class Father{
    Father(){
        print();
    }
    abstract void print();
}

class Son extends Father{
    int i = 1;

    @Override
    void print() {
        System.out.println("son.print()---"+i);
    }
}