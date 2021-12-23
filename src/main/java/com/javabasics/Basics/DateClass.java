package com.javabasics.Basics;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间和日历
 */
public class DateClass {
    private void judgeTime(){
        Date date = new Date();
        System.out.println(date.toString());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("G yyyy-MM-dd hh:mm:ss E a z");
        System.out.println(simpleDateFormat.format(date));
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy");
        System.out.println(simpleDateFormat0.format(date));
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("MM-dd");
        System.out.println(simpleDateFormat1.format(date));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm");
        System.out.println(simpleDateFormat2.format(date));
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("E");
        System.out.println(simpleDateFormat3.format(date));
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("D");
        System.out.println("一年中的第 "+simpleDateFormat4.format(date)+" 天");
        SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat("w");
        System.out.println("一年中的第 "+simpleDateFormat5.format(date)+" 周");

        boolean state = date.after(date);
        System.out.println(state);
    }

    public static void main(String[] args){
        DateClass bascis = new DateClass();
        bascis.judgeTime();

    }
}
