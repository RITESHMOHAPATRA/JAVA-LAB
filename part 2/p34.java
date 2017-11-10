class Parent
{
	int a  ;
	Parent(int x)
	{
		a = x;
	}
}
class Child extends Parent
{
	Child(int x)
	{
		super(x);
	}
	public static void main(String args[])
	{
		Child obj = new Child(5);
		System.out.println(obj.a);
	}
}