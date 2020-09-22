package thinking.char09.exercise7;

/**
 * @author sgc
 * @create 2020/8/3
 */
public class Exercise7  {
    public static void main(String[] args) {
    Rodent[] rodents = {new Mouse(), new Gerbil(), new Hamster()};
    for (Rodent rodent : rodents){
        rodent.say();
    }
}
}

interface Rodent{
    void say();
}

class Mouse implements Rodent {
    @Override
    public void say(){
        System.out.println("我是老鼠");
    }
}

class Gerbil implements Rodent {
    public void say(){
        System.out.println("我是鼹鼠");
    }
}

class Hamster implements Rodent {
    public void say(){
        System.out.println("我是大颊鼠");
    }
}
