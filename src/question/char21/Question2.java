package question.char21;

import org.omg.Messaging.SyncScopeHelper;

import java.io.IOException;

/**
 * @author sgc
 * @create 2020/9/2
 * 学习jstack命令，抓取线程状态并分析
 */
public class Question2 {
    public static void main(String[] args) throws IOException {
        new Thread(()->{
            System.out.println("新增");
        },"thread-new").start();

        new Thread(()->{
            System.out.println("阻塞");
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"thread-sleep").start();


    }
}
