package thinking.char18.lession02;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author sgc
 * @create 2020/9/6
 */
public class TcpClientDemo02 {
    public static void main(String[] args) throws UnknownHostException {
        //1.要知道服务器的地址端口号
        InetAddress ipAddress = InetAddress.getByName("127.0.0.1") ;
        int port = 9999;
        try (
                //2.创建一个socket连接
                Socket socket = new Socket(ipAddress, port);
                //3.发送消息 io流
                OutputStream os = socket.getOutputStream();
                BufferedOutputStream bos = new BufferedOutputStream(os);
                ){
            bos.write("你好 服务端".getBytes());
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

