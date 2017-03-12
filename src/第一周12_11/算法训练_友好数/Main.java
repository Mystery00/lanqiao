package 第一周12_11.算法训练_友好数;

import java.util.Scanner;

public class Main
{
    /**
     * 问题描述
     * 有两个整数，如果每个整数的约数和（除了它本身以外）等于对方，我们就称这对数是友好的。例如：
     * 9的约数和有：1+3=4
     * 4的约数和有：1+2=3
     * 所以9和4不是友好的。
     * 220的约数和有：1 2 4 5 10 11 20 22 44 55 110=284
     * 284的约数和有：1 2 4 71 142=220
     * 所以220和284是友好的。
     * 编写程序，判断两个数是否是友好数。
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        if (friend(a) == b && friend(b) == a)
        {
            System.out.println("yes");
        } else
        {
            System.out.println("no");
        }
    }

    private static int friend(int data)
    {
        int sum = 0;
        for (int i = 1; i <= data / 2; i++)
        {
            if (data % i == 0)
            {
                sum += i;
            }
        }
        return sum;
    }

}
