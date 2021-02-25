import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		int id,salary;
		String name,coursename;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id number");
		id=sc.nextInt();
		System.out.println("Enter the salary of an Employee");
		salary=sc.nextInt();
		System.out.println("Enter the name of an Employee");
		name=sc.next();
		System.out.println("Enter the coursename of an Employee");
	    coursename=sc.next();
	   System.out.println("Name:"+name+"\n" +"Id:"+id+"\n" +"Coursename:"+coursename+ "\n"+ "Salary:"+salary);
	}

}
