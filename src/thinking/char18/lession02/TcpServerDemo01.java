package thinking.char18.lession02;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author sgc
 * @create 2020/9/6
 * 服务端
 */
public class TcpServerDemo01 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is =null;
        try {
            //1.我得有一个地址
            serverSocket = new ServerSocket(9999);
            //2.等待客户端连接过来
            socket = serverSocket.accept();
            //3.读取数据
            is = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len=is.read(buffer))!=-1){
                String msg = new String(buffer,0,len);
                System.out.println(msg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
                socket.close();
                serverSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
