package test.java8Test;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @author sgc
 * @create 2020/9/7
 * 一、stream的三步操作
 * 1.创建stream
 *
 * 2.中间操作
 *
 * 3.终止操作
 */
public class TestStreamApi01 {
    //创建stream

    public static void main(String args[]){
        //1.可以通过collection系列结合提供的stream和parallelStream()
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        //2.通过Arrays中的静态方法 stream获得数组流
        Employee[] employees = new Employee[10];
        Stream<Employee> stream2 = Arrays.stream(employees);

        //3.通过Stream类中的静态方法 of()获得流
        Stream<String> stream3 = Stream.of("aa","bb","cc");

        //4.创建无限流
        //迭代
        Stream<Integer> stream4 = Stream.iterate(0,x->x+2);
        //stream4.limit(10).forEach(System.out::println);
        //生成
        Stream.generate(()->Math.random()).limit(5).forEach(System.out::println);
    }
}
