package thinking.char18.lession03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author sgc
 * @create 2020/9/6
 * 不需要连接服务器
 */
public class UdpClientDemo01 {
    public static void main(String[] args) {
        try (
                //1.建立一个socket
                DatagramSocket socket = new DatagramSocket();
                ){
            //2.建个包
            byte[] msg = "你好啊，服务器".getBytes();
            InetAddress ipAddress = InetAddress.getByName("127.0.0.1");
            int port = 9090;
            //参数：数据 起始位置 要发送给谁
            DatagramPacket packet = new DatagramPacket(msg,0,msg.length,ipAddress,port);
            //3.发送包
            socket.send(packet);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
