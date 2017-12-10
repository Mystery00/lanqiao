/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第二周12_18.算法提高_五次方数;

public class Main
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        for (int i = 2; i < 1000000; i++)
        {
            if (sum(i) == i)
            {
                System.out.println(i);
            }
        }
    }

    private static int sum(int n)
    {
        int sum = 0;
        while (n != 0)
        {
            sum += power(n % 10);
            n /= 10;
        }
        return sum;
    }

    private static long power(int a)
    {
        return a * a * a * a * a;
    }
}
