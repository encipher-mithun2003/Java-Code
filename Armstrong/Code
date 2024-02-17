import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        System.out.print("Enter the value: ");
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        boolean ans= armstrong( n);
        System.out.println(ans);
    }
    static boolean armstrong(int n){
        int orginal =n;
        int sum=0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            sum= sum + (rem*rem*rem);
        }
        if (sum == orginal){
            return true;
        }
        return false;
    }

}
