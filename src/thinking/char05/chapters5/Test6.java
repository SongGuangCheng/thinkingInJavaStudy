package thinking.char05.chapters5;

public class Test6 {
    public void bark(int i,String s){
        System.out.println("barking");
    }

    public void bark(String s,int i){
        System.out.println("howling");
    }

    public static void main(String[] args) {
        Test6 dog = new Test6();
        dog.bark(1,"1");
        dog.bark("1",1);

    }
}
