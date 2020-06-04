import java.util.*;
class Array
{
	public static void main(String args[])
		{
			int a[]=new int[5];
			int b[];
			Scanner S1=new Scanner(System.in);
			for(int i=0;i<5;i++)
				{
					System.out.print("\n\tEnter value of array  : ");
					a[i]=S1.nextInt();
				}
			b=a;	
			for( int i=0;i<5;i++)
				{
					System.out.println("Value are : "+b[i]);
				}
			}
}