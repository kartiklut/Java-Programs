class test
{
	int a,b;
}
class demo
{
	public static void main(String args[])
		{
			test t1=new test();
			t1.a=1000;
			t1.b=2000;
			test t2=new test();
			t2.a=100;
			t2.b=200;
			System.out.println("t1.a "+t1.a);
			System.out.println("t1.b "+t1.b);
			System.out.println("t2.a "+t2.a);
			System.out.println("t2.b "+t2.b);
		}
}