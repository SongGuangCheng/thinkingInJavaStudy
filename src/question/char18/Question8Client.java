package question.char18;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.security.NoSuchAlgorithmException;

/**
 * @author sgc
 * @create 2020/9/6 8）写一个文件服务器，支持文件上传下载、支持md5校验、支持传输压缩
 * 客户端
 */
public class Question8Client {
    public static void main(String[] args) throws Exception {
        //文件上传到服务器端
        //uploadFile(9090,"C:/Users/11388/Pictures/idea_bg.jpg");
        //文件下载
        //String url = "https://dss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2909143767,3737099215&fm=26&gp=0.jpg";
        //downloadFile(url,"InetStudy/download/1.jpg");
        //压缩传输
        //transferZip(9090,"D:/filedemo/demo1/2Pro.pdf","D:/filedemo/demo1/2Pro.zip");
        //多客户端传输
        for (int i=0;i<5;i++){
            new Thread(()->{
                uploadFile(9090,"C:/Users/11388/Pictures/idea_bg.jpg");
                //输出文件加密前md5
                try {
                    System.out.println(Md5Utils.getFileMd5("C:/Users/11388/Pictures/idea_bg.jpg"));
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
    //上传文件
    public static void uploadFile(int toPort, String src) {
        try (
                //1.创建一个socket连接
                Socket socket = new Socket(InetAddress.getLocalHost(), toPort);
                //2.创建一个输出流
                OutputStream os = socket.getOutputStream();
                BufferedOutputStream bos = new BufferedOutputStream(os);
                //3.读取文件
                FileInputStream fis = new FileInputStream(new File(src));
                BufferedInputStream bis = new BufferedInputStream(fis);
        ) {
            //4.写出文件
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //文件下载
    public static void downloadFile(String urlPath,String desc) throws IOException {
        //1.下载地址
        //"https://m801.music.126.net/20200906191226/83c8c9ce33e5a35416ebc647362cf694/jdyyaac/075a/025f/515b/00d6f142785522755094f197a2c224ac.m4a"
        URL url = new URL(urlPath);
        //2.连接到这个资源
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try(  InputStream inputStream = urlConnection.getInputStream();
              FileOutputStream fos = new FileOutputStream(desc);){//"D:/ioTest/music.m4a"
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len=inputStream.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        //断开连接
        urlConnection.disconnect();
    }

    //压缩传输
    public static void transferZip(int toPort,String src,String zipDest) throws NoSuchAlgorithmException {
        //将文件压缩到目标路径下
        new ZipUtil().zipFile(src,zipDest);
        //将压缩后的文件发送到指定端口
        uploadFile(toPort,zipDest);
        //输出文件加密前md5
        System.out.println(Md5Utils.getFileMd5(zipDest));
    }


}