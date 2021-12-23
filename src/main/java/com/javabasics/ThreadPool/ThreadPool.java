package com.javabasics.ThreadPool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

    /**
     * 可缓存线程池
     */
    private void threadPool1(){
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        cachedThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("无限大线程池");
            }
        });
    }

    /**
     * 定长线程池，超出线程在队列中等待
     */
   private void threadPool2(){
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        fixedThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("固定长度线程池");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
   }

    /**
     * 定长线程，支持定时任务，周期任务
     */
   private void threadPool3(){
       ScheduledExecutorService scheduledExecutorPool = Executors.newScheduledThreadPool(5);
       scheduledExecutorPool.schedule(new Runnable() {
           @Override
           public void run() {
               System.out.println("延时3秒后执行线程池");
           }
       },3, TimeUnit.SECONDS);
   }

    /**
     * 单线程线程池，线程唯一，按 FIFO/LIFO的优先级执行
     */
   private void threadPool4(){
       ExecutorService singleThreadExcutor = Executors.newSingleThreadExecutor();
       singleThreadExcutor.execute(new Runnable() {
           @Override
           public void run() {
               try {
                   System.out.println("单线程线程池");
                   Thread.sleep(2000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       });
   }


   public static void main(String[] args){
       ThreadPool threadPool = new ThreadPool();
       threadPool.threadPool1();
       threadPool.threadPool2();
       threadPool.threadPool3();
       threadPool.threadPool4();

   }


}
