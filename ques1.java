import java.util.*;
class Main
{
	public static void main(String args[])
	{
		int arr[]=new int[6];
		int temp=0;
		int new_array[]=new int[6];
		int len=arr.length;
		System.out.println("Enter numbers in array");
		Scanner S1=new Scanner(System.in);
		for(int i=0;i<=5;i++)
		{
			arr[i]=S1.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Original Array is"+arr[i]);
		}
		System.out.println(len);
		for(int i=0;i<arr.length;i++)
		{
			temp=arr[i];
			new_array[len-1]=temp;
			len--;
		}
		for(int i=0;i<new_array.length;i++)
		{
			System.out.println("Sorted Array is"+new_array[i]);
		}
		
	}
}