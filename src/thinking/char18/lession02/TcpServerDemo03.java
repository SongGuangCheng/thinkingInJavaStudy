package thinking.char18.lession02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author sgc
 * @create 2020/9/6
 * 上传文件服务端
 */
public class TcpServerDemo03 {
    public static void main(String[] args) {
        try (
                //1.创建服务器
                ServerSocket serverSocket = new ServerSocket(9000);
                //2.监听客户端连接 等待客户端连接过来
                Socket socket = serverSocket.accept();//阻塞式监听 一直等待客户端连接
                //3.获取输入流
                InputStream is = socket.getInputStream();
                BufferedInputStream bis = new BufferedInputStream(is);
                //4.文件输出
                FileOutputStream fos = new FileOutputStream(new File("receive.jpg"));
                BufferedOutputStream bos = new BufferedOutputStream(fos);
        ){
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len=bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
