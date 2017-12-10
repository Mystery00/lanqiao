/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第三周3_19.算法提高_质数的后代;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 问题描述
 * 　　在上一季里，曾提到过质数的孤独，其实从另一个角度看，无情隔膜它们的合数全是质数的后代，因为合数可以由质数相乘结合而得。
 * 　　如果一个合数由两个质数相乘而得，那么我们就叫它是质数们的直接后代。现在，给你一系列自然数，判断它们是否是质数的直接后代。
 * 输入格式
 * 　　第一行一个正整数T，表示需要判断的自然数数量
 * 　　接下来T行，每行一个要判断的自然数
 * 输出格式
 * 　　共T行，依次对于输入中给出的自然数，判断是否为质数的直接后代，是则输出Yes，否则输出No
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++)
        {
            System.out.println(check(scanner.nextInt()));
        }
        scanner.close();
    }

    private static String check(int num)
    {
        List<Integer> list = getPrime(num);
        for (int t : list)
        {
            for (int k : list)
            {
                if (num == k * t)
                {
                    return "Yes";
                }
            }
        }
        return "No";
    }

    private static boolean isPrime(int num)
    {
        if (num % 2 == 0)
            return false;
        for (int i = 3; i < Math.sqrt(num); i += 2)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    private static List<Integer> getPrime(int data)
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
