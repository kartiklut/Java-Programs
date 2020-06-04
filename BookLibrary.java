class Book
{
	int id;
	String name;
	String author;
	int price;
	int status;
	
	void entry(int idd , String nm ,String auth ,int pri)
	{
		id=idd;
		name=nm;
		author=auth;
		price=pri;
		status=1;
	}
	void issue()
	{
		if(status==1)
		{
			System.out.println("Book Successfuly Issued");
			status=0;
		}
		else
		{
			System.out.println("Book is alreaddy Issued");
		}
	}
	void submit()
	{
		if(status==0)
		{
			System.out.println("Submitted");
			status=1;
		}
		else
		{
			System.out.println("Book is already Submitted");
		}
	}
	
	void enquiry()
	{
		System.out.println("Id is  "+id);
		System.out.println("Name "+name);
		System.out.println("Author "+author);
		System.out.println("Price "+price);
		if(status==0)
		{
			System.out.println("Book is issued");
		}
		else
		{	
			System.out.println("Book is available in the Library");
		}
	}
	}

class Main
	{
		public static void main(String args[])
			{
				Book b1=new Book();
				b1.entry(1001,"Kartik","Luthra",1212);
				b1.issue();
				b1.submit();
				b1.enquiry();
			}
	}	