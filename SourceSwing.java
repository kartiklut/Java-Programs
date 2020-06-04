import javax.swing.*;
import java.awt.event.*;
class SourceS
{
	JFrame fr;
	JButton b1,b2;
	SourceS()
	{
		fr=new JFrame();
		fr.setLayout(null);
		fr.setSize(400,400);
		b1=new JButton("First");
		b1.setBounds(50,50,100,30);
		fr.add(b1);
		b2=new JButton("Second");
		b2.setBounds(170,50,100,30);
		fr.add(b2);
		fr.setVisible(true);
		MyListener my=new MyListener();
		UListener u=new UListener();
		b1.addActionListener(my);//This means from which Listener Class Object addActionListener is called with which Button
		b2.addActionListener(u);
	}				/*First When Button is Clicked----new ActionEvent() object is generated in memory
					Second {my.actionPerformed(ActionEvent e)} is Called then the Object generated is stored in the ref Vari of the  ActionEvent e--------i.e {ActionEvent e=new ActionEvent();==In the actionPerformed area written in the bracket}*/
	public static void main(String args[])
		{
			new SourceS();
		}
}
class MyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
			{
				System.out.println("First Button is clicked");
			}
	}
class UListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
			{
				System.out.println("Second Button is Clicked");
			}
	}