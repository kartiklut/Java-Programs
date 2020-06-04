class Area
{
		int a,b,c,res;
		String type;
		Area(int a)
		{
			this.a=a;
			type="Square";
		}
		Area(int a,int b)
		{
			this.a=a;
			this.b=b;
			type="Rectangle";
		}
		Area(int a,int b,int c)
		{
				this.a=a;
				this.b=b;
				this.c=c;
				type="Triangle";
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
			if(type=="Triangle")
			{
				int S=(a+b+c)/2;
				res=(int)(Math.sqrt(S*(S-a)*(S-b)*(S-c)));
			}
		}
		void show()
		{
			System.out.println("Area of "+type+" is"+res);
		}
}
class Main
{
	public static void main(String args[])
	{
			Area a1=new Area(10);
			a1.calc();
			a1.show();
			Area a2=new Area(10,20);
			a2.calc();
			a2.show();
			Area a3=new Area(3,4,5);
			a3.calc();
			a3.show();
	}
}