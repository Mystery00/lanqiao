/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第一周12_11.算法提高_选择排序;

import java.util.Scanner;

public class Main
{
    /**
     * 输入n个整数，输出选择排序的全过程。
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = scanner.nextInt();
        }
        scanner.close();
        sort(a);
    }

    private static void sort(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            int index = i;
            int min = a[i];
            for (int j = i; j < a.length; j++)
            {
                if (a[j] < min)
                {
                    min = a[j];
                    index = j;
                }
            }
            a[index] = a[i];
            a[i] = min;
            System.out.print("swap(a[" + i + "], a[" + index + "]):");
            for (int anA : a)
            {
                System.out.print(anA + " ");
            }
            System.out.println("");
        }
    }

}
