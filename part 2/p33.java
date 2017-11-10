class A
{
	void cal(double x)
	{
				System.out.println("square value="+(x*x));
	}
}
class B extends A
{
	void cal(double x)
	{
				System.out.println("square root="+Math.sqrt(x));
	}
	void cal(int x)
	{
				System.out.println("square root="+Math.sqrt(x));
	}
}
class Polymorphism
{
      public static void main(String args[])
      {
            A a=new A();
			a.cal(10);
            a.cal(15.44);          
	  }
  }                   
