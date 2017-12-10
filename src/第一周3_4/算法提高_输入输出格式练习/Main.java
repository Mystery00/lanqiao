/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第一周3_4.算法提高_输入输出格式练习;

import java.util.Scanner;

/**
 * 问题描述
 　　按格式格式读入一个3位的整数、一个实数、一个字符 。
 　　并按格式输出 一个整数占8位左对齐、一个实数占8位右对齐、一个字符 ，并用|隔开。
 */

public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();
        String[] texts = text.split("\\|");
        int number1 = Integer.parseInt(texts[0].substring(0, 3));
        double number2 = Double.parseDouble(texts[0].substring(3, texts[0].length()));
        System.out.printf("%-8s", number1);
        System.out.print("|");
        System.out.printf("%8s", String.format("%.1f", number2));
        System.out.print("|");
        System.out.println(texts[1]);
    }
}
