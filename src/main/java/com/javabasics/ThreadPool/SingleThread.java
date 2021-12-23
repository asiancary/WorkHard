package com.javabasics.ThreadPool;

/**
 * 线程的单独实现方式
 * @function  用于执行异步任务
 * @author asiancary
 */
public class SingleThread {


    private void longTimeTask() {
        new Thread(){
            @Override
            public void run() {
                System.out.println("我是最简单的单线程");
                super.run();
            }
        }.start();
    }

    private void longTimeTask0(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                //TODO
                System.out.println("我是最简单的单线程");
            }
        }).start();
    }


    /**
     *
     */
    private void longTimeTask1() {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //TODO
                System.out.println("我是可配置的单线程thread1");
            }
        });
        thread1.start();
        System.out.println("thread1 getName 1:"+thread1.getName());
        thread1.setName("thread1");
        System.out.println("thread1 getName 2:"+thread1.getName());
        System.out.println("thread1 getId:"+thread1.getId());
        thread1.setPriority(1);

    }


    public class MyThread2 extends Thread {
        @Override
        public void run() {
            //TODO
            System.out.println("我是继承Thread run()的单线程");
            super.run();
        }
    }

    public void longTimeTask2() {
        MyThread2 thread2 = new MyThread2();
        thread2.start();

    }


    public class MyThread3 implements Runnable{
        @Override
        public void run() {
            //TODO
            System.out.println("我是实现Runnable run()的调用");

        }
    }

    public void longTimeTask3(){
        MyThread3 thread3 = new MyThread3();
        thread3.run();
    }

    public static void main(String[] args){
        SingleThread singleThread = new SingleThread();
        singleThread.longTimeTask();
        singleThread.longTimeTask0();
        singleThread.longTimeTask1();
        singleThread.longTimeTask2();//start()开启了一个新线程，在新线程调用方法
        singleThread.longTimeTask3();//在主线程调用run()方法，未开启主线程
    }
}
