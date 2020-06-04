import java.awt.event.*;
import java.awt.*;
class Calc implements ActionListener
{
	Frame fr;
	Label l,l1,l2;
	Button b1,b2,b3,b4;
	TextField T,T1,T2;
	public static void main(String args[])
		{
			new Calc();
		}
		Calc()
		{
			fr=new Frame();
			fr.setSize(500,500);
			fr.setLayout(null);
			l=new Label("First");
			l.setBounds(50,50,100,30);
			fr.add(l);
			T=new TextField("");
			T.setBounds(170,50,100,30);
			fr.add(T);
			l1=new Label("Second");
			l1.setBounds(50,100,100,30);
			fr.add(l1);
			T1=new TextField("");
			T1.setBounds(170,100,100,30);
			fr.add(T1);
			l2=new Label("Third");
			l2.setBounds(50,150,100,30);
			fr.add(l2);
			T2=new TextField("");
			T2.setBounds(170,150,100,30);
			fr.add(T2);
			b1=new Button("Add");
			b1.setBounds(50,190,30,30);
			fr.add(b1);
			b2=new Button("Mul");
			b2.setBounds(100,190,30,30);
			fr.add(b2);
			b3=new Button("Div");
			b3.setBounds(150,190,30,30);
			fr.add(b3);
			b4=new Button("Sub");
			b4.setBounds(200,190,30,30);
			fr.add(b4);
			fr.setVisible(true);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
		}//public String getText()
		//public void setText(String text)
			public void actionPerformed(ActionEvent e)
			{
					String S1=T.getText();
					String S2=T1.getText();
					int a=Integer.parseInt(S1);
					int b=Integer.parseInt(S2);
					int c=0;
					if(e.getSource()==b1)
					{
							c=a+b;
					}
					if(e.getSource()==b2)
					{
							c=a*b;
					}
					if(e.getSource()==b3)
					{
							c=a/b;
					}
					if(e.getSource()==b4)
					{
							c=a-b;
					}
			T2.setText(c+"");//Convert into String
		}
		
}