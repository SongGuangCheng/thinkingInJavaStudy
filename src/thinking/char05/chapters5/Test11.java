package thinking.char05.chapters5;

public class Test11 {
    protected void finalize(){
        System.out.println("执行了finalize方法");
    }

    public static void main(String[] args) {
        new Test11();
        System.gc();
    }
}