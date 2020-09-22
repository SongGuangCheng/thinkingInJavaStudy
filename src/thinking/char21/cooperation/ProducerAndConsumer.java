package thinking.char21.cooperation;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
@author sgc
@version 2020年8月31日 下午4:42:32
@Description 通过阻塞队列解决生产者消费者问题
 **/
public class ProducerAndConsumer {
	public static void main(String[] args) {
        BlockingQueue blockingQueue = new ArrayBlockingQueue(10);
        
        Producer p = new Producer(blockingQueue);
        Consumer c = new Consumer(blockingQueue);
 
        Thread tp = new Thread(p);
        Thread tc= new Thread(c);
 
        tp.start();
        tc.start();
	}
}

class Producer implements Runnable{
    private final BlockingQueue blockingQueue;
    //设置队列缓存的大小。生产过程中超过这个大小就暂时停止生产
    private final int QUEUE_SIZE = 10;


    public Producer(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    int task = 1;
    @Override
    public void run() {

        while(true){
            try {
                System.out.println("正在生产：" + task);
                //将生产出来的产品放在队列缓存中
                blockingQueue.put(task);
                ++task;
                //让其停止一会，便于查看效果
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}


class Consumer implements Runnable{
    private final BlockingQueue blockingQueue;
    
    public Consumer(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

        //只要阻塞队列中有任务，就一直去消费
        while(true){

            try {
                System.out.println("正在消费： " + blockingQueue.take());
                //让其停止一会，便于查看效果
//                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}