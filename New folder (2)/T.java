class A
{
	void m1()
	{
		System.out.println("m1 in A");
	}
}
class B
{
	void m2()
	{
		System.out.println("m2 in B");
	}
}
class C
{
	void m3()
	{
		System.out.println("m3 in C");
	}
}
class D
{
	public static void main(String args[])
	{
		A a1=new A();
		a1.m1();
		B b1=new B();
		b1.m2();
		C c1=new C();
		c1.m3();
	}
}