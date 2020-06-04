import java .util.*;
class Array
{
	public static void main(String args[])
		{
			int a[][]=new int [3][5];
			int b[]={1,2,3,4,5,6,7,8,9};
			Scanner S1=new Scanner(System.in);
			for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a[i].length;j++)
					{
						System.out.print("Enter Value ");
						a[i][j]=S1.nextInt();
					}
				}
			a[0]=b;
			for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a[i].length;j++)
					{
						System.out.print(a[i][j]+" " );
					}
					System.out.println("\n");
				}
			}
}
					