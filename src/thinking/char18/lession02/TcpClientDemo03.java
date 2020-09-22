package thinking.char18.lession02;


import java.awt.datatransfer.FlavorEvent;
import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @author sgc
 * @create 2020/9/6
 * 上传文件 客户端
 */
public class TcpClientDemo03 {
    public static void main(String[] args) {

        try(
                //1.创建一个socket连接
                Socket socket = new Socket(InetAddress.getLocalHost(),9000);
                //2.创建一个输出流
                OutputStream os = socket.getOutputStream();
                BufferedOutputStream bos = new BufferedOutputStream(os);
                //3.读取文件
                FileInputStream fis = new FileInputStream(new File("D:/ioTest/cool.jpg"));
                BufferedInputStream bis = new BufferedInputStream(fis);
        ){
            //4.写出文件
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len=bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
