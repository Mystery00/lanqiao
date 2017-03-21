package 模拟赛;

import java.util.Arrays;

public class three
{
    private static char[] result = "bckfqlajhemgiodnp".toCharArray();

    public static void main(String[] args)
    {
        char[] data = "abcdefghijklmnopq".toCharArray();
        long num = 0;
        while (true)
        {
            for (int i = 15; i >= 0; i--)
            {
                for (int k = 16; k > i; k--)
                {

                }
            }

        }
    }

//    public static long work(char[] data, int index, long num)
//    {
//        if (check(data))
//        {
//            return num;
//        }
//    }

    private static boolean check(char[] data)
    {
        return Arrays.toString(result).equals(Arrays.toString(data));
    }
}
