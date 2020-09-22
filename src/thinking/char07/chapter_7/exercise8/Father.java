package thinking.char07.chapter_7.exercise8;

public class Father {
    Father(int i){
        System.out.println("father"+i);
    }
}

class Son extends Father{
    Son(String s){
        super(111);
        System.out.println("带参子类构造器");
    }

    Son(){
        super(222);
        System.out.println("默认子类构造器");
    }

    public static void main(String[] args) {
        new Son();
        new Son("hello");
    }
}