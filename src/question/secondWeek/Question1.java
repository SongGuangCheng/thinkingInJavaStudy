package question.secondWeek;
/**
@author sgc
@version 2020年8月16日 上午10:57:40
@Description 
 **/
public class Question1 {
    public static void main(String[] args) {

        System.out.println(new Question1().get().name);

    }

    public Person get(){
    	//int i = 0;
        Person p = new Person("222");
        System.out.println(p.name);
        try{
            return p;
        }catch (Exception e){
            return p;
        }finally {
            p.name = "555";
            p = new Person("111");
        }
        
    }
}

class Person{
	String name;
	public Person(String name) {
		this.name = name;
	}
}