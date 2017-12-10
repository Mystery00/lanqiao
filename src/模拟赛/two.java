/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 模拟赛;

import java.util.ArrayList;
import java.util.List;

public class two
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            list.add(String.valueOf(i));
            list.add(String.valueOf(i));
        }
        get(list);
    }

    private static void get(List<String> list)
    {
        for (int a = 0; a < list.size(); a++)
        {
            for (int b = 0; b < list.size(); b++)
            {
                for (int c = 0; c < list.size(); c++)
                {
                    for (int d = 0; d < list.size(); d++)
                    {
                        for (int e = 0; e < list.size(); e++)
                        {
                            for (int f = 0; f < list.size(); f++)
                            {
                                List<String> temp = new ArrayList<>();
                                for (String t : list)
                                {
                                    temp.add(t);
                                }
                                List<String> w1 = new ArrayList<>();
                                List<String> w2 = new ArrayList<>();
                                w1.add(list.get(a));
                                w1.add(list.get(b));
                                w1.add(list.get(c));
                                w2.add(list.get(d));
                                w2.add(list.get(e));
                                w2.add(list.get(f));
                                if (work(temp, w1, w2))
                                {
                                    for (String tt : w1)
                                    {
                                        System.out.print(tt);
                                    }
                                    System.out.println("");
                                    for (String tt : w2)
                                    {
                                        System.out.print(tt);
                                    }
                                    System.out.println("");
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean work(List<String> list, List<String> w1, List<String> w2)
    {
        for (String temp : w1)
        {
            if (!removeData(list, temp))
            {
                return false;
            }
        }
        for (String temp : w2)
        {
            if (!removeData(list, temp))
            {
                return false;
            }
        }
        int q1 = Integer.parseInt(w1.get(0)) * 100 + Integer.parseInt(w1.get(1)) * 10 + Integer.parseInt(w1.get(2));
        int result1 = q1 * Integer.parseInt(w2.get(2));
        if (result1 >= 1000 || result1 < 100)
        {
            return false;
        } else
        {
            List<String> temps = new ArrayList<>();
            temps.add(String.valueOf(result1 % 10));
            result1 /= 10;
            temps.add(String.valueOf(result1 % 10));
            result1 /= 10;
            temps.add(String.valueOf(result1 % 10));
            if (!removeData(list, temps))
            {
                return false;
            }
        }
        int result2 = q1 * Integer.parseInt(w2.get(1));
        if (result2 >= 1000 || result2 < 100)
        {
            return false;
        } else
        {
            List<String> temps = new ArrayList<>();
            temps.add(String.valueOf(result2 % 10));
            result2 /= 10;
            temps.add(String.valueOf(result2 % 10));
            result2 /= 10;
            temps.add(String.valueOf(result2 % 10));
            if (!removeData(list, temps))
            {
                return false;
            }
        }
        int result3 = q1 * Integer.parseInt(w2.get(0));
        if (result3 >= 1000 || result3 < 100)
        {
            return false;
        } else
        {
            List<String> temps = new ArrayList<>();
            temps.add(String.valueOf(result3 % 10));
            result3 /= 10;
            temps.add(String.valueOf(result3 % 10));
            result3 /= 10;
            temps.add(String.valueOf(result3 % 10));
            if (!removeData(list, temps))
            {
                return false;
            }
        }
        int q2 = Integer.parseInt(w2.get(0)) * 100 + Integer.parseInt(w2.get(1)) * 10 + Integer.parseInt(w2.get(2));
        int result4 = q2 * q1;
        int result = result4;
        if (result4 >= 100000 || result4 < 10000)
        {
            return false;
        } else
        {
            List<String> temps = new ArrayList<>();
            temps.add(String.valueOf(result4 % 10));
            result4 /= 10;
            temps.add(String.valueOf(result4 % 10));
            result4 /= 10;
            temps.add(String.valueOf(result4 % 10));
            result4 /= 10;
            temps.add(String.valueOf(result4 % 10));
            result4 /= 10;
            temps.add(String.valueOf(result4 % 10));
            if (!removeData(list, temps))
            {
                return false;
            }
        }
        System.out.println(result);
        return true;
    }

    private static boolean removeData(List<String> list, List<String> temps)
    {
        for (String temp : temps)
        {
            if (!removeData(list, temp))
            {
                return false;
            }
        }
        return true;
    }

    private static boolean removeData(List<String> list, String temp)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).equals(temp))
            {
                list.remove(i);
                return true;
            }
        }
        return false;
    }
}
