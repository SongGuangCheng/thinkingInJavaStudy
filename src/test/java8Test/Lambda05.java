package test.java8Test;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author sgc
 * @create 2020/9/7
 * java8 四大内置函数式接口
 * Consumer<T> 消费型接口
 *     void accept(T t);
 *
 * Supplier<T> 供给型接口
 *      T get();
 *
 * Function<T,R> 函数型接口
 *      R apply(T t);
 *
 * Predicate<T> 断言型接口
 *      boolean test<T t>
 */
public class Lambda05 {
    public static void main(String[] args) {
        //Consumer
        new Lambda05().happy(1000.00,m-> System.out.println("消费金额为"+m));
        //Supplier
        int i = new Lambda05().getNum(()->new Random(20).nextInt(20));
        System.out.println(i);
    }

    public void happy(double money, Consumer<Double> mon){
        mon.accept(money);
    }

    public int getNum(Supplier<Integer> supplier){
        return supplier.get();
    }
}
