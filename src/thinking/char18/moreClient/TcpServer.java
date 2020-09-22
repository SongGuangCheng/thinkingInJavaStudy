package thinking.char18.moreClient;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author sgc
 * @create 2020/9/7
 */
public class TcpServer {
    public static void main(String[] args) throws Exception {
        //创建Socket对象
        ServerSocket ss = new ServerSocket(10086);
        while(true) {
            Socket s = ss.accept();
            new Thread() {
                BufferedReader br=null;
                BufferedWriter bw=null;
                public void run() {
                    try {
                        br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    try {
                        //此时利用不同时刻产生的时间拼接文件名，基本上两个用户不能同时上传文件
                        bw = new BufferedWriter(new FileWriter(System.currentTimeMillis()+".text"));
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    String line =null;
                    try {
                        while((line=br.readLine())!=null) {
                            bw.write(line);
                            bw.newLine();
                            bw.flush();//刷新
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }finally {
                        if(bw!=null) {
                            //释放资源
                            try {
                                bw.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if(s!=null) {
                            try {
                                s.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }//关闭链接
                        }
                    }
                }
            }.start();//匿名内部类，对象打点调用方法

        }
    }
}
