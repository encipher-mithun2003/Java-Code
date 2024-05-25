// To find the divsor of a number
import java.util.*;
public class Divisor
{
	public static void main(String[] args) {
	    System.out.print("Enter the number: ");
	    Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		for(int i=1;i<=n;i++){
		    if(n%i==0){
		        System.out.println(i);
		    }
		}
	}
}
