package com.javabasics.DTO;

public class WasCallClass implements ExampleInterface {


    @Override
    public void sendMessage(String string) {

        System.out.println("获取到计算结果");
        System.out.println(string);

    }

    public static void main(String[] args){
        System.out.println("回调测试开始");
        CallClass callClass = new CallClass();
        callClass.handlThing(new WasCallClass());
        System.out.println("异步回调测试");

    }
}
