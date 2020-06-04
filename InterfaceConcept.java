interface I1
	{	
		int a=100; //Variables are by default public static final that's why we can access it with Class Name also
		void m1();
		void m2();
	}
/*class Test extends Top1 implemennts I1(Example) it is possible*/
interface I2
	{
		void m3();
	}
class Test implements I1,I2 
	{	
		public void m1()
			{
				System.out.println("m1 in Test");
			}
		public void m2()
			{
				System.out.println("m2 in Test");
			}
		public void m3()
		{
			System.out.println("m3 in Test");
		}
	}
class Top
	{
		public static void main(String args[])
			{
				Test T1=new Test();    /*I1 T1=new Test();    O/P will be same because it is parent interface and we know we can store the reference id of parent interface in child class*/
				T1.m1();
				T1.m2();
				T1.m3();
				System.out.println(I1.a);
				System.out.println(Test.a);
				System.out.println(T1.a);
			}
	}