import javax.swing.*;
import java.awt.event.*;
class Labeltest implements ActionListener
{
	JFrame fr;
	JLabel lb[]=new JLabel[5];
	JButton b1,b2;
	int x=50,y=50;
	Labeltest()
	{
		fr=new JFrame();
		fr.setLayout(null);
		fr.setSize(500,500);
		
		String S1[]={"First","Second","Third","Fourth","Fifth"};
		for(int i=0;i<lb.length;i++)
			{
				if(i%2==0)
				{
					lb[i]=new JLabel(S1[i],JLabel.LEFT);
				}
				else
				{
					lb[i]=new JLabel(S1[i],JLabel.RIGHT);
				}
				lb[i].setBounds(x,y,100,30);
				fr.add(lb[i]);
				y+=50;
			}
		b1=new JButton("Change 1 by 1");
		b1.setBounds(200,100,100,30);
		fr.add(b1);
		b2=new JButton("Change All");
		b2.setBounds(200,150,100,30);
		fr.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		fr.setVisible(true);
	}
	
	int cn;
	public void actionPerformed(ActionEvent e)
	{	
		if(e.getSource()==b1)
		{
			if(lb[cn].getHorizontalAlignment()==JLabel.LEFT)
			{
					lb[cn].setHorizontalAlignment(JLabel.RIGHT);
			}
			else
			{
				lb[cn].setHorizontalAlignment(JLabel.LEFT);
				
			}
			cn++;
				if(cn==5)
				{
						cn=0;
				}
			
		}	
		if(e.getSource()==b2)
		{
			for(int i=0;i<lb.length;i++)
			{
				if(lb[i].getHorizontalAlignment()==JLabel.LEFT)
				{
					lb[i].setHorizontalAlignment(JLabel.RIGHT);
				}
				else
				{
					lb[i].setHorizontalAlignment(JLabel.LEFT);
					
				}
			}
		}
	}
	public static void main(String args[])
		{
			new Labeltest();
		}
}	