package thinking.char18.moreClient;

/**
 * @author sgc
 * @create 2020/9/7
 */
public class mainTest {
    public static void main(String[] args) throws InterruptedException {
            for (int i = 0 ;i<5;i++){
                Thread.sleep(200);
                new Thread(()->{
                    try {
                        new TcpSend().send();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }).start();
            }
    }
}
