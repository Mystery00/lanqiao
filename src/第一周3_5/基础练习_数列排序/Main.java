/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第一周3_5.基础练习_数列排序;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 问题描述
 * 　　给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
 * 输入格式
 * 　　第一行为一个整数n。
 * 　　第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。
 * 输出格式
 * 　　输出一行，按从小到大的顺序输出排序后的数列。
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < number; i++)
        {
            list.add(scanner.nextInt());
        }
        scanner.close();
        list.sort((o1, o2) ->
        {
            if (o1 > o2)
                return 1;
            return -1;
        });
        for (int temp : list)
        {
            System.out.print(temp + " ");
        }
    }
}
