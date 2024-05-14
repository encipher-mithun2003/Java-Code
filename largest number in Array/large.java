public class Large
{
	public static void main(String[] args) {
		int a[]={2,5,6,3,1,10,55,6,8,7};
		int l = a[0];
		for (int i=0;i<a.length;i++){
		    if(a[i]>l){
		        l=a[i];
		    }
		}
		System.out.print(l);
	}
}
