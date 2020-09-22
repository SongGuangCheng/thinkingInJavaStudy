package thinking.char10.exercise14;

/**
 * @author sgc
 * @create 2020/8/5
 */
public class HorrorShow {
    DangerousMonster getDangerousMonster(){
        return new DangerousMonster(){

            @Override
            public void destroy() {
                System.out.println("DangerousMonster.destroy()");
            }

            @Override
            public void menace() {
                System.out.println("DangerousMonster.menace()");
            }
        };
    }

    Vampire getVampire(){
        return new Vampire(){

            @Override
            public void drinkBlood() {

            }

            @Override
            public void kill() {
                System.out.println("double kill");
            }

            @Override
            public void destroy() {

            }

            @Override
            public void menace() {

            }
        };
    }
    public static void main(String[] args) {
        HorrorShow h = new HorrorShow();
        DangerousMonster d = h.getDangerousMonster();
        d.destroy();
        d.menace();
        h.getVampire().kill();
    }
}

interface Monster{
    void menace();
}

interface DangerousMonster extends Monster{
    void destroy();
}

interface Lethal{
    void kill();
}

interface Vampire extends DangerousMonster,Lethal{
    void drinkBlood();
}
