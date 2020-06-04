import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MenuTest implements ActionListener 
{
	JButton b1;
	JDialog d1;
	JFileChooser jf=new JFileChooser();
	JMenuBar bar;
	JTextArea ta;
	JMenuItem m1,m2,m3,n1,n2,n3;
	JMenu m,n;
	JFrame fr;
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==m1)
		{
			
			d1.setVisible(true);
			//ta.setBackground(Color.red);
				
		}
		if(e.getSource()==m2)
		{
				ta.setBackground(Color.green);
		}
		if(e.getSource()==m3)
		{
				ta.setBackground(Color.blue);
		}
		if(e.getSource()==n1)
		{
			jf.showOpenDialog(fr);
		}
		if(e.getSource()==n2)
		{
			jf.showSaveDialog(null);
		}
		if(e.getSource()==n3)
		{
			//System.out.print(jf.getSelectedFile());	
		}
	}
	MenuTest()
	{
		fr=new JFrame();
		fr.setLayout(null);
		fr.setSize(700,700);
		ta=new JTextArea();
		ta.setBounds(0,0,fr. getWidth(),fr.getHeight());
		fr.add(ta);
		bar=new JMenuBar();
		fr.setJMenuBar(bar);
		m=new JMenu("Color");
		bar.add(m);
		n=new JMenu("Edit");
		bar.add(n);
		m1=new JMenuItem("Red");
		m2=new JMenuItem("Green");
		m3=new JMenuItem("Blue");
		m.add(m1);
		m.add(m2);
		m.add(m3);
		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		n1=new JMenuItem("Open");
		n2=new JMenuItem("Save");
		n3=new JMenuItem("Print");
		n.add(n1);
		n.add(n2);
		n.add(n3);
		n1.addActionListener(this);
		n2.addActionListener(this);
		n3.addActionListener(this);
		d1=new JDialog();
		d1.setLayout(null);
		d1.setSize(300,300);
		b1=new JButton("OnClick");
		b1.setLayout(null);
		d1.setBounds(50,50,100,30);
		d1.add(b1);
		fr.setVisible(true);
	}
	public static void main(String args[])
	{
		new MenuTest();
	}
}