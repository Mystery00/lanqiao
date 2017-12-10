/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第一周3_5.算法训练_瓷砖铺放;

import java.util.Scanner;

/**
 * 问题描述
 * 　　有一长度为N(1<=Ｎ<=10)的地板，给定两种不同瓷砖：一种长度为1，另一种长度为2，数目不限。要将这个长度为N的地板铺满，一共有多少种不同的铺法？
 * 　　例如，长度为4的地面一共有如下5种铺法：
 * 　　4=1+1+1+1
 * 　　4=2+1+1
 * 　　4=1+2+1
 * 　　4=1+1+2
 * 　　4=2+2
 * 　　编程用递归的方法求解上述问题。
 * 输入格式
 * 　　只有一个数N，代表地板的长度
 * 输出格式
 * 　　输出一个数，代表所有不同的瓷砖铺放方法的总数
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(work(number));
    }

    public static int work(int number)
    {
        switch (number)
        {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return work(number - 1) + work(number - 2);
        }
    }
}
