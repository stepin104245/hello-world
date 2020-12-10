public class Test1
{
		public static void main(String args[])
		{
			Employee1 e =new Employee1();
			//e.eid=10;
			e.setEid();
			e.salary = 111.11f;
			e.gender = 'f';
			System.out.println(e.getEid());
			System.out.println(e.salary);
			System.out.println(e.gender);
		}
}


