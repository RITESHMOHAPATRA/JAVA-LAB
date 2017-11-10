import java.util.Scanner;
class BranchException extends Exception
{
	BranchException(String s)
	{
		super(s);
	}
}
class CustomException
{
	static void validate(String s)throws BranchException
	{
		switch(s)
		{
			case "CSE" : 
			case "CE" : 
			case "IT" : 
			case "EEE" : 
			case "ETC" : System.out.println("welcome");
						  break;
			default : throw new BranchException("go to hell");
		}
	}	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter branch");
		String s = scan.nextLine();
		try{
			validate(s);
		}
		catch(BranchException e){
			System.out.println(e);
		}
		System.out.println("rest of code");
	}
}