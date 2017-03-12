package 第一周12_11.算法提高_找素数;

public class tt
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        countPrimes3();
    }

    public static void countPrimes(int num)
    {
        long begin = System.currentTimeMillis();
        boolean[] array = new boolean[num];
        for (int i = 0; i < num; i = i + 2)
        {
            array[i] = false;
        }
        for (int i = 1; i < num; i = i + 2)
        {
            array[i] = true;
        }
        for (int i = 2; i < Math.sqrt(num); i++)
        {
            if (array[i])
            {
                for (int j = i + i; j < num; j = j + i)
                {
                    array[j] = false;
                }
            }
        }
        int count = 0;
        for (boolean b : array)
        {
            if (b)
            {
                count++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("total=" + count + "cost=" + (end - begin));
    }

    public static void countPrimes2(int num)
    {
        long begin = System.currentTimeMillis();
        int[] p = new int[num];
        boolean[] isPrime = new boolean[num + 1];
        int np = 0;
        for (int i = 2; i <= num; i++)
        {
            if (!isPrime[i])
                p[np++] = i;
            for (int j = 0; j < np && p[j] * i <= num; j++)
            {
                isPrime[p[j] * i] = true;
                if (i % p[j] == 0)
                    break;
            }
        }
        System.out.println(p.length);
        long end = System.currentTimeMillis();
        System.out.println("cost=" + (end - begin));
    }

    private static void countPrimes3()
    {
        long start = System.currentTimeMillis();
        boolean[] flags = new boolean[2147444];
        int num = (int) Math.sqrt(2147443);

        int count = 1;
        for (int i = 3; i <= num; i = i + 2)
        {
            if (flags[i])
            {
                continue;
            }
            for (int j = i * i; j < 2147444; j = j + 2 * i)
            {
                if (!flags[j])
                {
                    count++;
                    flags[j] = true;
                }
            }
        }
        count = count + 2147443 / 2 - 1;
        System.out.println("time:" + (System.currentTimeMillis() - start) + "ms");
        System.out.println("count:" + (2147443 - count));

    }

}
