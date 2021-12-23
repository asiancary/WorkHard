package com.javabasics.callback;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @name 回调类
 * @fuction 被调用类，通过调用接口传递计算结果
 * @description 被动接收老师发布的题目，计算完成后，主动将结果提交给老师
 * @author asiancary
 */

public class Student {

    /**
     *
     * @param x 接收的输入参数 int
     * @param y 接收的输入参数 int
     * @param computeWay can be "+" “*”
     * @param computeCallBack 声明
     */
    public void computeNumber(int x, int y, String computeWay, ComputeCallBack computeCallBack){


        /*运算线程，可计算加法和乘法*/
        //TODO
        //FIXME
      new Thread(new Runnable() {
          @Override
          public void run() {
              int  result = 0;
              if("+".equals(computeWay)){
                  result = x + y;
              }
              try {
                  System.out.println("等待3秒后计算");
                  Thread.sleep(3000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              if("*".equals(computeWay)){
                  result = x * y;
              }

              //回调操作
              computeCallBack.getResut(x,y,computeWay,result);

          }
      }).start();


      //使用lambda表达式
        new Thread(()->{

        }).start();


        //使用线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 3000L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue<Runnable>());
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {

            }
        });


        //使用可命名的线程
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                //TODO: 计算操作
                return null;
            }
        };

    }
}
