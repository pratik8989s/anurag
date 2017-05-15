
public class Employee {

	private int empid;
	private String ename;
	private int sal;
	
    static int eid=1001;
    
	
	public Employee(String ename, int sal) {
		super();
	    this.empid=eid;
		this.ename = ename;
		this.sal = sal;
		eid++;
		
	}


	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}


	static void myMethod()
	{
		eid=100;
		System.out.println("I am Static Method");
	}
	
	/*void calculate()
	{
		empid=100;
		
	}*/
	
	static{
		eid=10001;
		System.out.println("I am static block");
	}
	
	
	@Override
	public String toString() {
		//return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal
			//	+ "]";
	return "Employee is id: "+empid+" Employee sal is: "+sal+" Employee name is: "+ename;
	}


	
	
	
	
	
	
}
