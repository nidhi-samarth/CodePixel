
public class New {
int day,month,year;
public New()
{
	day=26;
	month=7;
	year=2019;
	System.out.println("Default Constructor");
	System.out.println("Date is:"+day+"/"+month+"/"+year);
}
public New(int day, int month,int year)
{
	this.day=day;
	this.month=month;
	this.year=year;
	System.out.println("Parameterized Constructror");
	System.out.println("Date is:"+day+"/"+month+"/"+year);
}
public static void main(String[] args) {
new New();
new New(20,11,1998);
}
}