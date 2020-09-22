package thinking.char07.chapter_7.exercise7;

public class A {
    A(int i){
        System.out.println("A"+i);
    }
}

class B{
    B(int i){
        System.out.println("B"+i);
    }
}

class C extends A {
    B b;
    C(){
        super(1);
        b = new B(2);
    }


    public static void main(String[] args) {
         new C();
    }
}