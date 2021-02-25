import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Welcome {
	public static void main(String[] args) {
	JFrame f = new JFrame("SeedInfotech");
	JTextField t = new JTextField();
	t.setBounds(100,100,120,50);
	JButton b= new JButton("Click");
   b.setBounds(100,300,120,50);
   b.addActionListener(new ActionListener()
		   {
	public void actionPerformed(ActionEvent arg0) {
		
		t.setText("Sorry the reg. is full ");
	}
		   }
   );
   f.add(t);
   f.add(b);
   f.setSize(400,800);
   f.setLayout(null);
   f.setVisible(true);
	} 

}
