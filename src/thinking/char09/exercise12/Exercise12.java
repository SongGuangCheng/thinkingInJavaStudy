package thinking.char09.exercise12;

/**
 * @author sgc
 * @create 2020/8/4
 */
public class Exercise12 {
    public static void t(CanFight x){x.fight();};
    public static void u(CanFly x){x.fly();};
    public static void v(CanSwim x){x.swim();};
    public static void w(ActionCharacter x){x.fight();};
    public static void x(CanClimb x){x.climb();};

    public static void main(String[] args) {
       Hero hero = new Hero();
       t(hero);
       u(hero);
       v(hero);
       w(hero);
       x(hero);
    }
}
interface CanClimb{
    void climb();
}

interface CanFight{
    void fight();
}

interface CanSwim{
    void swim();
}

interface CanFly{
    void fly();
}

class ActionCharacter{
    public void fight(){}
}

class Hero extends ActionCharacter implements CanFight,CanFly,CanSwim,CanClimb{

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void climb() {

    }
}