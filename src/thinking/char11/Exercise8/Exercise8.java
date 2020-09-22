package thinking.char11.Exercise8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author sgc
 * @create 2020/8/8
 */
public class Exercise8 {
    public static void main(String[] args) {
        List<Gerbil> lists = new ArrayList<Gerbil>();
        for (int i=0;i<3;i++){
            lists.add(new Gerbil(i));
        }
        Iterator iterator = lists.iterator();
        while(iterator.hasNext()){
            Gerbil gerbil = (Gerbil)iterator.next();
            gerbil.hop();
        }
    }
}

class Gerbil{
    int gerbilNumber;
    public Gerbil(int i){
        gerbilNumber = i;
    }
    void hop(){

        System.out.println(gerbilNumber+"号沙鼠正在跳跃");
    }

}
