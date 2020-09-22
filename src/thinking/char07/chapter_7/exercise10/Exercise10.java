package thinking.char07.chapter_7.exercise10;

public class Exercise10{
    public static void main(String[] args) {
        new Root(11111);
        System.out.println("------------");
        new Stem(22222);
    }
}

class Root {
    Component1 com1 = new Component1(1);
    Component2 com2 = new Component2(2);
    Component3 com3 = new Component3(3);

    public Root(int i){
        System.out.println("Root"+i);
    }

}

class Stem extends Root {
    Component1 com1 = new Component1(11);
    Component2 com2 = new Component2(22);
    Component3 com3 = new Component3(33);

    public Stem(int i){
        super(111);
        System.out.println("Stem"+i);
    }

}

class Component1{
    public Component1(int i){
        System.out.println("Component1"+i);
    }
}
class Component2{
    public Component2(int i){
        System.out.println("Component2"+i);
    }
}
class Component3{
    public Component3(int i){
        System.out.println("Component3"+i);
    }
}


