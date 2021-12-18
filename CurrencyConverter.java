import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CurrencyConverter
{
	public static void converter()
	{
		JFrame f=new JFrame("CONVERTER");    //it creates a new intitially visible frame with title "CONVERTER"
		JLabel l1,l2,l3;                     //
		JTextField t1,t2,t3;
		JButton b1,b2,b3,b4,b5;
		l1=new JLabel("Rupees: ");
		l1.setBounds(20,40,100,30);
		l2=new JLabel("Dollars: ");
		l2.setBounds(170,40,100,30);
		l3=new JLabel("Euro: ");
		l3.setBounds(320,40,100,30);
		
		t1=new JTextField("0");      //initialized to width 0
		t1.setBounds(80,40,50,30);   //
		t2=new JTextField("0");
		t2.setBounds(240,40,50,30);
		t3=new JTextField("0");
		t3.setBounds(400,40,50,30); 
		
		b1=new JButton("INR");
		b1.setBounds(50,80,60,15);
		b2=new JButton("Dollar");
		b2.setBounds(190,80,100,15);
		b4=new JButton("Euro");
		b4.setBounds(330,80,100,15);
		b3=new JButton("close");
		b3.setBounds(50,150,390,20);
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				double d=Double.parseDouble(t1.getText());
				double d1=(d/76.01);
				String str=String.valueOf(d1);
				t2.setText(str);
				
				double d2=Double.parseDouble(t1.getText());
				double d3=(d2/85.44);
				String str1=String.valueOf(d3);
				t3.setText(str1);
			}
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				double d2=Double.parseDouble(t2.getText());
				double d3=(d2*76.01);
				String str1=String.valueOf(d3);
				t1.setText(str1);
				
				double d4=Double.parseDouble(t2.getText());
				double d5=(d4*0.89);
				String str=String.valueOf(d5);
				t3.setText(str);
			}
		});
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				f.dispose();
			}
		});
		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				double d=Double.parseDouble(t3.getText());
				double d1=(d*85.44);
				String str1=String.valueOf(d1);
				t1.setText(str1);
				
				double d2=Double.parseDouble(t3.getText());
				double d3=(d2*0.89);
				String str=String.valueOf(d3);
				t1.setText(str);
			}
		});
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		f.add(l1);
		f.add(t1);
		f.add(l2);     //adding label to frame
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		f.setLayout(null);
		f.setSize(600,600);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		converter();
	}
}
