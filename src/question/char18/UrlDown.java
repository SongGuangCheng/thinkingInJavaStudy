package question.char18;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author sgc
 * @create 2020/9/6
 * url下载网络资源
 */
public class UrlDown {
    public static void main(String[] args) throws Exception {
        //1.下载地址
        URL url = new URL("https://m801.music.126.net/20200906191226/83c8c9ce33e5a35416ebc647362cf694/jdyyaac/075a/025f/515b/00d6f142785522755094f197a2c224ac.m4a");
        //2.连接到这个资源
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try(  InputStream inputStream = urlConnection.getInputStream();
              FileOutputStream fos = new FileOutputStream("D:/ioTest/music.m4a");){
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
}
