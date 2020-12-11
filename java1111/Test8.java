import java.lang.String;
public class Test8
{
	public static void main(String args[])
	{
		int arr[]=new int[10];
		int a=20;
		int b=0;
		try
		{
			System.out.println("before exception");
			arr[20]=20;
			int c = a/b;
			System.out.println("after exception="+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception 1"+ e.getMessage());
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("exception 2"+ e1.getMessage());
			e1.printStackTrace();
		}
		catch(Exception e2)
		{
			System.out.println("Exception"+e2.getMessage());
		}
		finally
		{
			System.out.println("Finally block");
		}
		System.out.println("*****program done*****");	 
	}
}