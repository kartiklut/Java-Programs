import java .awt.*;
import java.awt.event.*;
class Source implements ActionListener
{
	Frame fr;
	Button b1,b2;
	TextField T;
	Source ()
		{
			fr=new Frame();
			fr.setLayout(null);
			fr.setSize(300,300);
			T=new TextField();
			T.setBounds(50,200,200,300);
			fr.add(T);
			b1=new Button("First");
			b1.setBounds(50,50,100,30);
			fr.add(b1);
			b2=new Button("Second");
			b2.setBounds(50,100,100,30);
			fr.add(b2);
			b1.addActionListener(this);
			b2.addActionListener(this);
			fr.setVisible(true);
		}
			public static void main(String args[])
			{
				new Source();
			}
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==b1)
				{
					T.setText("First Button Clicked");
				}
				if(e.getSource()==b2)
				{
					T.setText("First Button Clicked");
				}
				System.out.println("action Performed Called");//Everytime Object is generated action performed class is called this is how i prove that it is been called everytime
			}

		
}
			