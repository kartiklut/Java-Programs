class Main
{
	public static void main(String args[])
		{	
			String S1="Abcd";
			String S2="abcd";
			System.out.println(S1.charAt(2));
			System.out.println(S1.length());
			System.out.println(S1.toUpperCase());
			System.out.println(S1.toLowerCase());
			System.out.println(S1.equals(S2));
			System.out.println(S1.equalsIgnoreCase(S2));
			System.out.println(S1.concat(S2));
			System.out.println(S1.compareTo(S2));
			System.out.println(S1.substring(1,3));
			System.out.println(S1.substring(1));
			byte b[]=S1.getBytes();
			for(int i=0;i<b.length;i++)
			{
				System.out.println(b[i]);
			}
			char ch[]=S1.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
					System.out.println(ch[i]);
			}
			String S3="W elcome el to Java";
			System.out.println(S3.indexOf('e'));
			System.out.println(S3.indexOf("el"));
			System.out.println(S3.lastIndexOf("el"));
			
			
			
		}
}
			