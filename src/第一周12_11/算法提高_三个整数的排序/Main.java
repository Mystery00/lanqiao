package 第一周12_11.算法提高_三个整数的排序;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    /**
     * 问题描述:输入三个数，比较其大小，并从大到小输出。
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        long[] data = new long[3];
        List<Long> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
        {
            data[i] = scanner.nextLong();
            list.add(data[i]);
        }
        scanner.close();
        while (list.size() != 0)
        {
            long max = 0;
            int index = 0;
            for (int i = 0; i < list.size(); i++)
            {
                if (max < list.get(i))
                {
                    max = list.get(i);
                    index = i;
                }
            }
            System.out.print(max + " ");
            list.remove(index);
        }
    }

}
