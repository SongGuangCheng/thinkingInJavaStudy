package thinking.char12.exercise15;

/**
 * @author sgc
 * @create 2020/8/10
 */


class Switch {
    private boolean state = false;
    public boolean read() { return state; }
    public void on() { state = true; System.out.println(this); }
    public void off() { state = false; System.out.println(this); }
    public String toString() { return state ? "on" : "off"; }
}
class OnOffException1 extends Exception{}
class OnOffException2 extends Exception{}

public class Exercise15 {
    static Switch sw = new Switch();
    public static void f()
            throws OnOffException1,OnOffException2 {}
    public static void main(String[] args) {
        try {
            sw.on();
            f();
            throw new RuntimeException();//放在try中最后一行就不会出错
        } catch(OnOffException1 e) {
            System.out.println("OnOffException1");
        } catch(OnOffException2 e) {
            System.out.println("OnOffException2");
        } finally {
            sw.off();
        }
    }
}