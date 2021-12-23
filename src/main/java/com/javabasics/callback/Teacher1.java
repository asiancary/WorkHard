package com.javabasics.callback;

/**
 * 入口类
 * 调用方式1
 * 1）实现 回调接口
 * 2）在入口类中声明回调类，并通过入口类构造函数初始化回调类
 * 3）在入口类的方法中调用回调类的方法
 * 4）在入口类 重写 回调接口方法，此处接收回调类的返回值
 *
 */
public class Teacher1 implements ComputeCallBack {

    //Declare a student
    private Student student;

    //Init student
    private Teacher1(Student student){
        this.student = student;
    }

    /**
     *
     * @param x
     * @param y
     * @param question, 可取“+” 、“*”
     * @return
     */
    private void setQuestion(int x, int y, String question){
        System.out.println("老师出了一道题：\n"+"请计算 "+x + " "+question +" "+y+"等于几?");
        student.computeNumber(x,y,question,this);

    }


    //通过回调获取结果
    @Override
    public void getResut(int x, int y, String way ,int result) {
        System.out.println("学生算出了该题结果：\n"+x + way +y+"="+result);
    }

    /**
     * 调用
     * @param args
     */
    public static void main(String[] args){
        Teacher1 teacher = new Teacher1(new Student());
        teacher.setQuestion(10,8,"*");


    }




}
