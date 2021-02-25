import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Bill {
	public static void main(String[] args) {
JFrame f = new JFrame("*Online Billing System*");
JTextField t= new JTextField();
t.setBounds(100,100,50,50);
JLabel l = new JLabel("tea");
l.setBounds(300,100,50,50);
JLabel l1 = new JLabel("@10");
l1.setBounds(500,100,50,50);


JTextField t1= new JTextField();
t1.setBounds(100,200,50,50);
JLabel l2 = new JLabel("Coffee");
l2.setBounds(300,200,50,50);
JLabel l3 = new JLabel("@20");
l3.setBounds(500,200,50,50);


JC t2= new JTextField();
t2.setBounds(100,300,50,50);
JLabel l4 = new JLabel("Pizza");
l4.setBounds(300,300,50,50);
JLabel l5 = new JLabel("@100");
l5.setBounds(500,300,50,50);


JCheckBox t3= new JCheckBox();
t3.setBounds(100,400,50,50);
JLabel l6 = new JLabel("Water Bottle");
l6.setBounds(300,400,50,50);
JLabel l7 = new JLabel("@20");
l7.setBounds(500,400,50,50);

JButton b = new JButton("Order");
b.setBounds(300,500,120,50);
f.add(b);
f.add(l);
f.add(l1);
f.add(l2);
f.add(l3);
f.add(l4);
f.add(l5);
f.add(l6);
f.add(l7);
f.add(t);
f.add(t1);
f.add(t2);
f.add(t3);
f.setSize(400,800);
f.setLayout(null);
f.setVisible(true);
	}

}
