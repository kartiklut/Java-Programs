class Test
{}
class demo
{
public static void main(String args[])
{
	Test T1;
	T1=new Test();
	Test T2=new Test();
	Test T3=T1;
	System.out.println(T1);
	System.out.println(T2);
	System.out.println(T3);
}
}