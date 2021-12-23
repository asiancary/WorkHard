package com.javabasics.callback;

/**
 * @name 接口类
 * @fuction 供回调类进行回调，供入口类进行实现，或称回调接口类
 */
public interface ComputeCallBack {
    /**
     * @name
     * @param x
     * @param y
     * @param way
     * @param result
     */
    void getResut(int x, int y,String way,int result);

}
