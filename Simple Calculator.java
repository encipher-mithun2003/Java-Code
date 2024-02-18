import java.util.Scanner;
public class Cal
{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int ans=0;
          while(true){
            System.out.println("Choose the opration");
            char c =in.next().trim().charAt(0);
            if(c=='+'||c=='-'||c=='*'||c=='/'||c=='%'){
                System.out.print("Enter the two number");
                int num1=in.nextInt();
                int num2=in.nextInt();
                if(c=='+'){
                    ans=num1+num2;
                }
                if(c=='-'){
                    ans=num1+num2;
                }
                if(c=='*'){
                    ans=num1+num2;
                }
                if(c=='/'){
                    if(num2!=0){
                        ans=num1+num2;
                    }
                }
                if(c=='%'){
                    if(num2!=0){
                        ans=num1+num2;
                    }
                }
            }else if(c=='X'||c=='x'){
                break;
            }
            else{
                System.out.println("Inavalid Operation");
            }
            System.out.println(ans);
        }
        
    }
}
