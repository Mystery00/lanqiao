/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第二周12_18.算法提高_勾股数;

public class Main
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        for (int a = 1; a <= 1000; a++)
        {
            for (int b = a; b <= 1000; b++)
            {
                for (int c = b; c < a + b && a + b + c <= 1000; c++)
                {
                    if (a * a + b * b == c * c)
                    {
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }

}
