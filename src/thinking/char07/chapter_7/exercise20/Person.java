package thinking.char07.chapter_7.exercise20;

public class Person {
    final void f(){
        System.out.println("Person.f()");
    }

    private final void g(){
        System.out.println("Person.g()");
    }
}

class Man extends Person{
   /* 如果被定义为private类型 则会被隐式的定义为final类型 无法被重写
   @Override
    private final void f(){
        System.out.println("Man.f()");
    }*/
    //使用@Override避免混淆
    private final  void g(){
        System.out.println("Man.g()");
    }
}


class Exercise20{
    public static void main(String[] args) {
        Man man = new Man();
        man.f();
        //混淆编译器不知道改用那个g（）方法   man.g();
    }
}