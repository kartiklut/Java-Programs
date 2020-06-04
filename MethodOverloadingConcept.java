//BY CHANGING THE NUMBER OF ARGUMENT
class Test
{
	void sum(int a, int b)
	{	
		System.out.println(" Sum: "+(a+b));
	}
		void sum(int a, int b,int c)
	{			
		System.out.println(" Sum: "+(a+b+c));
	}
		void sum(int a, int b,int c,int d)
	{	
		System.out.println(" Sum: "+(a+b+c+d));
	}
}
class Main
{
	public static void main(String args[])
	{
		Test t1=new Test();
		t1.sum(10,20,30,40);
		t1.sum(10,20);
		t1.sum(10,20,30);
		
	}
}