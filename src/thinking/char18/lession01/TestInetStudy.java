package thinking.char18.lession01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author sgc
 * @create 2020/9/6
 */
public class TestInetStudy {
    public static void main(String[] args) {
        try {
            //获取本机地址
            InetAddress address1 = InetAddress.getByName("127.0.0.1");
            System.out.println(address1);
            InetAddress address3 = InetAddress.getByName("localhost");
            System.out.println(address3);
            InetAddress address4 = InetAddress.getLocalHost();
            System.out.println(address4);
            InetAddress address2 = InetAddress.getByName("www.baidu.com");
            System.out.println(address2);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
