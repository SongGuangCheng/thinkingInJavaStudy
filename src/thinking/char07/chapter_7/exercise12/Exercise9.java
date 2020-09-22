package thinking.char07.chapter_7.exercise12;

public class Exercise9{
    public static void main(String[] args) {
        Root root = new Root();
        Stem stem = new Stem();
        try {
            System.out.println("------------finally----------");
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            root.dispose();
            stem.dispose();
        }
    }
}

class Root {
    Component1 com1 = new Component1();
    Component2 com2 = new Component2();
    Component3 com3 = new Component3();

    public Root(){
        System.out.println("Root");
    }

    public void dispose(){
        com1.dispose();
        com2.dispose();
        com3.dispose();
        System.out.println("root dispose");
    }

}

class Stem extends Root {
    Component1 com1 = new Component1();
    Component2 com2 = new Component2();
    Component3 com3 = new Component3();

    public Stem(){
        System.out.println("Stem");
    }
    public void dispose(){
        com1.dispose();
        com2.dispose();
        com3.dispose();
        System.out.println("stem dispose");
        super.dispose();
    }
}

class Component1{
    public Component1(){
        System.out.println("Component1");
    }
    public void dispose(){
        System.out.println("Component1 dispose");
    }
}

class Component2{
    public Component2(){
        System.out.println("Component2");
    }
    public void dispose(){
        System.out.println("Component2 dispose");
    }
}

class Component3{
    public Component3(){
        System.out.println("Component3");
    }
    public void dispose(){
        System.out.println("Component3 dispose");
    }
}

