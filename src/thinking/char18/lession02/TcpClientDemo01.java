package thinking.char18.lession02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author sgc
 * @create 2020/9/6
 * 客户端
 */
public class TcpClientDemo01 {
    public static void main(String[] args) {
        InetAddress ipAddress = null;
        Socket socket = null;
        OutputStream os = null;
        try {
            //1.要知道服务器的地址端口号
            ipAddress = InetAddress.getByName("127.0.0.1");
            int port = 9999;
            //2.创建一个socket连接
            socket = new Socket(ipAddress,port);
            //3.发送消息 io流
            os = socket.getOutputStream();
            os.write("客户端向服务端发送数据".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
