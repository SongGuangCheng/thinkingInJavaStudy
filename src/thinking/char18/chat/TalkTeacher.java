package thinking.char18.chat;

/**
 * @author sgc
 * @create 2020/9/6
 */
public class TalkTeacher {
    public static void main(String[] args) {
        new Thread(new TackSend("localhost",8888,5555)).start();
        new Thread(new TalkReceive(9999,"学生")).start();
    }
}
