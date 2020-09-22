package question.secondWeek;
/**
@author sgc
@version 2020年8月16日 下午2:26:17
@Description 
 **/
public class Question4 {
		public static void main(String[] args) {
			String a = "1";//放在方法区的常量池中
			String b = "1";
			String c = new String("1");//位于堆中
			System.out.println("a==b:"+ (a==b));//true
			System.out.println("a==c:"+ (a==c));//false
			System.out.println("a.equals(b):"+a.equals(b));//true
			System.out.println("a.equals(c):"+a.equals(c));//true
		}
}
