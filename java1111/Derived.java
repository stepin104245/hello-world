public class Derived extends Base
{
		public Derived(int id)
		{
			super(10);
			System.out.println("Derived::Derived");
		}
		public void display()
		{
			System.out.println("this is derive class");
			super.display();
		}
		
}