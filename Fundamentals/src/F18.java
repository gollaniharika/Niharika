
public class F18 {
	public static void main(String args[])
	{
		int sum=0,a;
		int x=Integer.parseInt(args[0]);
		while(x!=0)
		{
			a=x%10;
			sum=sum+a;
			x=x/10;
		}
		System.out.print(sum);
				
	}
}
