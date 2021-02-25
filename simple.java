
interface simple {
	public void show();
}
class B implements simple 

{
	public void show()
	{
		System.out.println("Hello World");
	}
         public static void main(String[] args) {
	simple s=new B();
	s.show();
	}
	}
