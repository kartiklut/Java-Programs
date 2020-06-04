import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Test implements ActionListener
{
	JFrame fr;
	JTextField t1,t2;
	JButton b1,b2;
	Test()
	{
		fr=new JFrame();
		fr.setLayout(null);
		fr.setSize(700,700);
		t2=new JTextField();
		t2.setBounds(10,10,40,60);
	 	fr.add(t2);
		t1=new JTextField("Welcome to Color");
		t1.setBounds(50,50,250,100);
		fr.add(t1);
		b1=new JButton("F & B");
		b1.setBounds(50,170,100,30);
		fr.add(b1);
		b2=new JButton("FOre");
		b2.setBounds(150,170,100,30);
		fr.add(b2);
		fr.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
			if(e.getSource()==b1)
			{
				String SearchString=t2.getText();
				String mainString=t1.getText();
				int index=mainString.indexOf(SearchString);
				int len=SearchString.length();
				t1.select(index,index+len);
				t1.requestFocus();
				System.out.println("Index is " + index);
					
				//t1.select(3,7);
				
				t1.requestFocus();
		/*		Color c=new Color(255,0,0);
				t1.setBackground(c);
				                                            or
				                                                     t1.setBackground(Color.RED);  Without making Object
				
				Font f=new Font("impact",Font.BOLD|Font.ITALIC,30);
				t1.setFont(f);           */
			}
			if(e.getSource()==b2)
			{
				t1.replaceSelection("Java");
				//t1.setForeground(Color.BLUE);
			}
	}

public static void main(String args[])
	{
	new Test();
	}
}