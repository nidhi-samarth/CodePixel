
public class Constructor {
int day,month,year;
public Constructor()
{
	day=20;
	month=11;
	year=1998;
	System.out.println("Date is:-"+day+"-"+month+"-"+year);
}
public static void main(String[] args) {
	new Constructor();
}
}
