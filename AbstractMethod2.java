abstract class Test
{
	abstract void m1();
	abstract void m2();
	void m3()
	{
		System.out.println("m3 in Test");
	}
}
class Top extends Test
{
	void m2()                                  
	{
		System.out.println("m2 in Top");
	}

	void m1()
	{
		System.out.println("m1 in Top");
	}
}
class Main 
{
	public static void main(String args[])
	{
		Test t1=new Top();
		t1.m1();
		t1.m2();
		t1.m3();
	}
}