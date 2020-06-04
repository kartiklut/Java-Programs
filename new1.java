class Student
{
	int rollno;
	String name;
	Student(int rn,String nm)
	{
		rollno=rn;
		name=nm;
	}
	public String toString()
	{
		return rollno+"\t"+name;
	}
}
class Test
{
public static void main(String args[])
{
	Student S1=new Student(100,"aaaa");
	Student S2=new Student(200,"aaaaaaaaaaaa");
	System.out.println(S1);
	System.out.println(S2);
}
}