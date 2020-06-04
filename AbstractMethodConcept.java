abstract class Test
{
	abstract void m1();
	abstract void m2();
}
class Top extends Test
{
	void m2()                                  //We have to override the absrttact function
	{
		System.out.println("m2 in Top");
	}

	
	void m1()
	{
		System.out.println("m1 in Top");
	}
	//Here if we dont override it  It will show error and we have to make either the class abstract or make the 
	//function of test clss m1 non-abstract :
	//1.if we create top class abstract then it is not possible to make the object of that class so we prefer //to make it override

}
class main
{
	public static void main(String args[])
	{
		Top t1=new Top();
		t1.m2();
		t1.m1();
	}
}