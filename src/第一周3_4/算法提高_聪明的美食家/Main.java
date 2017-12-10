/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第一周3_4.算法提高_聪明的美食家;

import java.util.Scanner;

/**
 * 问题描述
 * 　　如果有人认为吃东西只需要嘴巴，那就错了。
 * 　　都知道舌头有这么一个特性，“由简入奢易，由奢如简难”（据好事者考究，此规律也适合许多其他情况）。具体而言，如果是甜食，当你吃的食物不如前面刚吃过的东西甜，就很不爽了。
 * 　　大宝是一个聪明的美食家，当然深谙此道。一次他来到某小吃一条街，准备从街的一头吃到另一头。为了吃得爽，他大费周章，得到了各种食物的“美味度”。他拒绝不爽的经历，不走回头路而且还要爽歪歪（爽的次数尽量多）。
 * 输入格式
 * 　　两行数据。
 * 　　第一行为一个整数n，表示小吃街上小吃的数量
 * 　　第二行为n个整数，分别表示n种食物的“美味度”
 * 输出格式
 * 　　一个整数，表示吃得爽的次数
 */

public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] delicious = new int[size];
        int result = 0;
        for (int i = 0; i < size; i++)
        {
            delicious[i] = scanner.nextInt();
            if (i != 0)
            {
                if (delicious[i] > delicious[i - 1])
                {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
