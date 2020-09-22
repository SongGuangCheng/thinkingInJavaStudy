package thinking.char10.exercise23;


/**
 * @author sgc
 * @create 2020/8/8
 */
public class Exercise23 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(2);
        for(int i = 0;i<2;i++){
            b.getUIntoArray(a.getU());
        }
        b.g();
        b.setNull(1);
        System.out.println("将1设为null");
        b.g();
    }
}

interface U{
    void f1();
    void f2();
    void f3();
}

class A{
    public U getU(){
        return new U() {
            @Override
            public void f1() {
                System.out.println("f1()");
            }

            @Override
            public void f2() {
                System.out.println("f2()");
            }

            @Override
            public void f3() {
                System.out.println("f3()");
            }
        };
    }
}

class B{
    U[] us;
    int i = 0;
    public B(int size){
        us = new U[size];
    }
    public void getUIntoArray(U u){
        if(i<us.length){
            us[i] = u;
            i++;
        }

    }
    public void setNull(int index){
        if(index>=0&&index<us.length){
            us[index] = null;
        }

    }
    public void g(){
        for(U u:us){
            u.f1();
            u.f2();
            u.f3();
            System.out.println("----------------------");
        }
    }
}
