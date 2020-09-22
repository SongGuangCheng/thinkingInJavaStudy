package thinking.char07.chapter_7;

/**
 * 惰性初始化 就是先创建引用 等用该对象的时候在进行初始化
 */
public class Exercise1 {
    public static void main(String[] args) {
        Person person;
        person = new Person();
    }
}

class Person{

}
