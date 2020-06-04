class Exptest
{
	public static void main(String args[])
		{
			System.out.println("Welcome to Main ");
			try
			{
				int a=Integer.parseInt(args[0]);
				int b=Integer.parseInt(args[1]);
			/* 
				if (b==0)
				{
					throw new ArithmeticException();
				}*/
				int c=a/b;  //new ArithmeticException() that means the object of expception class created in memory
		
				System.out.println("Ans: "+c);
			}
			catch(Exception e)
			{
				System.out.println("Exception Handled" );
				System.out.println(e); // On Which line  exception  is
				e.printStackTrace();
			}
			/*catch(ArithmeticException e)
			{
				System.out.println("ArithmeticException Handled ");
			}
			catch(NumberFormatException e)
			{
				System.out.println("NumberFormatException Handled");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBoundsException Handled");
			}*/
			System.out.println("Thanks");
		}
}