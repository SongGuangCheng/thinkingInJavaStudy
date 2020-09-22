package thinking.char09.exercise18;

/**
 * @author sgc
 * @create 2020/8/4
 */
public class Exercise18 {
    public static void useFactory(Factory factory){
        Cycle cycle = factory.getCycle();
        cycle.f();
    }

    public static void main(String[] args) {
        useFactory(new UnicycleFactory());
        useFactory(new BicycleFactory());
        useFactory(new TricycleFactory());
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
}
class UnicycleFactory implements Factory{
    public Cycle getCycle(){
        return new Unicycle();
    }
}

class Bicycle implements Cycle{
    public void f(){
        System.out.println("Bicycle.f()");
    }
}
class BicycleFactory implements Factory{
    public Cycle getCycle(){
        return new Bicycle();
    }
}

class Tricycle implements Cycle{
    public void f(){
        System.out.println("Tricycle.f()");
    }
}
class TricycleFactory implements Factory{
    public Cycle getCycle(){
        return new Tricycle();
    }
}