package thinking.char07.p127;

public class Son extends Father {
    @Override
    public void f1() {
        append(" son.f1()");
        super.f1();
    }

    public void f4() {
        append(" f4()");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.f1();
        son.f2();
        son.f3();
        son.f4();
        System.out.println(son);
        System.out.println("----------------");
        Father.main(args);
    }
}
