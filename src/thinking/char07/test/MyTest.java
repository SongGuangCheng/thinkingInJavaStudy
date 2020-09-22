package thinking.char07.test;

/**
 * @author sgc
 * @create 2020/8/3
 */
public class MyTest {
    private int age;
    private  String name;
    MyTest(int i,String name){
        this.age=i;
        this.name=name;
    }

//    @Override
//    public boolean equals(Object obj) {
//        boolean flag = false;
//        if(this.name.equals(name))
//            flag = true;
//        return flag;
//    }

    public static void main(String[] args) {
       MyTest m1 = new MyTest(2,"123"),
               m2 = new MyTest(1,"123");
        System.out.println(m1.name.equals(m2.name));
    }
}
