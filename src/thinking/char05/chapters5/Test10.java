package thinking.char05.chapters5;

public class Test10 {
    protected void finalize(){
        System.out.println("执行了finalize方法");
        //该方法不一定执行
    }

    public static void main(String[] args) {
        new Test10();
    }
}
