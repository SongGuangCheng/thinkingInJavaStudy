package thinking.char07.chapter_7.exercise9;

public class Exercise9{
    public static void main(String[] args) {
        new Root();
        System.out.println("------------");
        new Stem();
    }
}

class Root {
    Component1 com1 = new Component1();
    Component2 com2 = new Component2();
    Component3 com3 = new Component3();

    public Root(){
        System.out.println("Root");
    }

}

class Stem extends Root{
    Component1 com1 = new Component1();
    Component2 com2 = new Component2();
    Component3 com3 = new Component3();

    public Stem(){
        System.out.println("Stem");
    }

}

class Component1{
    public Component1(){
        System.out.println("Component1");
    }
}
class Component2{
    public Component2(){
        System.out.println("Component2");
    }
}
class Component3{
    public Component3(){
        System.out.println("Component3");
    }
}

