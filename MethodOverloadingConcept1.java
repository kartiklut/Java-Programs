class Test
{
	void m1(int a)
	{
		System.out.println("m1 with int");
	}
	void m1(float a)
	{
		System.out.println("m1 with float");
	}
	void m1(long a)
	{
		System.out.println("m1 with long");
	}
}
class Main
{
	public static void main(String args[])
	{
		Test t1=new Test();
		t1.m1(10);
		t1.m1(10L);
		t1.m1(10.5F);
		t1.m1('A');			//According to the table it directly goes to the datatype which is near to it(byte-short,char-int-long-float-double)
	}
}
//if we hide int function from here it will goes to the long