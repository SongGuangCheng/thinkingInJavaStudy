package thinking.char18.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * @author sgc
 * @create 2020/9/6
 * udp聊天
 */
public class UdpClientDemo02 {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(8888);){
            //准备数据 控制台读取
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true){
                String data = reader.readLine();
                byte[] dates = data.getBytes();
                DatagramPacket packet = new DatagramPacket(dates,0,dates.length,
                        new InetSocketAddress("127.0.0.1",8889));
                socket.send(packet);
                if ("exit".equals(data)){
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
