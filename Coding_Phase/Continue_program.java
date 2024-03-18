//PRINTING NUMBERS USING (CONTINUE)
public class continuedemo 
{
  public static void main(String[] args) 
  {
	System.out.println("The elements are: ");
       for(int i=1;i<=10;i++)
       {
           if(i==6)
           {
               continue;
           }
           System.out.println(i);
		}	
	}
}
