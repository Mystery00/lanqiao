/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第一周12_11.算法提高_算术运算;

import java.util.Scanner;

public class Main
{
    /**
     * 编写一程序，接受用户输入的两个整数，并计算它们的和、差、积、商
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        int result1 = a + b;
        int result2 = a - b;
        int result3 = a * b;
        int result4 = a / b;
        System.out.println(a + "+" + b + "=" + result1);
        System.out.println(a + "-" + b + "=" + result2);
        System.out.println(a + "*" + b + "=" + result3);
        System.out.println(a + "/" + b + "=" + result4);
    }

}
