/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第一周12_11.算法训练5_2求指数;

import java.util.Scanner;

public class Main
{
    /**
     * 问题描述
     * 已知n和m，打印n^1，n^2，...，n^m。
     * 要求用静态变量实现。n^m表示n的m次方。
     * 已知n和m，打印n^1，n^2，...，n^m。
     * 要求用静态变量实现。
     * n^m表示n的m次方。（每行显示5个数，每个数宽为12，右对齐）
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= b; i++)
        {
            System.out.printf("%12d", index(a, i));
            if (i % 5 == 0)
            {
                System.out.println("");
            }
        }
    }

    private static int index(int a, int b)
    {
        int sum = 1;
        for (int i = 1; i <= b; i++)
        {
            sum *= a;
        }
        return sum;
    }
}
