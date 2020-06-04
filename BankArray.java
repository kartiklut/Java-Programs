import java.util.*;
class Bank
{
	int bal,accno;
	String name;
	Scanner S1=new Scanner(System.in);
	void open()
	{
		System.out.print("\n\tEnter accno : ");
		accno=S1.nextInt();
		System.out.print("\n\tEnter name : ");
		name=S1.next();
		System.out.print("\n\tEnter bal : ");
		bal=S1.nextInt();
	}
	void enquiry()
	{
		System.out.println(" "+accno+" "+name+" "+bal);
	}
}
class Main
{
	public static void main(String args[])
	{
		Bank b1[]=new Bank[3];
		//b1[0]=null b1[1]=null b1[2]=null
		for(int i=0;i<3;i++)
		{
			b1[i]=new Bank();
			b1[i].open();
		}
		for(int i=0;i<3;i++)
		{
			b1[i].enquiry();
		}
	}
}