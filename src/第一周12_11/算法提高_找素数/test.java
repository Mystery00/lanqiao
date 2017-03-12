package 第一周12_11.算法提高_找素数;

import java.util.Scanner;

/**
 * 最优算法
 */
public class test
{
    private static int[] bz = new int[1000001];
    private static int[] f = new int[65537];
    private static int ans = 0;//bz素数表

    public static void main(String[] args)
    {
        init();
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        scanner.close();
        if (l > r)
        {
            int x = l;
            l = r;
            r = x;
        }//反转
        int len = r - l;
        for (int i = 0; i < bz.length; i++)
        {
            bz[i] = 0;
        }
        if (l == 0)
        {
            bz[0] = 1;
            bz[1] = 1;
        }
        if (l == 1)
        {
            bz[0] = 1;
        }
        for (int i = 1; i <= f[0]; i++)
        {
            long x = (l - 1) / f[i] + 1, k;
            if (f[i] > r) break;
            if (x == 1)
            {
                x = (x + 1) * f[i];
            } else
            {
                x = x * f[i];
            }
            k = f[i];
            for (; ; )
            {
                bz[(int) (x - l)] = 1;
                x += k;
                if (x > r) break;
            }
        }
        for (int i = 0; i <= len; i++)//求个数
        {
            if (bz[i] != 1) ans++;
        }
        System.out.println(ans);
    }

    private static void init()
    {
        for (int i = 2; i <= 65536; i++)
        {
            if (bz[i] != 1)
            {
                f[++f[0]] = i;
            }
            for (int j = 1; j <= f[0]; j++)
            {
                if (f[j] * i > 65536) break;
                bz[f[j] * i] = 1;
                if (i % f[j] == 0) break;
            }
        }
    }
}
