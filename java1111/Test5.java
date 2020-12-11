public class Test5
{
	
	public static void main(String args[])
	{
		Singleton x=Singleton.getObject();
		Singleton y=Singleton.getObject();
		Singleton z=Singleton.getObject();
		
		x.s=(x.s).toUpperCase();
		
		System.out.println();
		System.out.println(x.s);
		System.out.println(x.s);
		System.out.println(x.s);
		
		System.out.println();
		
		y.s=(y.s).toLowerCase();
		System.out.println(y.s);
		System.out.println(y.s);
		System.out.println(y.s);
		
	}
}

