/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第二周3_12.算法训练_拦截导弹;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 问题描述
 * 　　某国为了防御敌国的导弹袭击，发展出一种导弹拦截系统。但是这种导弹拦截系统有一个缺陷：虽然它的第一发炮弹能够到达任意的高度，但是以后每一发炮弹都不能高于前一发的高度。某天，雷达捕捉到敌国的导弹来袭。由于该系统还在试用阶段，所以只有一套系统，因此有可能不能拦截所有的导弹。
 * <p>
 * 　　输入导弹依次飞来的高度（雷达给出的高度数据是不大于30000的正整数），计算这套系统最多能拦截多少导弹，如果要拦截所有导弹最少要配备多少套这种导弹拦截系统。
 * 输入格式
 * 　　一行，为导弹依次飞来的高度
 * 输出格式
 * 　　两行，分别是最多能拦截的导弹数与要拦截所有导弹最少要配备的系统数
 */
public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();
        String[] temps = text.split(" ");
        int[] data = new int[temps.length];
        for (int i = 0; i < temps.length; i++)
        {
            data[i] = Integer.parseInt(temps[i]);
        }
        int a = work(data);
        int b = 0;
        int[] temp = new int[temps.length];
        int index = 1;
        for (int i = 1; i < data.length; i++)
        {
            int k;
            for (k = 0; k < index; k++)
            {
                if (data[i] < temp[k])
                {
                    temp[k] = data[i];
                    break;
                }
            }
            if (k == index)
            {
                temp[k] = data[i];
                index++;
                b++;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }

    public static int work(int[] data)
    {
        int result = 0;
        int temp = data[0];
        for (int i = 1; i < data.length; i++)
        {
            if (data[i] < temp)
            {
                temp = data[i];
                result++;
            }
        }
        return result;
    }
}
