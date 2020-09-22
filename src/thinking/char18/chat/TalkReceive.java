package thinking.char18.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author sgc
 * @create 2020/9/6
 * 多线程聊天
 */
public class TalkReceive implements Runnable {
    private int port;
    private String msgFrom;
    public TalkReceive(int port,String msgFrom) {
        this.port = port;
        this.msgFrom = msgFrom;
    }

    @Override
    public void run() {
        try (DatagramSocket socket = new DatagramSocket(port);){
            while (true){
                //准备接收包裹
                byte[] container = new byte[1024];
                DatagramPacket packet = new DatagramPacket(container,0,container.length);
                socket.receive(packet);//阻塞式接收包裹
                //断开连接
                byte[] data = packet.getData();
                String receiveData = new String(data,0,data.length);
                System.out.println(msgFrom+":"+receiveData);
                if ("exit".equals(receiveData)){
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
