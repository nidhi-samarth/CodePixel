

public class Np {
int rollno,std;

public Np()
{
	rollno=3828;
	std=2;

	System.out.println("Default Parameterized");
	System.out.println("Data-:"+rollno+std);
}
public Np(int rollno, int std)
{
	this.rollno=rollno;
	this.std=std;
	
	
	System.out.println("Parameterized Constructor");
	System.out.println("Data is:"+rollno +std);
}
public static void main(String[] args) {
	new Np();
	new Np(3829,3);
}
}
