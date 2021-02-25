package nidhi;

public class Yellow {
static int a=10;  //static variable
public static void print()    //static method
{
	System.out.println("A is:"+a); //at last this is called
}//completion of static method
static  //static block
{
	a++;
System.out.println("Static Block Executed"); //static method is given priority
}
public static void main(String args[])
{
	System.out.println("Main method is called"); //second main method is given priority
	Yellow.print();  //static method is called by classname.methodname()
}
}
