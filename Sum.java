import java.util.Scanner;
class S1
{
	public static void main(String args[])
		{	
			int rem,Sum=0;
			System.out.println("Enter the number to get its reverse");
			Scanner S1=new Scanner(System.in);
			int a=S1.nextInt();
			while(a!=0)
				{
					rem=a%10;
					Sum=Sum+rem;
					a=a/10;
				}
				System.out.println("Sum is"+Sum);
			}
}
			