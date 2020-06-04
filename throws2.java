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
	public static void main(String args[])throws Exception
		{	
			Student S1=new Student();
			S1.setMarks(190);
			S1.enquiry();
			//System.out.println(e);
		}
}