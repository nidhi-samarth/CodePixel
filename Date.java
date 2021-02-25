
public class Date{ 
public void display() {
	 int d=25,m=7,y=19;  //local variable(instance)
	System.out.println("Date is :"+d+"/"+m+"/"+y);
}
	public static void main(String[] args) {
	Date p= new Date();
	p.display();
	}

}
