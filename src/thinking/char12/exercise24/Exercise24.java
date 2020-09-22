package thinking.char12.exercise24;

/**
 * @author sgc
 * @create 2020/8/11
 */
public class Exercise24 {
    public static void main(String[] args) {
        FailingConstructor f = null;
        try {
            f = new FailingConstructor();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            f.dispose();
        }
    }
}

class FailingConstructor{
    public FailingConstructor(){
        DisposeObject d = null;
        DisposeObject d2 = null;
        try {
            d = new DisposeObject();
        }catch (Exception e){
            System.out.println("d failed");
            try {
                d2 = new DisposeObject();
            }catch (Exception e1){
                System.out.println("d2 failed");

            }finally {
                d2.dispose();
            }
        }finally {

            d.dispose();
        }
    }

    public void dispose(){
        System.out.println("销毁FailingConstructor");
    }
}

class DisposeObject{
    private Boolean dispose;
    public Boolean getDispose(){
        return dispose;
    }
    public void dispose(){
        dispose = true;
    }
}