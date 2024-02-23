import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.print("Enter value 1: ");
        a = in.nextInt();
        System.out.print("Enter value 2: ");
        b = in.nextInt();
        // swapping number using bitwise manipulation (XOR)
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);

    }
}
