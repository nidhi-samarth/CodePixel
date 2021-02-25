import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Page {
	public static void main(String args[])
	{
		JFrame f = new JFrame("Welcome ton seed");
		JLabel l = new JLabel("Username :");
		l.setBounds(100,100,120,50);
		JTextField t = new JTextField();
		t.setBounds(300,100,120,50);
		f.add(l);
		f.add(t);
		f.setSize(400,800);
		f.setLayout(null);
        f.setVisible(true);
	}

}
