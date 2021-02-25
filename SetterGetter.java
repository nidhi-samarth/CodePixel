
public class SetterGetter {
	int day,month,year;
	public void setDay(int day)
	{
		this.day=day;
	}
	public int getDay() {
		return day;
	}
	public void  setMonth(int month)
	{
		this.month=month;
	}
	public int getMonth()
	{
		return month;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getYear()
	{
		return year;
	}
	public static void main(String args[])
	{
		SetterGetter sg= new SetterGetter();
		sg.setDay(25);
		sg.setMonth(7);
		sg.setYear(19);
		System.out.println("Date is:-"+sg.getDay()+"/"+sg.getMonth()+"/"+sg.getYear());
}
	
	
	
	
	
	
}