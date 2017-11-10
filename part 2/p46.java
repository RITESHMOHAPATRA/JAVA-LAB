class CopyConstructor
{
	int a,b ;
	CopyConstructor()
	{
		 a = 10;
		 b = 20;
	}
	CopyConstructor(CopyConstructor temp)
	{
		this.a = temp.a;
		this.b = temp.b;
	}
	public static void main(String args[])
	{
		CopyConstructor obj = new CopyConstructor();
		obj.a = obj.a+1;
		obj.b = obj.b+1;
		CopyConstructor obj2 = new CopyConstructor(obj);
		System.out.println("new object a "+obj2.a);
		System.out.println("new object b "+obj2.b);
	}
	
}