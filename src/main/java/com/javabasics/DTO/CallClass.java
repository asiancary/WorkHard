package com.javabasics.DTO;

public class CallClass {
    public void handlThing(ExampleInterface exampleInterface){

        new Thread(new Runnable() {
            @Override
            public void run() {
                //计算操作
                System.out.println("do some thing");

                //回调操作
                exampleInterface.sendMessage("这是计算结果");
            }
        }).start();
    }
}
