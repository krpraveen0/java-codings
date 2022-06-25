package Bank;

public class Employee{
	private int eno;
	private String ename;
	private float esal;
	private String eaddr;
	private Account acc;
	// public Employee(int eno,String ename, float esal,String eaddr, Account acc){
		// this.eno = eno;
		// this.ename = ename;
		// this.esal = esal;
		// this.eaddr = eaddr;
		// this.acc = acc;
	// }
	
	//setter methods
	public void setEno(int eno){
		this.eno = eno;
	}
	public void setEname(String ename){
		this.ename = ename;
	}
	public void setEsal(float esal){
		this.esal = esal;
	}
	public void setEaddr(String eaddr){
		this.eaddr = eaddr;
	}
	public void setAcc(Account acc){
		this.acc = acc;
	}
	
	//getter methods
	public int getEno(){
		return eno;
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
	public Account getAcc(){
		return acc;
	}
	
	
	public void getEmpDetails(){
		System.out.println("Employee Details");
		System.out.println("........................");
		System.out.println("Employee Number is : " + getEno());
		System.out.println("Employee name is : " + getEname());
		System.out.println("Employee Salary is : " + getEsal());
		System.out.println("Employee Address is : " + getEaddr());
		System.out.println(" Account Details: ");
		System.out.println("-------------------------------------");
		System.out.println("Employee Account Number is : " + acc.getAccNo());
		System.out.println("Account Holder Name: " + acc.getAccHolderName());
		System.out.println("Account Type is : " + acc.getAccType());
		System.out.println("Account Balance is : " + acc.getAccBalance());
	}
}