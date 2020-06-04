class Animal
{
	void run()
	{
		System.out.println("Run in Animal");
	}
	void sleep()
	{
		System.out.println("Sleep in Animal");
	}
}
class Dog extends Animal
{
	void run()
	{
		System.out.println("Run in Dog");
	}
	void eat()
	{
		System.out.println("Eat in Dog");
	}
}
class Cat extends Animal
{
	void sleep()														
	{
		System.out.println("Sleep in cat");
	}
	void drink()
	{
		System.out.println("Drink in Cat");
	}
}
/*class Forest
{
	void discovery(Animal a1)
	{
		a1.run();
		a1.sleep();
		//a1.eat();
		//a1.drink();
	}
}*/
class M
{
	public static void main(String args[])
	{
		Animal a1=new Dog();
		Animal a2=new Cat();
		if(a1 instanceof Dog)
		{
			a1.run();
			a1.sleep();
			//a1.eat();
		}
		if(a2 instanceof Cat)
		{
			a2.sleep();
			//a2.drink();
			a2.run();
		}
	/*	Forest f1=new Forest();
		f1.discovery(d1);
		f1.discovery(c1);*/
	}
}