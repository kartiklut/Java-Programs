+class Bank
{
	int accno;
	String name;
	int balance;
	
void open(String nm,int ano)
	{
		name=nm;
		accno=ano;
	}
void deposit(int bal)
{
	int bala=0;
	balance=bala+bal;
}
void withdraw(int bal)
{
	balance=balance-bal;
}
void enquiry()
{
	System.out.println("NAme "+name);
	System.out.println("Balance "+balance);
	System.out.println("account no  "+accno);
}
}
class Main
{
	public static void main(String args[])
	{
		Bank b1=new Bank();
		b1.open("Kartik",1001);
		b1.deposit(100);
		b1.withdraw(50);
		b1.enquiry();
		b1.name="Luthra";
		b1.balance=100;
		b1.accno=1002;
		b1.enquiry();
	}
}