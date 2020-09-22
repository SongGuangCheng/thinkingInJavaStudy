package thinking.char18.moreClient;

import java.io.*;
import java.net.Socket;

/**
 * @author sgc
 * @create 2020/9/7
 */
public class TcpSend {
    public void send() throws Exception{
        Socket s = new Socket("127.0.0.1",10086);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream())) ;
        //读文本数据
        BufferedReader bf = new BufferedReader(new FileReader("D:/ioTest/1.txt"));
        String data=null;
        while((data=bf.readLine())!=null) {
            bw.write(data); //读取到的数据不为空的时候，将数据写入通道中
            bw.newLine(); 	//换行
            bw.flush();//不刷新缓冲区，无法写入
        }
        bf.close();
        s.close();
    }

    public static void main(String[] args) throws Exception {
        Socket s = new Socket("127.0.0.1",10086);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream())) ;
        //读文本数据
        BufferedReader bf = new BufferedReader(new FileReader("D:/ioTest/1.txt"));
        String data=null;
        while((data=bf.readLine())!=null) {
            bw.write(data); //读取到的数据不为空的时候，将数据写入通道中
            bw.newLine(); 	//换行
            bw.flush();//不刷新缓冲区，无法写入
        }
        bf.close();
        s.close();
    }
}
