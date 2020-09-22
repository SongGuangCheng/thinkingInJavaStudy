package thinking.char09.p187;


/**
 * @author sgc
 * @create 2020/8/4
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory factory){
        Service s = factory.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new ServiceFactory1Impl());
        serviceConsumer(new ServiceFactory2Impl());
    }
}

interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Service1Impl implements Service{

    @Override
    public void method1() {
        System.out.println("Service1.method1()");
    }

    @Override
    public void method2() {
        System.out.println("Service1.method2()");
    }
}

class ServiceFactory1Impl implements ServiceFactory{
    @Override
    public Service getService() {
        return new Service1Impl();
    }
}

class Service2Impl implements Service{

    @Override
    public void method1() {
        System.out.println("Service2.method1()");
    }

    @Override
    public void method2() {
        System.out.println("Service2.method2()");
    }
}

class ServiceFactory2Impl implements ServiceFactory{
    @Override
    public Service getService() {
        return new Service2Impl();
    }
}




