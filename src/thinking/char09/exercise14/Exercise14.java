package thinking.char09.exercise14;

/**
 * @author sgc
 * @create 2020/8/4
 */
public class Exercise14 {
    public static void main(String[] args) {
        MyClass1 myClass1 = new MyClass1();
        myClass1.f1(myClass1);
        myClass1.f2(myClass1);
        myClass1.f3(myClass1);
        myClass1.f4(myClass1);

    }
}

interface MyInterface1{
    void a();
    void b();
}

interface MyInterface2{
    void c();
    void d();
}

interface MyInterface3 {
    void e();
    void f();
}

interface MyInterface4 extends MyInterface1,MyInterface2,MyInterface3{
    void g();
}

class MyClass{
    private int i = 1;
    public void setI(int i){
        this.i = i;
    }
}

class MyClass1 extends MyClass implements MyInterface4{
    void f1(MyInterface1 x){ x.a();};
    void f2(MyInterface2 x){ x.c();};
    void f3(MyInterface3 x){ x.e();};
    void f4(MyInterface4 x){ x.g();};
    @Override
    public void a() {
        System.out.println("MyClass1.a()");
    }

    @Override
    public void b() {
        System.out.println("MyClass1.b()");
    }

    @Override
    public void c() {
        System.out.println("MyClass1.c()");
    }

    @Override
    public void d() {
        System.out.println("MyClass1.d()");
    }

    @Override
    public void e() {
        System.out.println("MyClass1.e()");
    }

    @Override
    public void f() {
        System.out.println("MyClass1.f()");
    }

    @Override
    public void g() {
        System.out.println("MyClass1.g()");
    }
}