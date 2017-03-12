package 第一周3_5.算法训练_数组查找及替换;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 问题描述
 * 　　给定某整数数组和某一整数b。要求删除数组中可以被b整除的所有元素，同时将该数组各元素按从小到大排序。如果数组元素数值在A到Z的ASCII之间，替换为对应字母。元素个数不超过100，b在1至100之间。
 * 输入格式
 * 　　第一行为数组元素个数和整数b
 * 　　第二行为数组各个元素
 * 输出格式
 * 　　按照要求输出
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int data = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++)
        {
            int temp = scanner.nextInt();
            if (temp % data != 0)
            {
                list.add(temp);
            }
        }
        scanner.close();
        list.sort((o1, o2) ->
        {
            if (o1 > o2)
                return 1;
            return -1;
        });
        for (int temp : list)
        {
            if (temp >= 65 && temp <= 90)
            {
                System.out.print((char) temp + " ");
            } else
            {
                System.out.print(temp + " ");
            }
        }
    }
}
