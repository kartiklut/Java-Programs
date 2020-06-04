class Top
{
	void m1()
	{
	System.out.println("m1 in Top");
	}
	void m2()
	{
	System.out.println("m2 in Top");
	}
}
class Bottom extends Top
{
	void m2()
	{
		System.out.println("m2 in Bottom");
	}
	void m3()
	{
		System.out.println("m3 in Bottom");
	}
}
class Main
{
	public static void main(String args[])
	{
		Bottom b1=new Bottom();
		b1.m1();//Inherit
		b1.m2();//Override
		b1.m3();//Extend
	}

}