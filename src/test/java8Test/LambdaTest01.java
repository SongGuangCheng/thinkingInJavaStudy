package test.java8Test;


import org.omg.Messaging.SyncScopeHelper;

import java.util.Collections;

/**
 * @author sgc
 * @create 2020/9/7
 * Lambda表达式
 *  使用 Lambda 表达式需要注意以下两点：
 *     Lambda 表达式主要用来定义行内执行的方法类型接口，例如，一个简单方法接口。
 *          在下面例子中，我们使用各种类型的Lambda表达式来定义MathOperation接口的方法。然后我们定义了sayMessage的执行。
 *     Lambda 表达式免去了使用匿名方法的麻烦，并且给予Java简单但是强大的函数化的编程能力。
 */
public class LambdaTest01 {
    final static String salutation = "Hello! ";
    public static void main(String[] args) {
        LambdaTest01 lamdbaTest01 = new LambdaTest01();
        //类型声明
        MathOperation add = (int a,int b)->a+b;

        //不用类型声明
        MathOperation sub = (a,b)->a-b;

        //大括号中的返回语句
        MathOperation mul = (int a,int b)->{return a*b;};

        //没有大括号和return语句的表达式
        MathOperation div = (int a,int b) ->a / b;

        //没有类型声明的表达式
        GreetingService printInfo = Info -> System.out.println(Info);

        printInfo.sayMessage("1+2="+lamdbaTest01.operate(1,2,add));
        printInfo.sayMessage("5-2="+lamdbaTest01.operate(5,2,sub));
        printInfo.sayMessage("4*2="+lamdbaTest01.operate(4,2,mul));
        printInfo.sayMessage("8/2="+lamdbaTest01.operate(8,2,div));

        GreetingService greetService1 = message ->
                System.out.println(salutation + message);
        greetService1.sayMessage("Runoob");

        final int a = 2;
        Converter addInt = (num) -> System.out.println(a+num);
        addInt.convert(18);


    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }

    public interface Converter<T1, T2> {
        void convert(int i);
    }
}
