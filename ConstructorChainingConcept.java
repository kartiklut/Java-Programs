class A
{
	A(int y)
		{	
			super();  //By default
			System.out.println("Parameterized A");
		}
	A()
	{
		this(5);
		System.out.println("Default in A");
	}
}
class B extends A
{
	B( int s)
		{
			this();  //By defualt
			System.out.println("Parameterized B");
		}
	B()
		{
			super(11);   //By default
			System.out.println("Default C");
		}
} 
class C extends B
{ 
	C(int x)
		{
			
			System.out.println("Parameterized C");
		}
	C()
		{
			super(10);   //By default
			System.out.println("Default C");
		}
}
class Main
{	
	public static void main(String args[])
	{
		new C();
	}
}