/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第二周3_12.算法训练_操作格子;

import java.util.Scanner;

/**
 * 问题描述
 * 有n个格子，从左到右放成一排，编号为1-n。
 * <p>
 * 共有m次操作，有3种操作类型：
 * <p>
 * 1.修改一个格子的权值，
 * <p>
 * 2.求连续一段格子权值和，
 * <p>
 * 3.求连续一段格子的最大值。
 * <p>
 * 对于每个2、3操作输出你所求出的结果。
 * <p>
 * 输入格式
 * 第一行2个整数n，m。
 * <p>
 * 接下来一行n个整数表示n个格子的初始权值。
 * <p>
 * 接下来m行，每行3个整数p,x,y，p表示操作类型，
 * p=1时表示修改格子x的权值为y，
 * p=2时表示求区间[x,y]内格子权值和，
 * p=3时表示求区间[x,y]内格子最大的权值。
 * <p>
 * 输出格式
 * 有若干行，行数等于p=2或3的操作总数。
 * <p>
 * 每行1个整数，对应了每个p=2或3操作的结果。
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] data = new int[n];
        int m = scanner.nextInt();
        int[][] work = new int[m][3];
        for (int i = 0; i < n; i++)
        {
            data[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++)
        {
            for (int k = 0; k < 3; k++)
            {
                work[i][k] = scanner.nextInt();
            }
        }
        scanner.close();
        for (int k = 0; k < m; k++)
        {
            switch (work[k][0])
            {
                case 1:
                    data[work[k][1] - 1] = work[k][2];
                    break;
                case 2:
                    int sum = 0;
                    for (int i = work[k][1]; i <= work[k][2]; i++)
                    {
                        sum += data[i - 1];
                    }
                    System.out.println(sum);
                    break;
                case 3:
                    int max = 0;
                    for (int i = work[k][1]; i <= work[k][2]; i++)
                    {
                        if (data[i - 1] > max)
                        {
                            max = data[i - 1];
                        }
                    }
                    System.out.println(max);
                    break;
            }
        }
    }
}
