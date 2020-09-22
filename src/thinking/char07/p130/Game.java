package thinking.char07.p130;


/**
 * 如果没有默认的基类构造器 或者想调用一个带参数的基类构造器
 * 就必须在子类的构造器中显示的用super（参数）来调用 切必须写在第一行
 */
class Game {
    Game(int i){
        System.out.println("Game Constructor");
    }
}

class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        System.out.println("BoardGame Constructor");
    }
}

class Chess extends BoardGame{
    Chess(){
        super(11);
        System.out.println("Chess Constructor");
    }

    public static void main(String[] args) {
        Chess chess = new Chess();
    }
}
