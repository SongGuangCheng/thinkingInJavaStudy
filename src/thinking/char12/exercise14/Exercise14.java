package thinking.char12.exercise14;



/**
 * @author sgc
 * @create 2020/8/10
 */
public class Exercise14 {
    private static Switch sw = new Switch();

    public static void f()
            throws OnOffException1, OnOffException2 {
    }

    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw exceptions...
            f();
            throw new RuntimeException();
            //sw.off(); 执行不到此处
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}
class Switch {
    private boolean state = false;
    public boolean read() { return state; }
    public void on() { state = true; System.out.println(this); }
    public void off() { state = false; System.out.println(this); }
    public String toString() { return state ? "on" : "off"; }
}
class OnOffException1 extends Exception{}
class OnOffException2 extends Exception{}

