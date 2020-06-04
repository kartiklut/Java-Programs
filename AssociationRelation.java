class Student 
{
	int rollno;
	String name;
	Book b1;
Student (int rollno,String name)
{
	this.rollno=rollno;
	this.name=name;
	b1=new Book("let us C");      	 
	/*Book b1=new Book("let us C"); because of its visiblity only in constructor orrrr if b1=new Book("let us C");  not witten here then it willl compile it successfully and then given error in jvm OUTPUT
	F:\Programs>java Main
	10001   ABCD
	Exception in thread "main" java.lang.NullPointerException
        at Student.show(AssociationRelation.java:15)
        at Main.main(AssociationRelation.java:35)*/
}
void show()
{
	System.out.println(rollno+"\t"+name);
	b1.show();
}
}
class Book
{
	String name;
	Book(String nm)
	{
		name=nm;
	}
	void show()
	{
	System.out.println("Book name:"+name);
	}
}
class Main
{
	public static void main(String args[])
	{
			Student S1=new Student(10001,"ABCD");
			S1.show();
			Book b1=new Book("let us C");
			b1.show();
	}
}

	