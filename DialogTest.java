import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class DialogTest implements ActionListener
{
	JDialog d1;
	JFrame fr;
	JButton b1,b2,b3;
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(fr,"HEllo WORLD","MEssageDialogBox",JOptionPane.WARNING_MESSAGE);
		}
		if(e.getSource()==b2)
		{
		int x=JOptionPane.showConfirmDialog(fr,"You want TO save","Save",JOptionPane.YES_NO_CANCEL_OPTION);
		if(x==JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(null,"SAved");
			}
		if(x==JOptionPane.NO_OPTION)
			{
				JOptionPane.showMessageDialog(null,"Not SAved");
			}
		if(x==JOptionPane.CANCEL_OPTION)
			{
				JOptionPane.showMessageDialog(null,"Decide Quickly");
			}
		}
		if(e.getSource()==b3)
		{
			String name=JOptionPane.showInputDialog(null,"Enter your name","John Doe");
			if(name!=null)
				{
					JOptionPane.showMessageDialog(fr,"Welcome"+ name);
				}
			else
				{
					JOptionPane.showMessageDialog(fr,"Welcome Guest");
				}
		}
		if(e.getSource()==d1)
		{
			d1.setVisible(true);
			new MenuTest();
		}
	}
	DialogTest()
	{
		fr=new JFrame();
		fr.setLayout(null);
		fr.setSize(500,500);
		b1=new JButton("Message");
		b1.setBounds(50,50,100,30);
		fr.add(b1);
		b2=new JButton("Confirm");
		b2.setBounds(170,50,100,30);
		fr.add(b2);
		b3=new JButton("Input");
		b3.setBounds(300,50,100,30);
		fr.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		fr.setVisible(true);
	}
	public static void main(String args[])
	{	
		new DialogTest();
	}
}