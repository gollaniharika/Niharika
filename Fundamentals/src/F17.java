
public class F17 {
	public static void main(String args[])
	{
		int x,flag=0,i;
		x=Integer.parseInt(args[0]);
		if(x==0 || x==1)
		{
			System.out.println(x+" is neither prime nor compositenumber");
		    
		}
		for(i=2;i<x/2;i++)
		{
			if(x%i==0)
			{
				flag++;
			}
			
		}
		if(flag==0)
		{
			System.out.println(x+" is a prime number");
		}
		else
		{
			System.out.println(x+" is a composite number");
		}
		
		
			

	}
}
