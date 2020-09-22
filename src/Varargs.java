public class Varargs {
    static void printArray(Object[] args){
        for(Object o :args){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        printArray(new Object[]{new Integer(11),
        new Float(3.14),new Double(3.33)
        });
        printArray(new Object[]{"aaa","bbb","ccc"});
        printArray(new Object[]{new A(),new A()});
    }
}

class A{

}