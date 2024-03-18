// PALINDROME NUMBER using STRINGBUILDER
import java.util.Scanner;   
class Palindrome 
{  
   public static void main(String args[])  
   {  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      String original = in.nextLine();   
      StringBuilder sb=new StringBuilder(original);
	  String reverse=sb.reverse().toString();
	  
	  if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  
}  
