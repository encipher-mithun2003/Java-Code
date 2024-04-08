import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        System.out.print("Enter the numbre:");
        boolean ans= isprime(n);
        System.out.println(ans);
    
    }
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c==0){
            if(n%c==0){
                return false;
            }
            c++;
        }
        if(c*c>n){
            return true;
        }
        return false;
    }
}
