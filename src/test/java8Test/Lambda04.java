package test.java8Test;

/**
 * @author sgc
 * @create 2020/9/7
 */
public class Lambda04 {
    public static void main(String[] args) {
        //转大写
        String up = new Lambda04().strHand("abc",s->s.toUpperCase());
        System.out.println(up);
        //去空格
        String s1 = new Lambda04().strHand("   abc      ",s->s.trim());
        System.out.println(s1);
    }

    //起一个中介作用 将字符串传入接口方法
    public String strHand(String s,MyFunction myFunction){
        return myFunction.getValue(s);
    }
}
