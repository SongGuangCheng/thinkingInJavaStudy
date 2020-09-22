package thinking.char05.chapters5;



public class Test22 {
    Money money;
    Test22(Money money){
        this.money = money;
    }

    public static void main(String[] args) {
       Test22 t1 = new Test22(Money.FIVE),
              t2 = new Test22(Money.HUNDRED);
       t1.describe();
       t2.describe();

    }

    public void describe(){
        switch (money){
            case ONE:
                System.out.println("一块钱");
                break;
            case TWO:
                System.out.println("两块钱");
                break;
            case FIVE:
                System.out.println("五块钱");
                break;
            case TEN:
                System.out.println("十块钱");
                break;
            case FIFTY:
                System.out.println("五十块钱");
                break;
            case HUNDRED:
                System.out.println("一百块钱");
                break;
            default:
                System.out.println("输入错误");

        }
    }
}

