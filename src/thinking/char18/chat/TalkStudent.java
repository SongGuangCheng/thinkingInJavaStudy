package thinking.char18.chat;

/**
 * @author sgc
 * @create 2020/9/6
 */
public class TalkStudent {
    public static void main(String[] args) {
        new Thread(new TackSend("localhost",9999,7777)).start();
        new Thread(new TalkReceive(8888,"老师")).start();
    }
}
