
public class F9 {
	public static void main(String[] args)
	{
		String s=args[0];
		int x=Integer.parseInt(args[1]);
		if(s=="female")
		{
		if(x>=1 && x<=58)
				{
			System.out.println("Interest is 8.2%");
				}
		if(x>=59 && x<=100)
		{
			System.out.println("Interest is 9.2%");
		}
		}
		if(s=="male")
		{
		if(x>=1 && x<=58)
		{
		System.out.println("Interest is 8.4 %");
		}
		if(x>=59 && x<=100)
		{
		System.out.println("Interest is 10.5%");
		}
		}

}
}
