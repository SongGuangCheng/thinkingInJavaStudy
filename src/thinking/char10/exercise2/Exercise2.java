package thinking.char10.exercise2;

/**
 * @author sgc
 * @create 2020/8/5
 */
public class Exercise2 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(3);
        sequence.add(new StringClazz("张三"));
        sequence.add(new StringClazz("李四"));
        sequence.add(new StringClazz("王五"));
        Selector selector = sequence.getSelector();
        while(!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
}

interface Selector{
    boolean end();
    void next();
    Object current();
}

class StringClazz{
    private String name;
    StringClazz(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
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
    private class SequenceSelector implements Selector{
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
    }

    Selector getSelector(){
        return new SequenceSelector();
    }
}
