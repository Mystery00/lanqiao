/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第二周3_12.算法训练_摆动序列;

import java.util.Scanner;

/**
 * 问题描述
 * 　　如果一个序列满足下面的性质，我们就将它称为摆动序列：
 * 　　1. 序列中的所有数都是不大于k的正整数；
 * 　　2. 序列中至少有两个数。
 * 　　3. 序列中的数两两不相等；
 * 　　4. 如果第i – 1个数比第i – 2个数大，则第i个数比第i – 2个数小；如果第i – 1个数比第i – 2个数小，则第i个数比第i – 2个数大。
 * 　　比如，当k = 3时，有下面几个这样的序列：
 * 　　1 2
 * 　　1 3
 * 　　2 1
 * 　　2 1 3
 * 　　2 3
 * 　　2 3 1
 * 　　3 1
 * 　　3 2
 * 　　一共有8种，给定k，请求出满足上面要求的序列的个数。
 * 输入格式
 * 　　输入包含了一个整数k。（k<=20）
 * 输出格式
 * 　　输出一个整数，表示满足要求的序列个数。
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.close();
        int sum = k * (k - 1);
        for (int i = 3; i < k; i++)
        {
            //getData();
        }
    }

    public static int[] getData(int n)
    {
        int[] data = new int[n];
        for (int i = 0; i < n; i++)
        {
            data[i] = get(data[i - 1]);
        }
        return null;
    }

    public static int get(int n)
    {
        return n + 1;
    }

    public static boolean check(int[] data)
    {
        int n = data.length;
        for (int i = 1; i < n - 1; i++)
        {
            if (data[i - 1] > data[i - 2])
            {
                if (data[i] > data[i - 2])
                {
                    return false;
                }
            } else
            {
                if (data[i] < data[i - 2])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
