package 第一周12_11.算法提高_矩阵相乘;

import java.util.Scanner;

public class Main
{
    /**
     * 现在给你一个ai行aj列的矩阵和一个bi行bj列的矩阵， 要你求出他们相乘的积（当然也是矩阵）。 (输入数据保证aj=bi,不需要判断)
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int ai = scanner.nextInt();
        int aj = scanner.nextInt();
        long[][] a = new long[ai][aj];
        Rect(ai, aj, a, scanner);

        int bi = scanner.nextInt();
        int bj = scanner.nextInt();
        long[][] b = new long[bi][bj];
        Rect(bi, bj, b, scanner);

        scanner.close();
        display(multiplication(a, b));
    }

    private static void Rect(int ai, int aj, long[][] a, Scanner scanner)
    {
        for (int i = 0; i < ai; i++)
        {
            for (int j = 0; j < aj; j++)
            {
                a[i][j] = scanner.nextLong();
            }
        }
    }

    private static long[][] multiplication(long[][] a, long[][] b)
    {
        long[][] result = new long[a.length][b[0].length];
        for (int i = 0; i < result.length; i++)
        {
            for (int j = 0; j < result[0].length; j++)
            {
                result[i][j] = result(a, b, i, j);
            }
        }
        return result;
    }

    private static long result(long[][] a, long[][] b, int i, int j)
    {
        long sum = 0;
        for (int k = 0; k < a[0].length; k++)
        {
            sum += a[i][k] * b[k][j];
        }
        return sum;
    }

    private static void display(long[][] a)
    {
        for (long[] anA : a)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                System.out.print(anA[j] + " ");
            }
            System.out.println("");
        }
    }
}
