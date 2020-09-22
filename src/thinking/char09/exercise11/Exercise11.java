package thinking.char09.exercise11;

/**
 * @author sgc
 * @create 2020/8/3
 * 创建一个类，它有一个方法用于接受一个String类型的参数，生成的结果是将该参数中每一对字符进行互换。
 * 对该类进行适配，使得它可以用于interfaceprocessor.Apply.process()。
 */
public class Exercise11 {
    public static void main(String[] args) {
        Apply.process(new StringProcessor(), new String("abc"));
    }
}

interface Processor {
    String name();
    Object process(Object input);
}

class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor" + p.name());
        System.out.println(p.process(s));
    }
}

class StringProcessor implements Processor {

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public String process(Object input) {
        return new StringBuffer((String)input).reverse().toString();
    }
}