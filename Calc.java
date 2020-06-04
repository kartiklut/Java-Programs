
import java.awt.*;
class Calc
{
		Frame fr;
		Button b[]=new Button[16];
		TextField T;
		int x=50,y=100;
	public static void main(String args[])
	{
			new Calc();
	}
	Calc()
	{
			fr=new Frame();
			fr.setSize(400,400);
			fr.setLayout(null);
			T=new TextField();
			T.setBounds(50,50,320,50);
			T.setBackground(Color.black);	
			fr.add(T);
			String S[]={"1","2","3","+","4","5","6","-","7","8","9","*","=",".","0","/"};
			for(int i=0;i<b.length;i++)
			{	
				b[i]=new Button(S[i]);
				b[i].setBounds(x,y,50,50);
				fr.add(b[i]);
				x+=70;
				b[i].setBackground(Color.orange);
				b[i].setForeground(Color.black);
				if((i+1)%4==0)
					{	
						x=50;
						y+=70;
						b[i].setSize(110,50);
						b[i].setBackground(Color.green);
						b[i].setForeground(Color.red);
					}
			}
			fr.setVisible(true);
	}
}