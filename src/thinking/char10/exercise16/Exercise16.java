package thinking.char10.exercise16;

/**
 * @author sgc
 * @create 2020/8/5
 */
public class Exercise16 {
    public static void useFactory(Factory factory){
        Cycle cycle = factory.getCycle();
        cycle.f();
    }

    public static void main(String[] args) {
        useFactory(Unicycle.factory);
        useFactory(Bicycle.factory);
        useFactory(new Tricycle().factory());
    }
}

interface Cycle{
    void f();
}
interface Factory{
    Cycle getCycle();
}

class Unicycle implements Cycle{
    public void f(){
        System.out.println("Unicycle.f()");
    }
    public static Factory factory = new Factory() {
        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    };
}


class Bicycle implements Cycle{
    public void f(){
        System.out.println("Bicycle.f()");
    }
    public static Factory factory = new Factory() {
        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    };
}

class Tricycle implements Cycle{
    public void f(){
        System.out.println("Tricycle.f()");
    }


    public Factory factory() {
        return new Factory() {
            @Override
            public Cycle getCycle() {
                return new Tricycle();
            }
        };
    }
}

