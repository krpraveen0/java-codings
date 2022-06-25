package Bank;

public class Employee{
	int eno;
	String ename;
	float esal;
	String eaddr;
	Account acc;
	public Employee(int eno,String ename, float esal,String eaddr, Account acc){
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.eaddr = eaddr;
		this.acc = acc;
	}
	
	public void getEmpDetails(){
		System.out.println("Employee Details");
		System.out.println("........................");
		System.out.println("Employee Number is : " + eno);
		System.out.println("Employee name is : " + ename);
		System.out.println("Employee Salary is : " + esal);
		System.out.println("Employee Address is : " + eaddr);
		System.out.println(" Account Details: ");
		System.out.println("-------------------------------------");
		System.out.println("Employee Account Number is : " + acc.accNo);
		System.out.println("Account Holder Name: " + acc.accHolderName);
		System.out.println("Account Type is : " + acc.accType);
		System.out.println("Account Balance is : " + acc.accBalance);
	}
}