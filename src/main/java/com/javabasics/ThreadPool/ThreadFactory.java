package com.javabasics.ThreadPool;

public class ThreadFactory {
    //使用可命名的线程
    java.util.concurrent.ThreadFactory threadFactory = new java.util.concurrent.ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            //TODO: 计算操作
            return null;
        }
    };
}
