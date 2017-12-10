/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第一周3_4.算法提高_身份证号码升级;

import java.util.Scanner;

/**
 * 问题描述
 　　从1999年10月1日开始，公民身份证号码由15位数字增至18位。(18位身份证号码简介)。升级方法为：
 　　1、把15位身份证号码中的年份由2位(7,8位)改为四位。
 　　2、最后添加一位验证码。验证码的计算方案：
 　　将前 17 位分别乘以对应系数 (7 9 10 5 8 4 2 1 6 3 7 9 10 5 8 4 2) 并相加，然后除以 11 取余数，0-10 分别对应 1 0 x 9 8 7 6 5 4 3 2。
 　　请编写一个程序，用户输入15位身份证号码，程序生成18位身份证号码。假设所有要升级的身份证的四位年份都是19××年
 输入格式
 　　一个15位的数字串，作为身份证号码
 输出格式
 　　一个18位的字符串，作为升级后的身份证号码
 */

public class Main
{
    public static void main(String args[])
    {
        int[] data1={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        String[] data2={"1","0","x","9","8","7","6","5","4","3","2"};
        Scanner scanner=new Scanner(System.in);
        String source=scanner.nextLine();
        scanner.close();
        String text1=source.substring(0,6);
        String text2="19"+source.substring(6,8);
        String text3=source.substring(8,15);
        String text=text1+text2+text3;
        int sum=0;
        for(int i=0;i<text.length();i++)
        {
            int temp= Integer.parseInt(text.substring(i,i+1));
            sum+=(temp*data1[i]);
        }
        System.out.println(text+data2[sum%11]);
    }
}
