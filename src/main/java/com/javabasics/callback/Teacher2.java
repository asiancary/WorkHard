package com.javabasics.callback;

public class Teacher2 implements ComputeCallBack{

    /**
     *名称：入口类方法
     * 作用：通过该方法获取用户输入，调用回调类方法
     * @param x 输入参数 int
     * @param y 输入参数 int
     * @param question 计算方法，可取“+” 、“*”
     */
    private void setQuestion(int x, int y, String question,Student student){
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
        int x = 17;
        int y = 89;
        String question = "+";

        Teacher2 teacher = new Teacher2();
        teacher.setQuestion(x,y,question,new Student());

    }
}
