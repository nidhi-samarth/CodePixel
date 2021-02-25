import javax.swing.JButton;
import javax.swing.JFrame;

public class Deno1 {

	public static void main(String[] args) {
	JFrame f = new JFrame("Welcome to seed");
	JButton b = new JButton("Click");
	b.setBounds(100,100,120,50);
	JButton b1=new JButton("Click");
	b1.setBounds(100,300,120,50);
	f.add(b);
	f.add(b1);
	f.setSize(400,800);
	f.setLayout(null);
	f.setVisible(true);
	}
}
