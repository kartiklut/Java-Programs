class Student
{
	int rollno;
	String name;
	int marks;
	char grade;

void admission(int rn , String nm)
{
		rollno=rn;
		name=nm;
}
void setmarks(int m)
{
	marks=m;
}
void setgrade()
{
	if(marks>90)
	{	
		grade='A';
	}
	else if(marks>75)
	{
		grade='B';
	}
	else if(marks>50)
	{
		grade='C';
	}
	else
	{
		grade='D';
	}
}
void marksheet()
{
	System.out.println("Roll NO "+rollno);
	System.out.println("NAme "+name);
	System.out.println("Grade " +grade);
	System.out.println("Marks "+marks);
}
}
class Main
{
		public static void main(String args[])
		{
				Student S1=new Student();
				S1.marksheet();
				S1.admission(1001,"Kartik");
				S1.setmarks(85);
				S1.setgrade();
				S1.marksheet();
				Student S2=new Student();
				S2.admission(1002,"Luthra");
				S2.setmarks(87);
				S2.setgrade();
				S2.marksheet();
		}
}