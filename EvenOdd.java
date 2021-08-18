
public class EvenOdd {
public void Numb()
{
	int a=33;
	if(a%2==0)
	{
		System.out.println("The number is Even");
	}
	else
		System.out.println("The number is an odd number");
}
public static void main(String args[])
{
	EvenOdd eo=new EvenOdd();
	eo.Numb();
}
}