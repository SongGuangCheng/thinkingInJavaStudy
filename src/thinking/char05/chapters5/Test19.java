package thinking.char05.chapters5;

public class Test19 {
    Test19(String... strings){
        for(String s: strings){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Test19 t1 = new Test19("小明","男","18");
        Test19 t2 = new Test19(new String[]{"小刚","男","15"});
    }
}
