package com.javabasics.callback;

/**
 * @name 入口类
 * @description 内部类调用方式示例
 * @author asiancary
 * @date 2021-12-23
 */
public class Teacher3 {

    public static void main(String[] args){
        int x = 10;
        int y = 89;
        String question = "*";
        System.out.println("老师出了一道题：\n"+"请计算 "+x + " "+question +" "+y+"等于几?");

        Student student = new Student();
        student.computeNumber(x, y, question, new ComputeCallBack() {
            @Override
            public void getResut(int x, int y, String way, int result) {
                System.out.println("学生算出了该题结果：\n"+x + way +y+"="+result);
            }
        });
    }
}

