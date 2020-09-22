package thinking.char09.exercise1;

/**
 * @author sgc
 * @create 2020/8/3
 */
public class Exercise1 {
    public static void main(String[] args) {
        Rodent[] rodents = {new Mouse(), new Gerbil(), new Hamster()};
        for (Rodent rodent : rodents){
            rodent.say();
        }
    }
}

abstract class Rodent{
    abstract void say();
}

class Mouse extends Rodent{
    void say(){
        System.out.println("我是老鼠");
    }
}

class Gerbil extends Rodent{
    void say(){
        System.out.println("我是鼹鼠");
    }
}

class Hamster extends Rodent{
    void say(){
        System.out.println("我是大颊鼠");
    }
}