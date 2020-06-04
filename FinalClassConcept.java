final class test
{
	void m1()
	{
		System.out.println("m1 in test");
	}
}
class top extends test
{
	void m2()
	{
		System.out.println("m2 in top");
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
	