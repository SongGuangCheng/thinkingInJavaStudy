package thinking.char09.exercise19;

/**
 * @author sgc
 * @create 2020/8/4
 * 使用工厂方法来创建一个框架，它可以执行抛硬币和掷骰子功能。
 */
public class Exercise19 {
    public static void useFactory(GameFactory factory){
        Game game = factory.getGame();
        game.play();
    }

    public static void main(String[] args) {
        useFactory(new CoinFactory());
        useFactory(new DiceFactory());
    }
}

interface Game{
    void play();
}

interface GameFactory{
    Game getGame();
}

class PlayCoin implements Game{

    @Override
    public void play() {
        System.out.println("抛硬币");
    }
}
class CoinFactory implements GameFactory{

    @Override
    public Game getGame() {
        return new PlayCoin();
    }
}


class PlayDice implements Game{

    @Override
    public void play() {
        System.out.println("掷骰子");
    }
}
class DiceFactory implements GameFactory{

    @Override
    public Game getGame() {
        return new PlayDice();
    }
}
