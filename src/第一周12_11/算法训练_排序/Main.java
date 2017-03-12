package 第一周12_11.算法训练_排序;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    /**
     * 编写一个程序，输入3个整数，然后程序将对这三个整数按照从大到小进行排列。
     * 输入格式：输入只有一行，即三个整数，中间用空格隔开。
     * 输出格式：输出只有一行，即排序后的结果。
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
            long max = list.get(0);
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
