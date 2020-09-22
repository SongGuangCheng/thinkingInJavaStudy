package thinking.char07.chapter_7.exercise13;

public class A {
    public void say(){
        System.out.println("hello no-args");
    }

    public void say(int i){
        System.out.println("hello int");
    }

    public void say(String s){
        System.out.println("hello string");
    }
}

class B extends A{
    public void say(float f){
        System.out.println("hello float");
    }

    public static void main(String[] args) {
        B b = new B();
        b.say();
        b.say(11);
        b.say("123");
        b.say(1.1f);
    }
}
