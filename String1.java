class StringTest
{
	public static void main(String args[])
		{
			String S1="abcd";   //internally create the object in the Constant pool which is immutable 
			String S2="abcd";
			String S3=new String("abcd"); //Created object in Heap Memory Area
			String S4=new String("abcd");
			System.out.println(S1);
			System.out.println(S2);
			System.out.println(S3);
			System.out.println(S4);
			System.out.println(S1==S2);
			System.out.println(S2==S3);
			System.out.println(S4==S3);
			S1="def";
			System.out.println(S1);
			System.out.println(S1==S2); //Objects in the Constant pool memory area is immutable
			
		}
	}
			