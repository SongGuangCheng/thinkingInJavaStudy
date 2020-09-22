package thinking.char07.chapter_7.exercise14;



public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door
        left = new Door(),
        right = new Door();
    public Car(){
        for(int i= 0;i<4;i++){
            wheel[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.windows.rollup();
        car.wheel[0].inflate(72);
        car.engine.service();
    }
}

class Engine{
    public void start(){}
    public void rev(){}
    public void stop(){}
    public void service(){
        System.out.println("service()");
    }
}

class Wheel{
    public void inflate(int ps){};
}

class Windows{
    public void rollup(){};
    public void rolldown(){};
}

class Door{
    public Windows windows = new Windows();
    public void open(){};
    public void close(){};
}

