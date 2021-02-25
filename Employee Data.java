import java.util.Scanner;

public class Deny {
	public static void main(String args[]) {
		 int id,salary;
		  String name,occupation;
		  Scanner sc= new Scanner(System.in);
	System.out.println("Enter the id of an employee");
	id=sc.nextInt();
	System.out.println("Enter the salary of an employee");
	salary=sc.nextInt();
	System.out.println("Enter the name of an employee");
	name=sc.next();
	System.out.println("Enter the occupation of an employee");
	occupation=sc.next();
	System.out.println("Name:"+name+"\n" +"Id:"+id+"\n" +"occupation:"+occupation+ "\n"+ "Salary:"+salary);
}
}

