class Exptest
{
	public static void main(String args[])
		{
			System.out.println("Welcome to Main ");
			try
			{
				int a=Integer.parseInt(args[0]);
				int b=Integer.parseInt(args[1]);
				int c=a/b;
				System.out.println("Ans: "+c);
			}
			catch(Exception e)
			{
				System.out.println("Exception Handled" );
				System.out.println(e); //Which type of exception it is
				e.printStackTrace(); //Which type of Exception on which Line
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