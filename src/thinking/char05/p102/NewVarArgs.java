package thinking.char05.p102;

public class NewVarArgs {
    static void printArray(Object... args){
        for(Object o:args){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        printArray(3.11f,52,"asd");
        printArray(new A(),new A());
        printArray(new Integer[]{1,23,4,2});
        printArray();
    }
}

class A{}