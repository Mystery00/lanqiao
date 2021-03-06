/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 练习.算法提高_队列操作;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 问题描述
 * 　　﻿队列操作题。根据输入的操作命令，操作队列（1）入队、（2）出队并输出、（3）计算队中元素个数并输出。
 * 输入格式
 * 　　第一行一个数字N。
 * 　　下面N行，每行第一个数字为操作命令（1）入队、（2）出队并输出、（3）计算队中元素个数并输出。
 * 输出格式
 * 　　若干行每行显示一个2或3命令的输出结果。注意：2.出队命令可能会出现空队出队（下溢），请输出“no”，并退出。
 */
public class Main
{
    private static List<Integer> datas = new ArrayList<>();

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        for (int i = 0; i < first; i++)
        {
            switch (scanner.nextInt())
            {
                case 1:
                    InQueue(scanner.nextInt());
                    break;
                case 2:
                    OutQueue();
                    break;
                case 3:
                    System.out.println(datas.size());
                    break;
            }
        }
    }

    private static void InQueue(int data)
    {
        datas.add(data);
    }

    private static void OutQueue()
    {
        try
        {
            System.out.println(datas.remove(0));
        } catch (Exception e)
        {
            System.out.println("no");
            System.exit(0);
        }
    }
}
