package 第一周3_4.算法提高_高精度加法;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 问题描述
 * 　　在C/C++语言中，整型所能表示的范围一般为-231到231（大约21亿）,即使long long型，一般也只能表示到-263到263。要想计算更加规模的数，就要用软件来扩展了，比如用数组或字符串来模拟更多规模的数及共运算。
 * 　　现在输入两个整数，请输出它们的和。
 * 输入格式
 * 　　两行，每行一个整数，每个整数不超过1000位
 * 输出格式
 * 　　一行，两个整数的和。
 */
public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String number1 = scanner.nextLine();
        String number2 = scanner.nextLine();
        scanner.close();
        int length = number1.length() > number2.length() ? number1.length() : number2.length();
        List<Integer> list1 = analysis(number1, length);
        List<Integer> list2 = analysis(number2, length);
        String result = work(list1, list2);
        StringBuilder stringBuffer = new StringBuilder(result);
        System.out.println(stringBuffer.reverse().toString());
    }

    public static String work(List<Integer> list1, List<Integer> list2)
    {
        int length1 = list1.size();
        int length2 = list2.size();
        int length = length1 > length2 ? length1 : length2;
        String number = "";
        int temp = 0;
        for (int i = 0; i < length; i++)
        {
            int result = list1.get(i) + list2.get(i) + temp;
            number += result % 10;
            temp = result / 10;
            if (i == length - 1 && temp == 1)
            {
                number += temp;
            }
        }
        return number;
    }

    private static List<Integer> analysis(String number, int n)
    {
        int length = number.length();
        List<Integer> list = new ArrayList<>();
        for (int i = length - 1; i >= 0; i--)
        {
            list.add(Integer.valueOf(number.substring(i, i + 1)));
        }
        for (int i = 0; i < n - length; i++)
        {
            list.add(0);
        }
        return list;
    }
}
