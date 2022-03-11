import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input count of numbers: ");
        int e = in.nextInt();

        int[] array = new int[e];
        for (int j= 0; j < array.length; j++) {
            array[j] = (int) Math.round((Math.random() * 20) + 3);
        }

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++)
        {
            int value = array[i];

            int j = i - 1;
            for (; j >= 0; j--)
            {
                if (value < array[j])
                {
                    array[j + 1] = array[j];
                }
                else
                {
                    break;
                }
            }
            array[j + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}