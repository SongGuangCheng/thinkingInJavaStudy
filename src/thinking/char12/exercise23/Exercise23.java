package thinking.char12.exercise23;

/**
 * @author sgc
 * @create 2020/8/11
 */
public class Exercise23 {
    public static void main(String[] args) {
        FailingConstructor f = new FailingConstructor();
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
                d2.dispose();
            }
        }finally {
            d.dispose();
        }
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