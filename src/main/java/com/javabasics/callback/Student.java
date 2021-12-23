package com.javabasics.callback;

/**
 * 回调类
 */

public class Student {
    private ComputeCallBack computeCallBack;

    /**
     *
     * @param x
     * @param y
     * @param computeWay can be "+" “*”
     * @param computeCallBack
     */

    public void computeNumber(int x, int y, String computeWay, ComputeCallBack computeCallBack){

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
              computeCallBack.getResut(x,y,computeWay,result);
          }
      }).start();


    }
}
