package thinking.char10.exercise22;

/**
 * @author sgc
 * @create 2020/8/7
 */
public class Exercise22 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        //反序
        Selector re = sequence.reverseSelector();
        while(!re.end()){
            System.out.print(re.current()+ " ");
            re.next();
        }
    }
}

interface Selector {
    boolean end();
    Object current();
    void next();
}

class Sequence{
    private Object[] items ;
    static int next = 0;
    public Sequence(int size){
        items = new Object[size];
        for(int i=0; i<size; i++){
            add(i);
        }
    }
    public void add(Object x){
        if(next < items.length){
            items[next++] = x;
        }
    }
    //反序
    class reverseSelector implements Selector{
        int i = 9;

        @Override
        public boolean end() {
            return i<0;
        }

        @Override
        public void next() {
            i--;
        }

        @Override
        public Object current() {
            if(i>=0){
                return items[i];
            }
            return null;
        }
    }
    //返回一个内部类对象
    public Selector reverseSelector(){
        return new reverseSelector();
    }
    class SequenceSelector implements Selector{
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if(i<items.length)
                i++;
        }
    }



    public Selector selector(){
        return new SequenceSelector();
    }

}