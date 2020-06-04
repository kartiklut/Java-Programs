class Test
{
		public static void main(String args[])
		{	
			int a=100;
			Integer i1=new Integer(a); //Integer a1=new Integer(100);      BOXING
			int b=i1.intValue();                                          //UNBOXING
			Integer i2=100;
			int c=i2;			//AUTOBOXING
			System.out.println("i1 "+i1);
			System.out.println("i2 "+i2);
		}
}