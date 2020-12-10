public class Employee2
{
	private int eid;
	public float salary;
	private char gender;
	
	public Employee2() //constructor
	{
		this.eid=1;
		this.salary=11;
		this.gender='M';
		System.out.println("calling comstructor without args");
	}
	
	public Employee2(int eid,float salary,char gender) //constructor
	{
		this.eid= eid;
		this.salary = salary;
		this.gender= gender;
		System.out.println("calling constructor args");
	}
	
	public void setEid(int id)
	{
		eid = id;
	}
	public int getEid()
	{
		return eid;
	}
}