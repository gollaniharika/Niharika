
public class F20 {
	public static void main(String[] args)
	{
		int x=1234,r,num=0;
		while(x!=0)
		{
			r=x%10;
			num=(num*10)+r;
			x=x/10;
		}
		System.out.println(num);
	}

}
