class Employee{
	//variables/ states of a class
	private int emp_no;
	private String ename;
	private float esal;
	private String eaddr;
	
	//Mutator methods
	public void setEmp_no(int empNo){
		emp_no = empNo;
	}
	public void setEname(String empName){
		ename = empName;
	}
	public void setEsal(float empSal){
		esal = empSal;
	}
	public void setEaddr(String empAddr){
		eaddr = empAddr;
	}
	
	//Accessor methods
	public int getEmp_no(){
		return emp_no;
	}
	public String getEname(){
		return ename;
	}
	public float getEsal(){
		return esal;
	}
	public String getEaddr(){
		return eaddr;
	}
	
}

class Test{
	public static void main(String[] args){
		//creating an object of Employee class
		Employee emp = new Employee();
		
		//setting the object data using mutators
		emp.setEmp_no(123);
		emp.setEname("Deepika");
		emp.setEsal(500000.0f);
		emp.setEaddr("Bangalore India");
		
		//accessing the object data using accessors 
		System.out.println(emp.getEmp_no());
		System.out.println(emp.getEname());
		System.out.println(emp.getEsal());
		System.out.println(emp.getEaddr());
		
		
		
	}
}