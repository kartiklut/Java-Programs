class Top
{
	int a=100;
	void m1()
	{
		System.out.println("m1 in Top");
	}
   static void m2()
	{
		System.out.println("m2 in Top ");
	}
	void m3()
	{}
}
class Bottom extends Top
{	
	int a=500;
	static void m2()
	{
		System.out.println("m2 in Bottom");
	}
	void m3()
	{
		System.out.println("m3 in Bottom");
	}
}
class M
{
	public static void main(String args[])
	{
		Top t1=new Bottom();
		t1.m1();
		t1.m2();
		t1.m3();
		System.out.println("a : "+t1.a);
	}
}