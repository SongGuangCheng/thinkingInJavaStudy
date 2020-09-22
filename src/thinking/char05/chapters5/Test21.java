package thinking.char05.chapters5;

public class Test21 {

    public static void main(String[] args) {
        for ( Money money:Money.values()){
            System.out.println(money + "==>" + money.ordinal());
        }
    }
}

enum Money{
    ONE,TWO,FIVE,TEN,FIFTY,HUNDRED
}
