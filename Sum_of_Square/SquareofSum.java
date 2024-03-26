import java.util.*;
import java.util.Scanner;
public class SquareofSum {
    public static int sum(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += (i * i);

        return sum;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Value: ");
        int n =in.nextInt();
        System.out.println(sum(n));
    }
}

