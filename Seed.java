
public class Seed {
public void run()  // method
{
	System.out.println("Welcome to seed infotech ");
}
public static void start()
{
	System.out.println("Hello");
}
public static void stop()
{
	System.out.println("Bye");
}
public static void main(String args[]) {
	Seed s= new Seed();   //created an object
	s.run(); 
	s.start();
	s.stop();//by an object i have just called its method
}
}