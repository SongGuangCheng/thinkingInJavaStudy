package question.secondWeek;

/**
 * @author sgc
 * @create 2020/8/14
 */
public class Test1 {
    public static void main(String[] args) {

        System.out.println(new Test1().get().name);

    }

    public Person11 get(){
        Person11 p = new Person11("222");
        System.out.println(p.name);
        try{
            return p;
        }catch (Exception e){
            return p;
        }finally {
            p.name = "555";
            p = new Person11("111");

        }

    }
}


class Person11{
    String name;
    public Person11(String name){
        this.name = name;
    }

}
