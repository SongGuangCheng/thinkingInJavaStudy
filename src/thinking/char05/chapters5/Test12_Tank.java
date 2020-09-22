package thinking.char05.chapters5;

public class Test12_Tank {
    boolean isNull;

    public Test12_Tank(boolean b){
        this.isNull = b;
    }

    protected void finalize(){
        if(isNull){
            System.out.println("finalize()已执行");
        }else {
            System.out.println("Error：tank是满的");
        }

    }

    public static void main(String[] args) {
        //Test12_Tank t = new Test12_Tank(false); 强引用在任何情况下都不会gc回收
        System.out.println("---------notNull---------");
        new Test12_Tank(false);
        System.gc();
        System.out.println("---------null---------");
        new Test12_Tank(true);
        System.gc();
    }
}
