package thinking.char07.p127;

public class Father {
    String s = "fatherClass";
    public String append(String s1){
        return s += s1;
    }

    public void f1(){
        append(" f1()");
    }

    public void f2(){
        append(" f2()");
    }

    public void f3(){
        append(" f3()");
    }

    public static void main(String[] args) {
        Father father = new Father();
        father.f1();
        father.f2();
        father.f3();
        System.out.println(father);
    }

    @Override
    public String toString() {
        return s;
    }
}
