//PRINTING NUMBERS USING (BREAK)
public class breakdemo 
{
  public static void main(String[] args) 
  {
	int number=0;
	while(number<10)
	{
		number=number+1;
		if(number==5)
		break;
		
		System.out.print(number);
	}	
	System.out.print("After the break"); 
  }
}
