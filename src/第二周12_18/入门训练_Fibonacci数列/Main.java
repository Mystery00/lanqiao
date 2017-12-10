/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第二周12_18.入门训练_Fibonacci数列;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (n <= 2)
        {
            System.out.println(1);
        } else
        {
            int[] data = new int[n];
            data[0] = data[1] = 1;
            for (int i = 2; i < n; i++)
            {
                data[i] = (data[i - 1] + data[i - 2]) % 10007;
            }
            System.out.println(data[n - 1]);
        }
    }
}
