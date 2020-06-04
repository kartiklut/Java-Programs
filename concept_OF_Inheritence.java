`class Top
{
		/*private*/ int a;
		int b=500;
	/*private*/ void m1()
	{
			System.out.println("m1 in Top");
	}
	void m2(int x)
	{
			a=x+100;
			m1();
			System.out.println("m2 in Top");
	}
}
class Bottom extends Top
{
		int c;
	void m2()
	{
		c=500;
		m2(c+100);
		System.out.println("m2 in Bottom");
	}
	void show()
	{
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
	}
}
class M
{
	public static void main(String args[])
	{
			Bottom b1=new Bottom();
			b1.m2();
			b1.show();
	}
}