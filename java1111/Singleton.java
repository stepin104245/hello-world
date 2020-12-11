public class Singleton
{
	private static Singleton Object = null;
	
	public String s;
	
	private Singleton()
	{
		s = "ltts IS a ORGANISATION";
	}
	public static Singleton getObject()
	{
		if(Object==null)
		{
		Object=new Singleton();
		
		}
		return Object;
	}
	
	
}