
public class F21 {
	public static void main(String[] args)
	{
		int x=Integer.parseInt(args[0]);
		int r,num=0,temp;
		temp=x;
		while(x!=0)
		{
			r=x%10;
			num=(num*10)+r;
			x=x/10;
		}
		if(num==temp) 
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("not pallindrome");
		}
	}

}