package nidhi;

public class fib{

	public static void main()
	{
		int a=0;
		int b=1;
	int c;
	for(int i=0;i<20;i++)
	{
		System.out.println(a+" ");
		c=a+b;
		a=b;
		b=c;
	}
	}

}
