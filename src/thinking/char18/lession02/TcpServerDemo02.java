package thinking.char18.lession02;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author sgc
 * @create 2020/9/6
 * 优化服务端
 */
public class TcpServerDemo02 {
    public static void main(String[] args) {

        try (
                //1.我得有一个地址
                ServerSocket serverSocket = new ServerSocket(9999);
                //2.等待客户端连接过来
                Socket socket = serverSocket.accept();
                //3.读取数据
                InputStream is = socket.getInputStream();
                BufferedInputStream bis = new BufferedInputStream(is);
                ){
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len=bis.read(buffer))!=-1){
                String msg = new String(buffer,0,len);
                System.out.println(msg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

