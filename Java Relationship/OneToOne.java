class Account{
	String accNo;
	String accName;
	String accType;
	Account(String accNo, String accName, String accType){
		this.accNo = accNo;
		this.accName = accName;
		this.accType = accType;
	}
}

class Employee{
	String eId;
	String eName;
	String eAddr;
	Account acc;
	Employee(String eId, String eName, String eAddr, Account acc){
		this.eId = eId;
		this.eName = eName;
		this.eAddr = eAddr;
		this.acc = acc;
	}
	public void getEmployee(){
		System.out.println("Employee Details");
		System.out.println("..........................");
		System.out.println("Employee Id: " + eId);
		System.out.println("Employee Name: " + eName);
		System.out.println("Employee Address: " + eAddr);
		System.out.println();
		System.out.println("Account Details");
		System.out.println("..........................");
		System.out.println("Account Number : " + acc.accNo);
		System.out.println("Account Name : " + acc.accName);
		System.out.println("Account Type : " + acc.accType);
		
	}
}

class OneToOne{
	public static void main(String[] args){
		Account acc = new Account("847387460469702","Deepika","Savings");
		Employee emp = new Employee("101", "Deepika", "Bangalore", acc);
		emp.getEmployee();
	}
}