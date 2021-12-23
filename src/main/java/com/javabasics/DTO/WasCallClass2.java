package com.javabasics.DTO;

public class WasCallClass2 {

    public static void main(String[] args){
        CallClass callClass = new CallClass();
        callClass.handlThing(new ExampleInterface() {
            @Override
            public void sendMessage(String string) {
                System.out.println("这是计算结果");
                System.out.println(string);
            }
        });

    }
}
