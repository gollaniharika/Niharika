
public class F15 {
	public static void main(String args[])
	{
		int x,flag=0,i;
		x=Integer.parseInt(args[0]);
		for(i=2;i<x/2;i++)
		{
			if(x%i==0)
			{
				flag++;
			}
		}
		if(flag==0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
			

}
}