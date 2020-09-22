package thinking.char07.chapter_7.exercise5;

public class A {
    A(){
        System.out.println("AAAAAAAAAAAAAAAAA");
    }
}

class B{
    B(){
        System.out.println("BBBBBBBBBBBBBBBBB");
    }
}

class C extends A{
    B b = new B();

    public static void main(String[] args) {
        C c = new C();
    }
}