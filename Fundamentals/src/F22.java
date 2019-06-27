
public class F22 
{
	public static void main(String args[])
	{
	int count=0;
	while(count<=5)
	{
		for(int x=1;x<300;x++)
		{
			if(x%2==0 && x%3==0 && x%5==0)
			{
				System.out.println(x);
				count++;
			}
		}	
	}

}
}

