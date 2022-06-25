class Employee{
	//class level variables
	private String empId;
	private String empName;
	private float empSal;
	private String empAddr;
	
	public void setEmpId(String empId){
		this.empId = empId;
	}
	
	public void setEmpName(String empName){
		this.empName = empName;
	}
	
	public void setEmpSal(float empSal){
		this.empSal = empSal;
	}
	public void setEmpAddr(String empAddr){
		this.empAddr = empAddr;
	}
	
	public String getEmpId(){
		return empId;
	}
	
	public String getEmpName(){
		return empName;
	}
	
	public float getEmpSal(){
		return empSal;
	}
	
	public String getEmpAddr(){
		return empAddr;
	}
	
	
}

class TestEmployee{
	public static void main(String[] args){
		Employee emp = new Employee();
		emp.setEmpId("EC101");
		emp.setEmpName("Deepika");
		emp.setEmpSal(596873.90f);
		emp.setEmpAddr("Bangalore");
		
		System.out.println("The employee details are: ");
		System.out.println("------------------------------------------------------");
		System.out.println("The Employee Id is: " + emp.getEmpId());
		System.out.println("The Employee Name is : " + emp.getEmpName());
		System.out.println("The Employee Salary is : " + emp.getEmpSal());
		System.out.println("The Employee Address is : " + emp.getEmpAddr());
	}
}