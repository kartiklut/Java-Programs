class ExpPro
{
	public static void main(String args[])
		{
			System.out.println("Welcome to Main");
			try
			{
				int a=Integer.parseInt(args[0]);
				int b=Integer.parseInt(args[1]);
				div(a,b);
			}
			catch(NumberFormatException e)
			{
				e.printStackTrace();
			}
			finally
			{
				System.out.println("Finally in main");
			}
			System.out.println("Thank you by main");
		}
static void div(int a,int b) //Its static because we cannot referenced No-Static MEthod in a static COntext
{
	System.out.println("Welcome to div");
	try	
		{
			int c=a/b;
			System.out.println("C :"+c);
		}
	catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
	finally
		{
			System.out.println("Finally in Div");
		}
		System.out.println("Thank You by  Div");
}
}
