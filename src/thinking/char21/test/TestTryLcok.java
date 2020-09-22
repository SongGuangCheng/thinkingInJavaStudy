package thinking.char21.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
@author sgc
@version 2020年9月1日 上午11:19:28
@Description 
 **/
public class TestTryLcok implements Runnable{
	   private static Lock locks = new ReentrantLock();
	   boolean flag = true;
	    @Override
	    public void run() {
	        try {
	        if(locks.tryLock(4, TimeUnit.SECONDS)){
	        	flag = true;
	            System.out.println(Thread.currentThread().getName()+"-->");
	            Thread.sleep(6000);
	        }else{
	        	flag = false;
	            System.out.println(Thread.currentThread().getName()+" time out ");
	        }
	        } catch (InterruptedException e) {
	           // e.printStackTrace();
	        }finally {
	        	if(flag){
	        		 locks.unlock();//会抛出锁对象的异常，因为没有获取锁在unlock的时候出异常，可以先判断一下是否存在在执行。
	        	}
	       }
	    }
	 
	    public static void main(String[] args) throws InterruptedException {
	        TestTryLcok test =new TestTryLcok();
	        Thread t1 = new Thread(test);
	        Thread t2 = new Thread(test);
	        t1.start();
	        t2.start();
	        t1.join();
	        System.out.println("over");
	    }
	}