package thinking.char21.concurrent;

import java.util.concurrent.PriorityBlockingQueue;

/**
@author sgc
@version 2020年9月1日 下午4:37:13
@Description 测试优先级阻塞队列 它具有阻塞 读 的操作
PriorityBlockingQueue存储的对象必须是实现Comparable接口的 
因为PriorityBlockingQueue队列会根据内部存储的每一个元素的compareTo方法比较每个元素的大小
这样在take出来的时候会根据优先级取出 
 **/
public class TestPriorityBlokckingQueue {
    public static PriorityBlockingQueue<User> queue = new PriorityBlockingQueue<User>();
    
    public static void main(String[] args) {
        queue.add(new User(1,"wu"));
        queue.add(new User(5,"wu5"));
        queue.add(new User(23,"wu23"));
        queue.add(new User(55,"wu55"));
        queue.add(new User(9,"wu9"));
        queue.add(new User(3,"wu3"));
        for (User user : queue) {
            try {
                System.out.println(queue.take().name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
 
    //静态内部类
    static class User implements Comparable<User>{
 
        public User(int age,String name) {
            this.age = age;
            this.name = name;
        }
 
        int age;
        String name;
 
        @Override
        public int compareTo(User o) {
            return this.age > o.age ? -1 : 1;
        }
    }
}
