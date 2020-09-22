package thinking.char18.md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 * @author sgc
 * @create 2020/9/7
 */
public class MyMd5 {
    public static void main(String[] args) {
        String s = "hello world";
        System.out.println("原始字符串："+s);
        System.out.println("MD5后："+strToMD5(s));
        System.out.println("解密后："+convertMD5(convertMD5(s)));
        System.out.println("解密后："+convertMD5(s));
    }
    public static String strToMD5(String inStr){
        MessageDigest md5;
        try {
            md5 = MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException e) {
            return  "";
        }
        char[] charArray = inStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];
        for (int i=0;i<charArray.length;i++){
            byteArray[i] =  (byte)charArray[i];
        }
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuilder hexValue = new StringBuilder();
        for (int i=0;i<md5Bytes.length;i++){
            int val = ((int)md5Bytes[i])&0xff;
            if(val<16){
                hexValue.append(0);
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }

    public static String convertMD5(String inStr){
        char[] a = inStr.toCharArray();
        for (int i=0;i<a.length;i++){
            a[i] = (char)(a[i]^'t');//异或
        }
        return new String(a);
    }
}
