class InvalidMarksException extends Exception
{
	public String toString()
		{
			return "marks should be between 0-100";
		}
}
class Student
{
	int marks;
	void setMarks(int m)throws Exception
		{
			if(m<0 || m>100)
				throw new InvalidMarksException();
			else
				marks=m;
		}
	void enquiry()
		{
			System.out.println("Marks : "+marks);
		}
}
class main
{
	public static void main(String args[])
		{	
		try	
			{
				Student S1=new Student();
				S1.setMarks(90);
				S1.enquiry();
			}
		catch(Exception e) /*   OR    InvalidMarksException e*/
			{
				System.out.println(e);
			}
		}
}