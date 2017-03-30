package 模拟赛;

import java.util.Scanner;

public class five
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        float r = scanner.nextFloat();
        int n = scanner.nextInt();
        scanner.close();
        double i = 434.2;
        double res = 1;
        for (; res > 0; i += 0.01)
        {
            res = result(r, 10000d, n, i);
        }
        System.out.println((int) (i * 100));
    }

    private static double result(double r, double m, int n, double x)
    {
        if (n == 1)
            return m * r / 12d;
        return m - x - result(r, m * r / 12d + m - x, n - 1, x);
    }
}
