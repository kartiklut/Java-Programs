class ExpPro
{
	public static void main(String args[])
		{
			System.out.println("Welcome to main");
			try
			{
				int a=Integer.parseInt(args[0]);
				int b=Integer.parseInt(args[1]);
				div(a,b);
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			finally
			{
				System.out.println("Thank You by finally");
			}
			System.out.println("Thank You by main");
		}

static void div (int a,int b)
	{
		System.out.println("Welcome to div");
		try	
		{
			int c=a/b;
			System.out.println("Ans : "+c);
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Thank You by finally in div");
		}
	System.out.println("Thank You by div");
	}
}