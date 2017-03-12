package 第一周3_5.算法提高_实数相加;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 问题描述
 * 　　计算两个实数相加的结果。
 * 　　输入的实数满足如下要求:
 * (1)小数点前的整数部分最多100位，
 * (2)小数点后的小数部分最多100位.
 * 输入格式
 * 　　两行字符串，每行都是一个合法的实数。合法的意思是指:整数部分的值如果大于零,则最高位数字必定大于零. 如果整数部分的值为零,则整数部分只有一个零. 小数部分尾部可以有任意多的零. 可以没有小数部分,　　此时也没有小数点. 如果有小数点, 则至少需要有一位小数部分, 且允许是零.
 * 输出格式
 * 　　相加结果。注意: 小数部分末尾如果有连续的0, 则它们都是有效数字,不能舍去. 如果是两个整数相加, 则结果仍为整数而没有小数部分.
 */
public class Main
{
    public static void main(String[] args)
    {
        String number1_decimal;
        String number2_decimal;
        Scanner scanner = new Scanner(System.in);
        String number1 = scanner.nextLine();
        String number2 = scanner.nextLine();
        scanner.close();
        String number1_int = number1.split("\\.")[0];
        String number2_int = number2.split("\\.")[0];
        if (number1.contains("."))
        {
            number1_decimal = number1.split("\\.")[1];
        } else
        {
            number1_decimal = "0";
        }
        if (number2.contains("."))
        {
            number2_decimal = number2.split("\\.")[1];
        } else
        {
            number2_decimal = "0";
        }
        int length_Integer = number1_int.length() > number2_int.length() ? number1_int.length() : number2_int.length();
        int length_decimal = number1_decimal.length() > number2_decimal.length() ? number1_decimal.length() : number2_decimal.length();
        List<Integer> list1_Integer = analysis_Integer(number1_int, length_Integer);
        List<Integer> list2_Integer = analysis_Integer(number2_int, length_Integer);
        List<Integer> list1_decimal = analysis_decimal(number1_decimal, length_decimal);
        List<Integer> list2_decimal = analysis_decimal(number2_decimal, length_decimal);
        String result_Integer = work_Integer(list1_Integer, list2_Integer);
        String result_decimal = work_Integer(list1_decimal, list2_decimal);
        if (result_decimal.length() > length_decimal)
        {
            List<Integer> integerList = new ArrayList<>();
            integerList.add(1);
            for (int i = 0; i < length_Integer - 1; i++)
            {
                integerList.add(0);
            }
            result_Integer = work_Integer(analysis_Integer(result_Integer, length_Integer), integerList);
            result_decimal = result_decimal.substring(0, result_decimal.length() - 1);
        }
        if (checkDecimal(result_decimal))
        {
            System.out.println(new StringBuilder(result_Integer).reverse().toString());
        } else
        {
            System.out.println(
                    new StringBuilder(result_Integer).reverse().toString() + "." +
                            new StringBuilder(result_decimal).reverse().toString());
        }
    }

    private static String work_Integer(List<Integer> list1, List<Integer> list2)
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

    private static List<Integer> analysis_Integer(String number, int n)
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

    private static List<Integer> analysis_decimal(String number, int n)
    {
        int length = number.length();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n - length; i++)
        {
            list.add(0);
        }
        for (int i = length - 1; i >= 0; i--)
        {
            list.add(Integer.valueOf(number.substring(i, i + 1)));
        }
        return list;
    }

    private static boolean checkDecimal(String decimal)
    {
        String[] texts = decimal.split("0");
        for (String text : texts)
        {
            if (!text.equals("0"))
            {
                return false;
            }
        }
        return true;
    }
}
