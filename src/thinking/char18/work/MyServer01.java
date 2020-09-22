package thinking.char18.work;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * @author sgc
 * @create 2020/9/6
 */
public class MyServer01{
    public static void main(String[] args) throws Exception {
         //接收上传文件
        //acceptFile(9090,"idea_bg.jpg");
        //接收压缩文件
        acceptFile(9090,"InetStudy/accept/2Pro.zip");
    }
    /**
     *
     * @param port
     * @param desc 接收文件路径
     */
    public static void acceptFile(int port,String desc) throws Exception {
        try (
                //1.创建服务器
                ServerSocket serverSocket = new ServerSocket(port);
                //2.监听客户端连接 等待客户端连接过来
                Socket socket = serverSocket.accept();//阻塞式监听 一直等待客户端连接
                //3.获取输入流
                InputStream is = socket.getInputStream();
                BufferedInputStream bis = new BufferedInputStream(is);
                //4.文件输出
                FileOutputStream fos = new FileOutputStream(new File(desc));
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
        System.out.println(Md5Utils.getFileMd5(desc));
    }
}
