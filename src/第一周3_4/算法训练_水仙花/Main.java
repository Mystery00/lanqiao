/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第一周3_4.算法训练_水仙花;

import java.util.Scanner;

/**
 * 问题描述
 　　判断给定的三位数是否 水仙花 数。所谓 水仙花 数是指其值等于它本身 每位数字立方和的数。例 153 就是一个 水仙花 数。 153=13+53+33
 输入格式
 　　一个整数。
 输出格式
 　　是水仙花数,输出"YES",否则输出"NO"(不包括引号)
 */
public class Main
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int data=scanner.nextInt();
        scanner.close();
        if(data/100==0||data/100>9)
        {
            System.out.println("NO");
            return;
        }
        int sum=0;
        int number=data;
        for(int i=0;i<3;i++)
        {
            int temp=number%10;
            sum+=(temp*temp*temp);
            number/=10;
        }
        if(sum==data)
        {
            System.out.println("YES");
        }else
        {
            System.out.println("NO");
        }
    }
}
