package thinking.char18.socketAndThread;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author sgc
 * @create 2020/9/6
 */
public class Receive implements Runnable {
    private int port;
    private String desc;
    public Receive(int port,String desc) {
        this.port = port;
        this.desc = desc;
    }

    @Override
    public void run() {
        try (  //1.创建服务器
               ServerSocket serverSocket = new ServerSocket(port);
               //2.监听客户端连接 等待客户端连接过来
               Socket socket = serverSocket.accept();//阻塞式监听 一直等待客户端连接
               //3.获取输入流
               InputStream is = socket.getInputStream();
               BufferedInputStream bis = new BufferedInputStream(is);
               //4.文件输出
               FileOutputStream fos = new FileOutputStream(new File(desc));
               BufferedOutputStream bos = new BufferedOutputStream(fos);){
            while (true){
                byte[] buffer = new byte[1024];
                int len = -1;
                while ((len=bis.read(buffer))!=-1){
                    bos.write(buffer,0,len);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

