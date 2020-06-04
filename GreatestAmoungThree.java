import java.util.Scanner;
class S1
	{
		public static void main(String args[])
		{
			int a,b,c;
			System.out.println("Enter three numbers");
			Scanner S1=new Scanner(System.in);
			a=S1.nextInt();
			b=S1.nextInt();
			c=S1.nextInt();
			if(a>b && a>c)
			{
				System.out.println("A is greater");
			}
			if(b>c)
			{
				System.out.println("B is greater");
			}
			else
			{
				System.out.println("C is greater");
			}
		}
	}