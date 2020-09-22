package thinking.char18.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * @author sgc
 * @create 2020/9/6
 * 多线程聊天
 */
public class TackSend implements Runnable{
    private String toIp;
    private int toPort;
    private int fromPort;

    public TackSend(String toIp, int toPort, int fromPort) {
        this.toIp = toIp;
        this.toPort = toPort;
        this.fromPort = fromPort;
    }

    @Override
    public void run() {
        try (DatagramSocket socket = new DatagramSocket(fromPort);){
            //准备数据 控制台读取
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true){
                String data = reader.readLine();
                byte[] dates = data.getBytes();
                DatagramPacket packet = new DatagramPacket(dates,0,dates.length,
                        new InetSocketAddress(toIp,toPort));
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
