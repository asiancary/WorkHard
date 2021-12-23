package com.javabasics.callback;

/**
 * @name 入口类
 *
 * @author asiancary
 * @date 2021-12-23
 * @description 示例调用方式1
 *  * 1）实现 回调接口
 *  * 2）在入口类中声明回调类，并通过入口类构造函数初始化回调类
 *  * 3）在入口类的方法中调用回调类的方法
 *  * 4）在入口类 重写 回调接口方法，此处接收回调类的返回值
 */
public class Teacher1 implements ComputeCallBack {

    //声明回调类
    private Student student;

    //通过 构造函数初始化回调类

    /**
     * @name 构造函数
     * @fuction 初始化属性、方法
     * @description 通过构造函数初始化声明的回调类
     * @param student 待初始化的参数
     */
    private Teacher1(Student student){
        this.student = student;
    }

    /**
     *名称：入口类方法
     * 作用：通过该方法获取用户输入，调用回调类方法
     * @param x 输入参数 int
     * @param y 输入参数 int
     * @param question 计算方法，可取“+” 、“*”
     */
    private void setQuestion(int x, int y, String question){
        System.out.println("老师出了一道题：\n"+"请计算 "+x + " "+question +" "+y+"等于几?");
        student.computeNumber(x,y,question,this);

    }



    /**
     * @name 重写的回调接口
     * @description 通过回调接口获取回调类方法执行结果，通过重写回调接口方法，对返回值进行操作
     * @param x 回调的输入参数 int
     * @param y 回调的输出参数 int
     * @param way 回调的计算方法 String
     * @param result 回调的返回结果 int
     */
    @Override
    public void getResut(int x, int y, String way ,int result) {
        System.out.println("学生算出了该题结果：\n"+x + way +y+"="+result);
    }


    public static void main(String[] args){
        int x = 10;
        int y = 8;
        String question = "*";

        //创建入口类（通过构造函数）
        Teacher1 teacher = new Teacher1(new Student());
        teacher.setQuestion(x,y,question);
    }




}
