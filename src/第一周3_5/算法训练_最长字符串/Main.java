/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第一周3_5.算法训练_最长字符串;

import java.util.Scanner;

/**
 * 求出5个字符串中最长的字符串。每个字符串长度在100以内，且全为小写字母。
 * 样例输入
 * one two three four five
 * 样例输出
 * three
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String max = "";
        for (int i = 0; i < 5; i++)
        {
            String temp = scanner.next();
            if (temp.length() > max.length())
            {
                max = temp;
            }
        }
        scanner.close();
        System.out.println(max);
    }
}
