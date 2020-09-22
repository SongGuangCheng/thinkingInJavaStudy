package thinking.char05.chapters5;

public class Test5_Dog {

    public void bark(int i){
        System.out.println("barking");
    }

    public void bark(String s){
        System.out.println("howling");
    }

    public static void main(String[] args) {
        Test5_Dog dog = new Test5_Dog();
        dog.bark(1);
        dog.bark("1");

    }
}
