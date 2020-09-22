package question.lastweek;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;


/**
@author sgc
@version 2020年9月7日 下午4:40:27
@Description readwritelock可以同时读写吗
读读共享
读写互斥
写写互斥
 **/
public class Question04 {
    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    ReadLock readLock = lock.readLock();
    WriteLock writeLock = lock.writeLock();
    
    public void read(){
        try {
            readLock.lock();
            System.out.println("线程"+Thread.currentThread().getName()+"进入。。。");
            Thread.sleep(3000);
            System.out.println("线程"+Thread.currentThread().getName()+"退出。。。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            readLock.unlock();
        }
    }
    
    public void write(){
        try {
            writeLock.lock();
            System.out.println("线程"+Thread.currentThread().getName()+"进入。。。");
            Thread.sleep(3000);
            System.out.println("线程"+Thread.currentThread().getName()+"退出。。。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            writeLock.unlock();
        }
    }
    
 
    public static void main(String[] args) {
        Question04 wr = new Question04();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                wr.read();
            }
        }, "t1");
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                wr.read();
            }
        }, "t2");
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                wr.write();
            }
        }, "t3");
        Thread t4 = new Thread(new Runnable() {
            public void run() {
                wr.write();
            }
        }, "t4");
        
        //t1.start();
        t2.start();
        t3.start();
        //t4.start();
    }
}