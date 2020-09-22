package thinking.char21.concurrent;
import java.sql.Time;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
/**
@author sgc
@version 2020年9月1日 下午4:30:10
@Description 测试延迟队列 
延迟队列就是一个无界的阻塞队列 用于防止实现了Delayed接口的类 
该类需要重写compareTo和getDelay方法 
DelayQueue 内的Delayed对象只能在延迟期时间过后才能取出
 **/
public class TestDelayQueue {

	    public static void main(String[] args) throws Exception {
	        BlockingQueue<Task> delayqueue = new DelayQueue<>();
	        long now = System.currentTimeMillis();
	        delayqueue.put(new Task(now+3000));
	        delayqueue.put(new Task(now+4000));
	        delayqueue.put(new Task(now+6000));
	        delayqueue.put(new Task(now+1000));
	        System.out.println(delayqueue);
	        
	        for(int i=0; i<4; i++) {
	            System.out.println(delayqueue.take());
	        }
	        
	    }
	    
	    static class Task implements Delayed{
	        long time = System.currentTimeMillis();
	        public Task(long time) {
	            this.time = time;
	        }
	        @Override
	        public int compareTo(Delayed o) {
	            if(this.getDelay(TimeUnit.MILLISECONDS) < o.getDelay(TimeUnit.MILLISECONDS))
	                return -1;
	            else if(this.getDelay(TimeUnit.MILLISECONDS) > o.getDelay(TimeUnit.MILLISECONDS)) 
	                return 1;
	            else 
	                return 0;
	        }

	        @Override
	        public long getDelay(TimeUnit unit) {
	            return unit.convert(time - System.currentTimeMillis(),TimeUnit.MILLISECONDS);
	        }
	        @Override
	        public String toString() {
	            return "" + time;
	        }
	    }
	}
