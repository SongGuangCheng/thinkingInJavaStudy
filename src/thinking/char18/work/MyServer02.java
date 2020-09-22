package thinking.char18.work;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;


/**
 * @author sgc
 * @create 2020/9/6
 */
public class MyServer02 {
    public static void main(String[] args) throws Exception {
         //接收上传文件
        //acceptFile(9090,"idea_bg.jpg");
        //接收压缩文件
        //acceptFile(9090,"InetStudy/accept/2Pro.zip");
        acceptFile(9090);
    }
    /**
     *
     * @param port
     * 用截取的时间表示 接收文件路径
     */
    public static void acceptFile(int port) throws Exception {
        //1.创建服务器
        ServerSocket serverSocket = new ServerSocket(port);
        while (true){
            //2.监听客户端连接 等待客户端连接过来 当有新的连接时就创建一个线程进行接收
            Socket socket = serverSocket.accept();//阻塞式监听 一直等待客户端连接
            String path = UUID.randomUUID().toString().replace("-","");
            new Thread(()->{
                try (
                        //3.获取输入流
                        InputStream is = socket.getInputStream();
                        BufferedInputStream bis = new BufferedInputStream(is);
                        //4.文件输出
                        FileOutputStream fos = new FileOutputStream(new File(path));
                        BufferedOutputStream bos = new BufferedOutputStream(fos);
                ){
                    byte[] buffer = new byte[1024];
                    int len = -1;
                    while ((len=bis.read(buffer))!=-1){
                        bos.write(buffer,0,len);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //md5校验
                try {
                    System.out.println(Md5Utils.getFileMd5(path));
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
            }).start();

        }

    }
}
