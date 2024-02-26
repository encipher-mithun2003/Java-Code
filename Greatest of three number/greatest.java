import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a , b, c;
        System.out.print("Enter num1: ");
        a = in.nextInt();
        System.out.print("Enter num2: ");
        b = in.nextInt();
        System.out.print("Enter num3: ");
        c = in.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("num1 is Greater");
            }
            else{
                System.out.println("num3 is Greater");
            }
        }
        else{
            if(c>b){
                System.out.println("num3 is greater");
            }
            else{
                System.out.println("num2 is greater");
            }
        }
    }
}
