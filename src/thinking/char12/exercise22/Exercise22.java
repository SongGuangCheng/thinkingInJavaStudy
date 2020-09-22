package thinking.char12.exercise22;

/**
 * @author sgc
 * @create 2020/8/11
 */
public class Exercise22 {
    public static void main(String[] args) {

        try{
            FailingConstructor f = new FailingConstructor(0);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class FailingConstructor{
    public FailingConstructor(int i){
        if(i==0){
            throw new RuntimeException("不能传0");
        }
    }

}
