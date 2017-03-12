package 第一周3_5.算法提高_队列操作;

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
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++)
        {
            switch (scanner.nextInt())
            {
                case 1:
                    InQueue(scanner, list);
                    break;
                case 2:
                    OutQueue(list);
                    break;
                case 3:
                    work(list);
                    break;
            }
        }
        scanner.close();
    }

    public static void InQueue(Scanner scanner, List<Integer> list)
    {
        list.add(scanner.nextInt());
    }

    public static void OutQueue(List<Integer> list)
    {
        if (list.size() == 0)
        {
            System.out.println("no");
            System.exit(0);
        }
        System.out.println(list.remove(0));
    }

    public static void work(List<Integer> list)
    {
        System.out.println(list.size());
    }
}
