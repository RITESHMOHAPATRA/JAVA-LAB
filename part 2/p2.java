class Singleton
{
	private static Singleton single_instance = null;
	public String s ;
	private Singleton()
	{
		s = "hello";
	}
	public static Singleton getInstance()
	{
		if(single_instance==null)
		{
			single_instance =  new Singleton();
		}
		return single_instance;
	}
	
}
class SingletonMain
{
	public static void main(String args[])
	{
		Singleton obj =  Singleton.getInstance();
		Singleton obj1 =  Singleton.getInstance();
		Singleton obj2 =  Singleton.getInstance();
		
		System.out.println("Object 1 's instance value "+obj.s);
		System.out.println("Object 2 's instance value "+obj1.s);
		System.out.println("Object 3 's instance value "+obj2.s);
		
		obj.s = obj.s+" java";
		
		System.out.println("Object 1 's instance value after change"+obj.s);
		System.out.println("Object 2 's instance value after cahnge"+obj1.s);
		System.out.println("Object 3 's instance value after change"+obj2.s);
	}
}
