 abstract class test
{
	void m1()
		{
			System.out.println("m1 in test");
		}
}
class test1 extends test
{
	void m2()
	{
			System.out.println("m2 in test1");
	}
}
class Main
{
	public static void main(String args[])
		{
			test1 t1=new test1();
			t1.m2();
			t1.m1();
		}
}