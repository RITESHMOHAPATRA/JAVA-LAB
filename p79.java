import java.util.Scanner;
class Search
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter " +n+" elements :");
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		System.out.println("Choose Searching Technique :");
		System.out.println("1 : Linear Search");
		System.out.println("2 : Binary Search");
		System.out.print("Your Choice : ");
		int choice = sc.nextInt();
		System.out.println("Enter the element to be searched : ");
		int s = sc.nextInt();
		switch(choice)
		{
			case 1: linear(a,s);
					break;
			case 2: binary(a,s);
					break;
			default : System.out.println("Invalid Choice !");
		}
	}
	static void binary(int a[],int toSearch)
	{
	  int startIndex = 0;  
	  int endIndex = a.length - 1;  
	  int midindex = (startIndex + endIndex) / 2;  
	  int midElement = a[midindex];  
	  int foundIndex = -1;  
	  
	  while (startIndex <= endIndex) 
	    {  
		   if (midElement < toSearch) 
		   {  
		    startIndex = midindex + 1;  
		    midindex = (startIndex + endIndex) / 2;  
		    midElement = a[midindex];  
		   } 
		   else if (midElement > toSearch) 
		   {  
		    endIndex = midindex - 1;  
		    midindex = (startIndex + endIndex) / 2;  
		    midElement = a[midindex];  
		   } 
		   else 
		   {  
		    foundIndex = midindex;  
		    break;  
		   }
		}  
		if(foundIndex==-1)
			System.out.println("no not found");
		else
			System.out.println("no found at "+(foundIndex+1)+" th position");
	}

	static void linear(int a[],int toSearch)
	{
		  int foundIndex = -1;  
		  for (int i = 0; i < a.length; i++) 
		  {  
			   if (a[i] == toSearch) 
			   {  
			    foundIndex = i;  
			   }  
		  }  
		  if(foundIndex==-1)
			System.out.println("no not found");
		  else
			System.out.println("no found at "+(foundIndex+1)+" th position");
	}
}
