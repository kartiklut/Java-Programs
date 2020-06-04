class M
{
	int a;
	static int b;
}
class Test
	{	
		public static void main(String args[])
			{
				M m1=new M();
				M m2=new M();
				M m3=new M();
				System.out.println(m1.a);
				System.out.println(m2.a);
				System.out.println(m3.a);
				M.b=10;
				System.out.println(M.b);
				System.out.println(m1.b);
				System.out.println(m2.b);
				System.out.println(m3.b);
			}
		}