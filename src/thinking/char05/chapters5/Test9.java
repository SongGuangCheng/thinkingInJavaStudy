package thinking.char05.chapters5;

public class Test9 {
    Test9(int i){
        this("s");
        System.out.println("参数类型为int");
    }

    Test9(String s){
        System.out.println("参数类型为string");
    }

    public static void main(String[] args) {
        new Test9(1);
    }
}
