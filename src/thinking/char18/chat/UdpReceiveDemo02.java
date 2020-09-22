package thinking.char18.chat;

import java.io.StringWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


/**
 * @author sgc
 * @create 2020/9/6
 */
public class UdpReceiveDemo02 {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(8889);){
           while (true){
               //准备接收包裹
               byte[] container = new byte[1024];
               DatagramPacket packet = new DatagramPacket(container,0,container.length);
               socket.receive(packet);//阻塞式接收包裹
               //断开连接
               byte[] data = packet.getData();
               String receiveData = new String(data,0,data.length);
               System.out.println(receiveData);
               if ("exit".equals(receiveData)){
                   break;
               }
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
