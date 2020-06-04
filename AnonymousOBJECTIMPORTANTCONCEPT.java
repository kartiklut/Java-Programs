class A
{
	 B m1()
	{	
		System.out.println("m1 in A");
		B b1=new B();
		return b1;
	}
}
class B
{
	C m2()
	{
		System.out.println("m2 in b");
		C c1=new C();
		return c1;
	}
}
class C
{
	void m3()
	{
		System.out.println("m3 in c");
	}
}
class Main
{
		public static void main(String args[])
		{
			new A().m1().m2().m3();
		}
}
