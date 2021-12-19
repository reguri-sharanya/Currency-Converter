import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter
{
	
	public static void converter()
	{
		JFrame f=new JFrame("CONVERTER");    //it creates a new intitially visible frame with title "CONVERTER"
		JLabel l1,l2,l3;                     //creating label objects
		JTextField t1,t2,t3;		     //JTextField allows editing in single line of text
		JButton b1,b2,b3,b4,b5;		     //JButton creates a button where the properties are taken from action supplied
		
		l1=new JLabel("Rupees: ");	     //Naming the label with Rupees
		l1.setBounds(20,40,100,30);
		l2=new JLabel("Dollars: ");
		l2.setBounds(20,80,100,30);
		l3=new JLabel("Euro: ");
		l3.setBounds(20,120,100,30);
		
		t1=new JTextField("0");              //initialized to width "0"
		t1.setBounds(80,40,200,30);
		t2=new JTextField("0");
		t2.setBounds(80,80,200,30);
		t3=new JTextField("0");
		t3.setBounds(80,120,200,30); 
		
		b1=new JButton("INR");		     //Button is created with name "INR" and with specified bounds 
		b1.setBounds(290,40,160,30);
		b2=new JButton("DOLLAR");	     //Button is created with name "DOLLAR" and with specified bounds
		b2.setBounds(290,80,160,30);
		b4=new JButton("EURO");
		b4.setBounds(290,120,160,30);	     //Button is created with name "EURO" and with specified bounds
		b3=new JButton("CLOSE");
		b3.setBounds(20,170,460,20);
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				double d=Double.parseDouble(t1.getText());		//getText() returns the visible inner text of particular web element
				double d1=(d/76.01);
				String str=String.valueOf(d1);
				t2.setText(str);					//setText() is used to set text on controls
				
				double d2=Double.parseDouble(t1.getText());
				double d3=(d2/85.44);
				String str1=String.valueOf(d3);
				t3.setText(str1);
				
			}
		});
		b2.addActionListener(new ActionListener()				//ActionListener() is a interface that contains actionPerformed() method which is responsible for handling of action events such as
		{									//when user clicks on a component 
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
				f.dispose();						//dispose() is a method which causes the JFrame window to be destroyed and cleaned  by the os
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
		
		f.add(l1);	//adding label l1 to frame 
		f.add(t1);	//adding textfield t1 to frame
		f.add(l2);      //adding label l2 to frame
		f.add(t2);	//adding textfield t2 to frame
		f.add(l3);
		f.add(t3);
		f.add(b1);	//adding button b1 to frame
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		f.setLayout(null);
		f.setSize(600,600);	//setting the window size 600,600 dimensions i.e., square
		f.setVisible(true);	//if true the text is visible else the text is invisible
	}
	public static void main(String args[])		//main method
	{
		converter();	
		
	}
}
