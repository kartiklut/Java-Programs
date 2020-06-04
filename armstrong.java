import java.util.Scanner;
class S1
{
	public static void main(String args[])
		{	
			int arm=0,rem,b;
			System.out.println("Enter the number to get its reverse");
			Scanner S1=new Scanner(System.in);
			int a=S1.nextInt();
			b=a;
			while(a!=0)
				{
					rem=a%10;
					arm=arm+(rem*rem*rem);
					a=a/10;
				}
				if(b==arm)
				{
					System.out.println("Yes it is armstrong");
				}
				else
				{
						System.out.println("No it is not armstrong");
				}
			}
}
			