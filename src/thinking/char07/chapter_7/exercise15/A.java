package thinking.char07.chapter_7.exercise15;

public class A {
    protected void sayHello(){
        System.out.println("hello world");
    }
}

class B extends A{
    public static void main(String[] args) {
        new B().sayHello();
    }
}
