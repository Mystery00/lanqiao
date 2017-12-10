/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第一周12_11.算法提高_找素数;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    /**
     * 给定区间[L, R] ， 请计算区间中素数的个数。
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        scanner.close();
        System.out.println(prime_number(l, r));
    }

    public static int prime_number(int l, int r)
    {
        List<Integer> prime = getPrime((int) Math.sqrt(r));
        List<Integer> list = new ArrayList<>();
        int i = l;
        if (l % 2 == 0)
        {
            i++;
        }
        for (; i <= r; i += 2)
        {
            list.add(i);
        }
        int num = list.size();
        if (l <= 2)
        {
            num += 2;
        } else if (l == 3)
        {
            num++;
        }
        for (int k = 0; k < list.size(); k++)
        {
            for (int j = 0; j < prime.size(); j++)
            {
                if (list.get(k) % prime.get(j) == 0)
                {
                    num--;
                    break;
                }
            }
        }
        return num;
    }

    public static List<Integer> getPrime(int data)
    {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        for (int i = 5; i < data; i += 2)
        {
            boolean flag = true;
            for (int j = 0; j < list.size(); j++)
            {
                if (i % list.get(j) == 0)
                {
                    flag = false;
                    break;
                }
            }
            if (flag)
            {
                list.add(i);
            }
        }
        return list;
    }

}
