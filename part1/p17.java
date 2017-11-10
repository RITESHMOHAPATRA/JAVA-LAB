class Primeno
{
	public static void main(String[] args)
	{
		for(int i =2;i<=1000;i++)
		{
			int f=1;
			for(int j=2;j<(i/2);j++)
			{
				if(i%j==0)
				{
					f=0;
					break;
				}
			}
			if(f==1)
				System.out.println(i);
		}
	}
}