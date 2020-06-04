final class test
{
   final void m1()
	{
		System.out.println("m1 in test");
	}
}
class top extends test
{
	void m1()
	{
		System.out.println("m1 in top");
	}
}
class main
{
	public static void main(String args[])
	{
		top t1=new top();
		t1.m1();
		t1.m2();
	}
}
	