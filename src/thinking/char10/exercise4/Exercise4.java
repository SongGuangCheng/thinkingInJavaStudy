package thinking.char10.exercise4;

/**
 * @author sgc
 * @create 2020/8/5
 */
public class Exercise4 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(2);
        Sequence.SequenceSelector sequenceSelector = sequence.new SequenceSelector();
        Sequence sequence1 = sequenceSelector.getSelector();//通过外部类.this生成外部类引用
    }
}

interface Selector{
    boolean end();
    void next();
    Object current();
}


class Sequence{
    private Object[] items;
    private int next = 0;
    public Sequence(int size){
        items = new Object[size];
    }
    public void add(Object o){
        if(next < items.length){
            items[next++] = o;
        }
    }
    public class SequenceSelector implements Selector {
        private int i = 0;
        @Override
        public boolean end() {
            return i==items.length;
        }

        @Override
        public void next() {
            if(i<items.length){i++;}
        }

        @Override
        public Object current() {
            return items[i];
        }

        public Sequence getSelector(){
            return Sequence.this;//通过外部类.this生成外部类引用
        }

    }

    Selector getSelector(){
        return new Sequence.SequenceSelector();
    }
}
