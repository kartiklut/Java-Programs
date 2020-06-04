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
			super.m2();
			System.out.println("m2 in Bottom");
		}
		void m3()
		{
			System.out.println("m3 in Bottom");
		}
	}
	class M
	{
		public static void main(String args[])
			{
				Bottom b1= new Bottom();
				b1.m1();   //inherit
				b1.m2();	//override
				b1.m3();	//extend
				//super.m1() >>Error>>coz there is no parent class of M and SUPER is only used for the parent class			
			}
	}