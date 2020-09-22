package thinking.char18.lession03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author sgc
 * @create 2020/9/6
 * 接收端 udp不需要服务器
 * 还是要等待客户端的连接
 */
public class UdpReceiveDemo01 {
    public static void main(String[] args) {
        try (
                //1.开放端口
                DatagramSocket socket = new DatagramSocket(9090);
                ){
            //2.接收数据包
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);
            socket.receive(packet);//阻塞接收
            System.out.println(packet.getAddress().getHostAddress());
            System.out.println(new String(packet.getData(), 0, packet.getLength()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
