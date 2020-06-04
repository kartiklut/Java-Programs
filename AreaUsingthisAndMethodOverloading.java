class Area
{
	int a,b,c,res;
	String type;
	
	void setDim(int a)
	{
		this.a=a;
		type="Square";
	}
	void setDim(int a,int b)
	{
		this.a=a;  
		this.b=b;
		type="Rectangle";
	}
	void setDim(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		type="triangle";
	}
	void calc()
	{
		if(type=="Square")
			{
				res=a*a;
			}
		if(type=="Rectangle")
			{
				res=a*b;
			}
		if(type=="triangle")
			{
				int S=(a+b+c)/2;
				res=(int)(Math.sqrt(S*(S-a)*(S-b)*(S-c)));
			}
	}
	void result()
	{
		System.out.println("Area of " +type+" is "+res);
	}
}
class Main
{
	public static void main(String args[])
		{
			Area a1=new Area();      //here we can also make one object and call the function    with it only no need to create three objects just pass the arguments according to the setDim function the result will be same
			a1.setDim(10);
			a1.calc();
			a1.result();
			Area a2=new Area();
			a2.setDim(10,20);
			a2.calc();
			a2.result();
			Area a3=new Area();
			a3.setDim(4,5,6);
			a3.calc();
			a3.result();
		}
}
