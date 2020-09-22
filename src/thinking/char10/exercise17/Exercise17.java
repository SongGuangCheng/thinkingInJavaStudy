package thinking.char10.exercise17;

/**
 * @author sgc
 * @create 2020/8/5
 */
public class Exercise17 {
    public static void useFactory(GameFactory factory){
        Game game = factory.getGame();
        game.play();
    }

    public static void main(String[] args) {
        useFactory(PlayCoin.factory);
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
    public static GameFactory factory = new GameFactory(){
        @Override
        public Game getGame() {
            return new PlayCoin();
        }
    };
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

