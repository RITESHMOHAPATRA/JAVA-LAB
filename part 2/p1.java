class Constructor
{
	int a;
	Constructor()
	{
		a = 10;
	}
	Constructor(int x)//here constructor overloading is implemented
	{
		this();//constructor chaining is implemented
		a = a+x;
	}
	void show()
	{
		System.out.println("value of a = "+a);
	}
	public static void main(String args[])
	{
		Constructor obj = new Constructor();//
		Constructor obj1 = new Constructor(5);
		obj.show();
		obj1.show();
		
	}
	
}