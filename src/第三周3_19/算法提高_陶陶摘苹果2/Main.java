/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第三周3_19.算法提高_陶陶摘苹果2;

import java.util.Scanner;

/**
 * 问题描述
 * 　　陶陶家的院子里有一棵苹果树，每到秋天树上就会结出n个苹果。苹果成熟的时候，陶陶就会跑去摘苹果。陶陶有个30厘米高的板凳，当她不能直接用手摘到苹果的时候，就会踩到板凳上再试试。
 * 　　现在已知n个苹果到地面的高度，以及陶陶把手伸直的时候能够达到的最大高度。假设她碰到苹果，苹果就会掉下来。请帮陶陶算一下,经过她的洗劫后，苹果树上还有几个苹果。
 * 输入格式
 * 　　输入包括两行数据。第一行只包括两个正整数n(5<=n<=200)和m(60<=m<=200),表示苹果数目和桃桃伸手可达到的高度（以厘米为单位）。第二行包含n个100到200之间（包括100和200）的整数（以厘米为单位）分别表示苹果到地面的高度，两个相邻的整数之间用一个空格隔开。
 * 输出格式
 * 　　输出包括一行，这一行只包含一个整数，表示陶陶不能够摘到的苹果的数目。
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int data = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < number; i++)
        {
            int temp = scanner.nextInt();
            if (data + 30 < temp)
            {
                sum++;
            }
        }
        scanner.close();
        System.out.println(sum);
    }
}
