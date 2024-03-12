import java.util.*;
public class Palindrome {

        public static void main(String args[])
        {
            String org, reverse = ""; // Objects of String class
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a string to check if it is a palindrome: ");
            org = in.nextLine();
            int length = org.length();
            for ( int i = length - 1; i >= 0; i-- )
                reverse = reverse + org.charAt(i);
            if (org.equals(reverse))
                System.out.println("Entered string is a palindrome.");
            else
                System.out.println("Entered string isn't a palindrome.");
        }

}
