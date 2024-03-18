//MULTIPLICATION TABLE(While Loop)

public class Multiply
{
     public static void main(String []args)
     {
        System.out.println("Enter the number: ");
        int n=5;      
        int i=1;
        System.out.println("The multiplication table of "+n+" is: ");
        while(i<=10)
        {
           System.out.println(n+" * "+i+" = "+ (n*i));
            i++;
        }  
     }
}
