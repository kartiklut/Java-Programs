class Test
{
int a,b;
void input(int a ,int b)
{
	this.a=a; 
	this.b=b;
	System.out.println(this);

}
void show()
{
System.out.println(" a = "+a);
System.out.println(" b = "+b);
}
}
class Main
{
public static void main(String args[])
{
	Test t1=new Test();
	t1.input(100,500);
	t1.show();
	System.out.println(t1);
	Test t2=new Test();
	t2.input(100,500);
	t2.show();
	System.out.println(t2);
	System.out.println(this);
}
}