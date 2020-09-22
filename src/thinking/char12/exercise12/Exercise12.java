package thinking.char12.exercise12;

/**
 * @author sgc
 * @create 2020/8/10
 */
public class Exercise12 {
    private Object[] items;
    private int next = 0;
    public Exercise12(int size){items = new Object[size]; }
    public void add(Object x)  throws ArrayIndexOutOfBoundsException{
        if(next < items.length)
            items[next++] = x;
        if(next==items.length){throw new ArrayIndexOutOfBoundsException();}
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        try{
            Exercise12 sequence = new Exercise12(10);
            for(int i = 0; i < 10; i++)
                sequence.add(Integer.toString(i));
            Selector selector = sequence.selector();
            while(!selector.end()) {
                System.out.print(selector.current() + " ");
                selector.next();
            }
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

}



interface Selector {
    boolean end();
    Object current();
    void next();
}
